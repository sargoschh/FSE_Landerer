public class EURO2Dollar extends WR {

    private final String dollar = "USD";
    private final double kursDollar = 0.9794;

    @Override
    public double getFaktor() {
        return this.kursDollar;
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
