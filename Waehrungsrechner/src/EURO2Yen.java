public class EURO2Yen extends WR {

    private WR nextConverter;
    private final String yen = "YEN";
    private final double kursYen = 144.9060;

    @Override
    public double getFaktor() {
        return this.kursYen;
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
