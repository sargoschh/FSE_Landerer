public class EURO2Dollar extends WR {

    private Waehrungen dollar = Waehrungen.USD;
    private double kursDollar = 0.9794;

    @Override
    public double getFaktor() {
        return this.kursDollar;
    }

    public void setFaktor(double faktor) {
        this.kursDollar = faktor;
    }

    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.dollar.getCode())) {
            return true;
        } else {
            return false;
        }
    }
}
