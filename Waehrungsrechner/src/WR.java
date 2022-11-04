public abstract class WR implements IUmrechnen {

    private IUmrechnen nextConverter;
    private double zielbetrag;
    private String ausgangswaehrung;
    private String zielwaehrung;
    private double ausgangsbetrag;

    public double umrechnen(String variante, double betrag){

        if(this.zustaendig(variante)) {
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

    public String getAusgangswaehrung() {
        return ausgangswaehrung;
    }

    public void setAusgangswaehrung(String ausgangswaehrung) {
        this.ausgangswaehrung = ausgangswaehrung;
    }

    public String getZielwaehrung() {
        return zielwaehrung;
    }

    public void setZielwaehrung(String zielwaehrung) {
        this.zielwaehrung = zielwaehrung;
    }

    public double getAusgangsbetrag() {
        return ausgangsbetrag;
    }

    public void setAusgangsbetrag(double ausgangsbetrag) {
        this.ausgangsbetrag = ausgangsbetrag;
    }
}
