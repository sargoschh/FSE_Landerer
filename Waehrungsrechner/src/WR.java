public abstract class WR implements IUmrechnen{

    private WR nextConverter;

    public double umrechnen(String variante, double betrag){
        double converted = 0.0;
        if(this.zustaendig(variante)) {
            converted = betrag * this.getFaktor();
        } else {
            this.nextConverter.umrechnen(variante, betrag);
        }
        return converted;
    }

    public void setNextConverter(WR nextConverter) {
        this.nextConverter = nextConverter;
    }
}
