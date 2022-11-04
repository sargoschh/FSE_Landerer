public class EURO2Yen extends WR {
    private final String yen = "YEN";
    private double kursYen = 144.9060;

    @Override
    public double getFaktor() {
        return this.kursYen;
    }

    public void setFaktor(double faktor) {
        this.kursYen = faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.yen)) {
            return true;
        } else {
            return false;
        }
    }
}
