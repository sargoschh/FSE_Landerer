public class EURO2Yen extends WR{

    private WR nextConverter;
    private final String yen = "YEN";

    @Override
    public double getFaktor() {
        return 0;
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
