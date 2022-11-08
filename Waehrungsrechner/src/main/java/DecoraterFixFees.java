/**
 * Unterklasse von AWRDecorator. Addiert zum berechneten Zielbetrag eine fixe Gebühr von 10€.
 * Genaue Beschreibung der Methoden in der Mutterklasse.
 */
/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Klasse hat nur Methoden, die den
 * Decorator betreffen
 */
public class DecoraterFixFees extends AWRDecorator {


    public DecoraterFixFees(AWR decoratedConverter) {
        super(decoratedConverter);
    }

    /**
     * Fügt dem Ergebnis der Umrechnung eine Gebühr von 10€ hinzu.
     * @param variante gewünschte Zielwährung als String
     * @param betrag Ausgangsbetrag als double
     * @return Zielbetrag + Gebühr
     */
    public double umrechnen(String variante, double betrag){

        return super.umrechnen(variante, betrag) + 10;
    }

    @Override
    public double getFaktor() {
        return super.getFaktor();
    }

    @Override
    public void setFaktor(double faktor) {
        super.setFaktor(faktor);
    }

    @Override
    public boolean zustaendig(String variante) {
        return super.zustaendig(variante);
    }
}
