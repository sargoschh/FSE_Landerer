public class EURO2BrReal extends WR {

    public static class Builder{

        private IUmrechnen nextConverter;
        private double faktor;

        public Builder setNextConverter(IUmrechnen converter){
            this.nextConverter = converter;
            return this;
        }

        public Builder setFaktor(double faktor){
            this.faktor = faktor;
            return this;
        }

        public IUmrechnen build(){
            IUmrechnen converter = new EURO2BrReal();
            converter.setNextConverter(this.nextConverter);
            converter.setFaktor(this.faktor);
            return converter;
        }
    }
    private final String real = "BRL";
    private double kursReal = 4.9624;

    @Override
    public double getFaktor() {
        return this.kursReal;
    }

    public void setFaktor(double faktor) {
        this.kursReal = faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.real)) {
            return true;
        } else {
            return false;
        }
    }
}
