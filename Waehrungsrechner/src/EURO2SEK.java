public class EURO2SEK extends WR {

    private WR nextConverter;
    private final String kronen = "SEK";
    private final double kursKronen = 10.8652;

    @Override
    public double getFaktor() {
        return this.kursKronen;
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
