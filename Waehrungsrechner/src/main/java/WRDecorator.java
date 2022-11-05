public abstract class WRDecorator extends WR {

    private WR decoratedConverter;

    public WRDecorator(WR decoratedConverter) {
        this.decoratedConverter = decoratedConverter;
    }

    public double umrechnen(String variante, double betrag){

        return this.decoratedConverter.umrechnen(variante, betrag);
    }

    public double getFaktor(){return this.decoratedConverter.getFaktor();}
    @Override
    public void setFaktor(double faktor) {
        this.decoratedConverter.setFaktor(faktor);
    }
    public boolean zustaendig(String variante) {
        return this.decoratedConverter.zustaendig(variante);
    }

}
