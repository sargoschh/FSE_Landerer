/**
 * Unterklasse von AWR. Sorgt für die Umrechnung von Euro in US Dollar.
 */
/*
 * SOLID - Prinzip
 * S - ich bin mir nicht sicher, ob das Prinzip eingehalten
 * wurde - Klasse hat mehrere Aufgaben
 */
public class EURO2Dollar extends AWR {

    private final Waehrungen US_DOLLAR = Waehrungen.USD;
    private double kursDollar = 0.9794;

    @Override
    public double getFaktor() {
        return this.kursDollar;
    }

    public void setFaktor(double faktor) {
        this.kursDollar = faktor;
    }

    /**
     * Prüft, ob der US Dollar der gewünschten Zielwährung entspricht
     * @param variante gewünschte Zielwährung als String
     * @return true oder false
     */
    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.US_DOLLAR.getCode())) {
            return true;
        } else {
            return false;
        }
    }
}
