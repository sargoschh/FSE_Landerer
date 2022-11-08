/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Interface hat nur Methoden, die das
 * Verwalten des Umrechnungsergebnisses betreffen
 */
public interface IWVerwaltung {
    /**
     * Setzt den Faktor
     * @param faktor Faktor als Double
     */
    void setFaktor(double faktor);

    /**
     * Liefert den Faktor
     * @return Faktor als Double
     */
    double getFaktor();

    /**
     * Setzt den Zielbetrag
     * @param zielbetrag Zielbetrag als Double
     */
    void setZielbetrag(double zielbetrag);

    /**
     * Liefert den Zielbetrag
     * @return Zielbetrag als Double
     */
    double getZielbetrag();

    /**
     * Liefert den Namen der Ausgangswährung
     * @return Ausgangswährung als String
     */
    String getAusgangswaehrungName();

    /**
     * Liefert den Namen der Zielwährung
     * @return Zielwährung als String
     */
    String getZielwaehrungName();

    /**
     * Setzt die Zielwährung
     * @param zielwaehrung Zielwährung als String
     */
    void setZielwaehrung(String zielwaehrung);

    /**
     * Liefert den Ausgangsbetrag
     * @return Ausgangsbetrag als Double
     */
    double getAusgangsbetrag();

    /**
     * Setzt den Ausgangsbetrag
     * @param ausgangsbetrag Ausgangsbetrag als Double
     */
    void setAusgangsbetrag(double ausgangsbetrag);

    /**
     * Prüft, ob das Ergebnis bereits Gelogged wurde
     * @return true oder false
     */
    boolean isLogged();

}
