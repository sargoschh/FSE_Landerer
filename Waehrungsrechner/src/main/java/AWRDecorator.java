/**
 * Abstrakte Klasse WRDecorator dient als Mutterklasse für alle Decorator.
 */
/*
 * SOLID - Prinzip
 * S - wurde eingehalten - abstrakte Klasse hat nur Methoden, die den
 * Decorator betreffen
 */
public abstract class AWRDecorator extends AWR {

    private AWR decoratedConverter;

    public AWRDecorator(AWR decoratedConverter) {
        this.decoratedConverter = decoratedConverter;
    }

    /**
     * Rechnet den Ausgangsbetrag mit dem gewünschten Faktor in die neue Währung um. Die Unterklassen
     * werden diese Methode adaptieren.
     * @param variante gewünschte Zielwährung als String
     * @param betrag Ausgangsbetrag als double
     * @return Zielbetrag
     */
    public double umrechnen(String variante, double betrag){

        return this.decoratedConverter.umrechnen(variante, betrag);
    }

    /**
     * Liefert den aktuellen Faktor zurück
     * @return Faktor als Double
     */
    public double getFaktor(){return this.decoratedConverter.getFaktor();}

    /**
     * Setzt den Umrechnungsfaktor
     * @param faktor Umrechnungsfaktor als double
     */
    @Override
    public void setFaktor(double faktor) {
        this.decoratedConverter.setFaktor(faktor);
    }

    /**
     * Prüft, ob der aktuelle Rechner der gewünschten Variante entspricht.
     * @param variante gewünschte Zielwährung als String
     * @return true oder false
     */
    public boolean zustaendig(String variante) {
        return this.decoratedConverter.zustaendig(variante);
    }

}
