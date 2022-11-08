/**
 * Interface für den Sammelrechner
 */
/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Interface hat nur Methoden, die eine
 * Sammelumrechnung betreffen
 */
public interface ISammelumrechnung{
    /**
     * Berechnet für eine Liste von Werten den entsprechenden Wert in der Zielwährung und summiert diese auf.
     * @param betraege Liste von Double Werten
     * @param variante Zielwährung als String
     * @return Summierter Zielbetrag
     */
    double sammelumrechnen(double[] betraege, String variante);
}