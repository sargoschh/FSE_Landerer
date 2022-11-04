public class EURO2BrReal extends WR {
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
