public abstract class WR implements IUmrechnen{

    private IUmrechnen nextConverter;
    private double converted;

    public double umrechnen(String variante, double betrag){

        if(this.zustaendig(variante)) {
            this.converted = betrag * this.getFaktor();
            return this.converted;
        } else if(this.nextConverter != null){
            return this.nextConverter.umrechnen(variante, betrag);
        } else {
            return 0;
        }
    }

    public void setNextConverter(IUmrechnen nextConverter) {
        this.nextConverter = nextConverter;
    }
}
