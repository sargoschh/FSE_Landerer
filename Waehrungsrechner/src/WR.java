import java.util.ArrayList;
import java.util.List;

public abstract class WR implements IUmrechnen {

    private IUmrechnen nextConverter;
    private double zielbetrag;
    private final Waehrungen ausgangswaehrung = Waehrungen.EUR;
    protected String zielwaehrung;
    private double ausgangsbetrag;
    private List<Observer> observerList = new ArrayList<>();

    public double umrechnen(String variante, double betrag){

        if(this.zustaendig(variante)) {
            this.ausgangsbetrag = betrag;
            this.zielbetrag = betrag * this.getFaktor();
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

    public double getZielbetrag() {
        return zielbetrag;
    }

    public void setZielbetrag(double zielbetrag) {
        this.zielbetrag = zielbetrag;
    }

    public String getAusgangswaehrungBeschreibung() {
        return ausgangswaehrung.getWaehrungName();
    }

    public String getAusgangswaehrungCode() {
        return ausgangswaehrung.getCode();
    }

    public String getZielwaehrung() {
        return zielwaehrung;
    }

    public double getAusgangsbetrag() {
        return ausgangsbetrag;
    }

    public void setAusgangsbetrag(double ausgangsbetrag) {
        this.ausgangsbetrag = ausgangsbetrag;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }
}
