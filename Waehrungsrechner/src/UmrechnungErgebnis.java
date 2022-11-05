public class UmrechnungErgebnis {
    private double zielbetrag;
    private final Waehrungen ausgangswaehrung = Waehrungen.EUR;
    protected Waehrungen zielwaehrung;
    private double ausgangsbetrag;

    public double getZielbetrag() {
        return zielbetrag;
    }

    public void setZielbetrag(double zielbetrag) {
        this.zielbetrag = zielbetrag;
    }

    public String getAusgangswaehrungCode() {
        return ausgangswaehrung.getCode();
    }

    public String getAusgangswaehrungName() {
        return ausgangswaehrung.getWaehrungName();
    }

    public String getZielwaehrungCode() {
        return zielwaehrung.getCode();
    }

    public String getZielwaehrungName() {
        return zielwaehrung.getWaehrungName();
    }

    public void setZielwaehrung(String zielwaehrung) {
        for(Waehrungen w : Waehrungen.values()) {
            if(w.getCode().equalsIgnoreCase(zielwaehrung)) {
                this.zielwaehrung = w;
            }
        }
    }

    public double getAusgangsbetrag() {
        return ausgangsbetrag;
    }

    public void setAusgangsbetrag(double ausgangsbetrag) {
        this.ausgangsbetrag = ausgangsbetrag;
    }

    @Override
    public String toString() {
        return "\nAusgangswaehrung: " + this.getAusgangswaehrungName() +
                "\nAusgangsbetrag: " + this.getAusgangsbetrag() +
                "\nZielwaehrung: " + this.getZielwaehrungName() +
                "\nZielbetrag: " + this.getZielbetrag();
    }
}
