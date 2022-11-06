/**
 * Unterklasse von AWR. Sorgt für die Umrechnung von Euro in Brasilianische Real.
 */
public class EURO2BrReal extends AWR {

    /**
     * Die statische Klasse Builder wird dazu verwendet, ein Objekt vom Typ EURO2BrReal
     * zu erstellen. Der Builder kann nur auf EURO2BrReal angewendet werden.
     */
    public static class Builder{

        private AWR nextConverter;
        private double faktor;

        /**
         * Setzt den nächsten Rechner
         * @param converter nächster Währungsrechner
         * @return liefert dieses Objekt zurück
         */
        public Builder setNextConverter(AWR converter){
            this.nextConverter = converter;
            return this;
        }

        /**
         * Setzt den Faktor
         * @param faktor Faktor als Double
         * @return liefert dieses Objekt zurück
         */
        public Builder setFaktor(double faktor){
            this.faktor = faktor;
            return this;
        }

        /**
         * Erstellt ein neues WährungsrechnerObjekt.
         * @return Währungsrechner
         */
        public AWR build(){
            AWR converter = new EURO2BrReal();
            converter.setNextConverter(this.nextConverter);
            converter.setFaktor(this.faktor);
            return converter;
        }
    }
    private final Waehrungen real = Waehrungen.BRL;
    private double kursReal = 4.9624;

    @Override
    public double getFaktor() {
        return this.kursReal;
    }

    @Override
    public void setFaktor(double faktor) {
        this.kursReal = faktor;
    }

    /**
     * Prüft, ob der brasilianische Real der gewünschten Zielwährung entspricht
     * @param variante gewünschte Zielwährung als String
     * @return true oder false
     */
    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.real.getCode())) {
            return true;
        } else {
            return false;
        }
    }
}
