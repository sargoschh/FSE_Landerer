public abstract class WR implements IUmrechnen{

    private WR nextConverter;

    public double umrechnen(String variante, double betrag){

        double converted = 0;
        if(this.zustaendig(variante)) {
            converted = betrag * this.getFaktor();
            return converted;
        } else if(this.nextConverter != null){
            return this.nextConverter.umrechnen(variante, betrag);
        } else {
            return 0;
        }

    }

    public void setNextConverter(WR nextConverter) {
        this.nextConverter = nextConverter;
    }
}
