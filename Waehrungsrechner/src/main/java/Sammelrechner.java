/**
 * Eigentlicher Sammelrechner
 */
/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Klasse hat nur Methoden, die den
 * Sammelrechner betreffen
 */
public class Sammelrechner implements ISammelumrechnung{

    private IUmrechnen rechner;

    public Sammelrechner(IUmrechnen rechner) {
        this.rechner = rechner;
    }

    /**
     * Berechnet für eine Liste von Werten den entsprechenden Wert in der Zielwährung und summiert diese auf.
     * @param betraege Liste von Double Werten
     * @param variante Zielwährung als String
     * @return
     */
    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double converted = 0;
        for(double d : betraege) {
            converted += this.rechner.umrechnen(variante, d);
        }
        return converted;
    }

}
