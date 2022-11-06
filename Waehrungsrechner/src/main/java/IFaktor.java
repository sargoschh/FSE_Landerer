/**
 * Interface für die Verarbeitung des Faktors
 */
public interface IFaktor {
    /**
     * Liefert den Faktor der Umrechnung zurück
     * @return faktor
     */
    double getFaktor();

    /**
     * Setzt den Wert des Faktors
     * @param faktor Umrechnungsfaktor als double
     */
    void setFaktor(double faktor);
}
