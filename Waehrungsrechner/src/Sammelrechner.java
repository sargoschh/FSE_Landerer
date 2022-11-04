public class Sammelrechner implements ISammelumrechnung{

    private IUmrechnen rechner;

    public Sammelrechner(IUmrechnen rechner) {
        this.rechner = rechner;
    }

    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double converted = 0;
        for(double d : betraege) {
            converted += this.rechner.umrechnen(variante, d);
        }
        return converted;
    }

}
