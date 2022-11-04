public class EURO2BrReal extends WR{

    private WR nextConverter;
    private final String real = "BRL";

    @Override
    public double getFaktor() {
        return 0;
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
