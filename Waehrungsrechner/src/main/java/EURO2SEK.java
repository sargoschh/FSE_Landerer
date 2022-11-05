public class EURO2SEK extends WR {
    private final Waehrungen kronen = Waehrungen.SEK;
    private double kursKronen = 10.8652;

    @Override
    public double getFaktor() {
        return this.kursKronen;
    }

    public void setFaktor(double faktor) {
        this.kursKronen = faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.kronen.getCode())) {
            return true;
        } else {
            return false;
        }
    }
}
