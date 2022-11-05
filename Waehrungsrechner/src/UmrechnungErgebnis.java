public class UmrechnungErgebnis implements IWVerwaltung{

    public static class Builder{
        private double ausgangsbetrag;
        private double zielbetrag;
        protected String zielwaehrung;

        public Builder setZielbetrag(double zielbetrag) {
            this.zielbetrag = zielbetrag;
            return this;
        }

        public Builder setZielwaehrung(String zielwaehrung) {
            this.zielwaehrung = zielwaehrung;
            return this;
        }

        public Builder setAusgangsbetrag(double ausgangsbetrag) {
            this.ausgangsbetrag = ausgangsbetrag;
            return this;
        }

        public UmrechnungErgebnis build(){
            UmrechnungErgebnis ergebnis = new UmrechnungErgebnis();
            ergebnis.setAusgangsbetrag(this.ausgangsbetrag);
            ergebnis.setZielwaehrung(this.zielwaehrung);
            ergebnis.setZielbetrag(this.zielbetrag);
            return ergebnis;
        }


    }
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

    public String formatDouble(double betrag){

        return String.format("%.2f", betrag);
    }

    public String getMessage() {
        return "Ausgangswaehrung: " + this.getAusgangswaehrungName() +
                "\nAusgangsbetrag: " + this.formatDouble(this.getAusgangsbetrag()) +
                "\nZielwaehrung: " + this.getZielwaehrungName() +
                "\nZielbetrag: " + this.formatDouble(this.getZielbetrag());
    }
}
