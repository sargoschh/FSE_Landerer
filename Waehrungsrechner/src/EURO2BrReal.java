public class EURO2BrReal extends WR{

    private WR nextConverter;
    private final String real = "BRL";
    private final double kursReal = 4.9624;

    @Override
    public double getFaktor() {
        return this.kursReal;
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
