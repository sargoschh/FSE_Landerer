/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Klasse hat nur Methoden, die das
 * UmrechnungErgebnis betreffen
 */
public class UmrechnungErgebnis implements IWVerwaltung{

    /**
     * Die statische Klasse Builder wird dazu verwendet, ein Objekt vom Typ Umrechnungsergebnis
     * zu erstellen. Der Builder kann nur auf UmrechnungErgebnis angewendet werden.
     */
    public static class Builder{
        private double ausgangsbetrag;
        private double zielbetrag;
        private String zielwaehrung;
        private double faktor;

        /**
         * Setzt den Zielbetrag des Ergebnis.
         * @param zielbetrag Zielbetrag als Double
         * @return liefert dieses Objekt zurück
         */
        public Builder setZielbetrag(double zielbetrag) {
            this.zielbetrag = zielbetrag;
            return this;
        }

        /**
         * Setzt die Zielwährung des Ergebnis.
         * @param zielwaehrung Zielwährung als String
         * @return liefert dieses Objekt zurück
         */
        public Builder setZielwaehrung(String zielwaehrung) {
            this.zielwaehrung = zielwaehrung;
            return this;
        }

        /**
         * Setzt den Ausgangsbetrag
         * @param ausgangsbetrag Ausgangsbetrag als Double
         * @return liefert dieses Objekt zurück
         */
        public Builder setAusgangsbetrag(double ausgangsbetrag) {
            this.ausgangsbetrag = ausgangsbetrag;
            return this;
        }

        /**
         * Setzt den Faktor der Umrechnung
         * @param faktor Faktor als Double
         * @return liefert dieses Objekt zurück
         */
        public Builder setFaktor(double faktor){
            this.faktor = faktor;
            return this;
        }

        /**
         * Erstellt ein neues UmrechnungErgebnis Objekt
         * @return ergebnis als UmrechnungErgebnis
         */
        public UmrechnungErgebnis build(){
            UmrechnungErgebnis ergebnis = new UmrechnungErgebnis();
            ergebnis.setAusgangsbetrag(this.ausgangsbetrag);
            ergebnis.setZielwaehrung(this.zielwaehrung);
            ergebnis.setZielbetrag(this.zielbetrag);
            ergebnis.setFaktor(this.faktor);
            return ergebnis;
        }

    }
    private double zielbetrag;
    private final Waehrungen ausgangswaehrung = Waehrungen.EUR;
    private Waehrungen zielwaehrung;
    private double ausgangsbetrag;
    private double faktor;
    private boolean alreadyInLog = false;

    /**
     * Liefert den Zielbetrag
     * @return Zielbetrag als Double
     */
    @Override
    public double getZielbetrag() {
        return zielbetrag;
    }

    /**
     * Setzt den Faktor
     * @param faktor Faktor als Double
     */
    @Override
    public void setFaktor(double faktor) {
        this.faktor = faktor;
    }

    /**
     * Liefert den Faktor
     * @return Faktor als Double
     */
    @Override
    public double getFaktor() {
        return this.faktor;
    }

    /**
     * Setzt den Zielbetrag
     * @param zielbetrag Zielbetrag als Double
     */
    @Override
    public void setZielbetrag(double zielbetrag) {
        this.zielbetrag = zielbetrag;
    }

    /**
     * Liefert den Namen der Ausgangswährung
     * @return Ausgangswährung als String
     */
    @Override
    public String getAusgangswaehrungName() {
        return ausgangswaehrung.getWaehrungName();
    }

    /**
     * Liefert den Namen der Zielwährung
     * @return Zielwährung als String
     */
    @Override
    public String getZielwaehrungName() {
        return zielwaehrung.getWaehrungName();
    }

    /**
     * Setzt die Zielwährung. Dazu werden die vorhandenen Währungen durchiteriert.
     * Entspricht der Code der Zielwährung dem mitgegebenen String, wird die Währung
     * zugewiesen.
     * @param zielwaehrung Zielwährung als String
     */
    @Override
    public void setZielwaehrung(String zielwaehrung) {
        for(Waehrungen w : Waehrungen.values()) {
            if(w.getCode().equalsIgnoreCase(zielwaehrung)) {
                this.zielwaehrung = w;
            }
        }
    }

    /**
     * Liefert den Ausgangsbetrag
     * @return Ausgangsbetrag als Double
     */
    @Override
    public double getAusgangsbetrag() {
        return ausgangsbetrag;
    }

    /**
     * Setzt den Ausgangsbetrag
     * @param ausgangsbetrag Ausgangsbetrag als Double
     */
    @Override
    public void setAusgangsbetrag(double ausgangsbetrag) {
        this.ausgangsbetrag = ausgangsbetrag;
    }

    /**
     * Prüft, ob das Ergebnis bereits Gelogged wurde
     * @return true oder false
     */
    @Override
    public boolean isLogged() {
        this.alreadyInLog = true;
        return this.alreadyInLog;
    }

    /**
     * Liefert den Status des LOGs zurück
     * @return true oder false
     */

    public boolean isAlreadyInLog() {
        return this.alreadyInLog;
    }

    /**
     * Formatiert einen Doublewert, sodass dieser nur 2 Nachkommastellen hat
     * @param betrag als Double
     * @return Double formatiert in String mit 2 Nachkommastellen
     */
    public String formatDouble(double betrag){

        return String.format("%.2f", betrag);
    }

    public String getMessage() {
        return "Ausgangswaehrung: " + this.getAusgangswaehrungName() +
                "\nAusgangsbetrag: " + this.formatDouble(this.getAusgangsbetrag()) +
                "\nUmrechnungsfaktor: " + this.getFaktor() +
                "\nZielwaehrung: " + this.getZielwaehrungName() +
                "\nZielbetrag: " + this.formatDouble(this.getZielbetrag());
    }
}
