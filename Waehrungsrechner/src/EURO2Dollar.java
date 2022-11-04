public class EURO2Dollar extends WR{

    private WR nextConverter;
    private final String dollar = "USD";

    @Override
    public double getFaktor() {
        return 0;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.dollar)) {
            return true;
        } else {
            return false;
        }
    }
}
