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
            this.addErgebnis(betrag, zielbetrag, variante, this.getFaktor());
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

    public void addObserver(AObserver observer) {
        observer.addUmrechner(this);
        this.observerList.addObserver(observer);
    }

    public void updateObserver() {
        for(AObserver o : this.observerList.getListObserver()) {
            o.update();
        }
    }

    public void addErgebnis(UmrechnungErgebnis ergebnis) {
        this.ergebnisList.addErgebnis(ergebnis);
    }

    public void addErgebnis(double ausgangsbetrag, double zielbetrag, String zielwaehrung, double faktor) {
        UmrechnungErgebnis ergebnis = new UmrechnungErgebnis.Builder()
                .setZielbetrag(zielbetrag)
                .setZielwaehrung(zielwaehrung)
                .setAusgangsbetrag(ausgangsbetrag)
                .setFaktor(faktor)
                .build();
        this.ergebnisList.addErgebnis(ergebnis);
    }

    public List<UmrechnungErgebnis> getErgebnisse(){
        return this.ergebnisList.getErgebnisList();
    }
}
