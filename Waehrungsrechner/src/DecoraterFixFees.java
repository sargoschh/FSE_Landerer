public class DecoraterFixFees extends WRDecorator{


    public DecoraterFixFees(IUmrechnen decoratedConverter) {
        super(decoratedConverter);
    }

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
