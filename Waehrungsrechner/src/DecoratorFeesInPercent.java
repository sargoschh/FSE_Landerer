public class DecoratorFeesInPercent extends WRDecorator{


    public DecoratorFeesInPercent(IUmrechnen decoratedConverter) {
        super(decoratedConverter);
    }

    public double umrechnen(String variante, double betrag){

        return super.umrechnen(variante, betrag) + ((super.umrechnen(variante, betrag)*0.5)/100);
    }

    @Override
    public double getFaktor() {
        return super.getFaktor();
    }

    @Override
    public boolean zustaendig(String variante) {
        return super.zustaendig(variante);
    }
}
