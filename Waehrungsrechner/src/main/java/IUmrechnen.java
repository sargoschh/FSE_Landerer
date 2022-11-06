/**
 * Interface für den späteren Währungsrechner
 */
public interface IUmrechnen{
    /**
     * Rechnet den Ausgangsbetrag mit dem gewünschten Faktor in die neue Währung um.
     * @param variante gewünschte Zielwährung als String
     * @param betrag Ausgangsbetrag als double
     * @return Zielbetrag
     */
    double umrechnen(String variante, double betrag);

    /**
     * Prüft, ob der aktuelle Rechner der gewünschten Variante entspricht.
     * @param variante gewünschte Zielwährung als String
     * @return true oder false
     */
    boolean zustaendig(String variante);

    /**
     * Setzt den nächsten Rechner in der Zuständigkeitskette
     * @param nextConverter nächster Converter als Währungsrechner
     */
    void setNextConverter(AWR nextConverter);
}