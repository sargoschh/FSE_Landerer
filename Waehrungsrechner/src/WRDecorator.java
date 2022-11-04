public abstract class WRDecorator extends WR {

    private IUmrechnen decoratedConverter;

    public WRDecorator(IUmrechnen decoratedConverter) {
        this.decoratedConverter = decoratedConverter;
    }

    public double umrechnen(String variante, double betrag){

        return this.decoratedConverter.umrechnen(variante, betrag);
    }

    public double getFaktor(){return this.decoratedConverter.getFaktor();}
    public boolean zustaendig(String variante) {
        return this.decoratedConverter.zustaendig(variante);
    }

}
