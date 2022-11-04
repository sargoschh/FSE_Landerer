public class EURO2SEK extends WR{

    private WR nextConverter;
    private final String kronen = "SEK";

    @Override
    public double getFaktor() {
        return 0;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.kronen)) {
            return true;
        } else {
            return false;
        }
    }
}
