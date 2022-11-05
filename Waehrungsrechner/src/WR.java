import java.util.ArrayList;
import java.util.List;

public abstract class WR implements IUmrechnen, IFaktor{

    private WR nextConverter;
    private UmrechnungErgebnisList ergebnisList;
    private ObserverList observerList;

    public WR() {
        this.ergebnisList = new UmrechnungErgebnisList();
        this.observerList = new ObserverList();
    }

    public double umrechnen(String variante, double betrag){

        if(this.zustaendig(variante)) {
            double zielbetrag = betrag * this.getFaktor();
            this.addErgebnis(betrag, zielbetrag, variante);
            this.updateObserver();
            return zielbetrag;
        } else if(this.nextConverter != null){
            return this.nextConverter.umrechnen(variante, betrag);
        } else {
            return 0;
        }
    }

    public void setNextConverter(WR nextConverter) {
        this.nextConverter = nextConverter;
    }

    public void addObserver(IObserver observer) {
        observer.addUmrechner(this);
        this.observerList.addObserver(observer);
    }

    public void updateObserver() {
        for(IObserver o : this.observerList.getListObserver()) {
            o.update();
        }
    }

    public void addErgebnis(UmrechnungErgebnis ergebnis) {
        this.ergebnisList.addErgebnis(ergebnis);
    }

    public void addErgebnis(double ausgangsbetrag, double zielbetrag, String zielwaehrung) {
        UmrechnungErgebnis ergebnis = new UmrechnungErgebnis.Builder()
                .setZielbetrag(zielbetrag)
                .setZielwaehrung(zielwaehrung)
                .setAusgangsbetrag(ausgangsbetrag)
                .build();
        this.ergebnisList.addErgebnis(ergebnis);
    }

    public List<UmrechnungErgebnis> getErgebnisse(){
        return this.ergebnisList.getErgebnisList();
    }
}
