import java.util.ArrayList;
import java.util.List;

public abstract class WR implements IUmrechnen, IFaktor, IWVerwaltung {

    private IUmrechnen nextConverter;
    private UmrechnungErgebnisList ergebnisList;
    private ObserverList observerList;

    public double umrechnen(String variante, double betrag){

        if(this.zustaendig(variante)) {
            this.ausgangsbetrag = betrag;
            this.zielbetrag = betrag * this.getFaktor();
            this.updateObserver();
            return this.zielbetrag;
        } else if(this.nextConverter != null){
            return this.nextConverter.umrechnen(variante, betrag);
        } else {
            return 0;
        }
    }

    public void setNextConverter(IUmrechnen nextConverter) {
        this.nextConverter = nextConverter;
    }

    public void addObserver(IObserver observer) {
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
}
