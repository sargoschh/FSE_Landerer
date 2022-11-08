/**
 * Unterklasse von AWR. Sorgt für die Umrechnung von Euro in schwedische Krone.
 */
/*
 * SOLID - Prinzip
 * S - ich bin mir nicht sicher, ob das Prinzip eingehalten
 * wurde - Klasse hat mehrere Aufgaben
 */
public class EURO2SEK extends AWR {
    private final Waehrungen SW_KRONEN = Waehrungen.SEK;
    private double kursKronen = 10.8652;

    @Override
    public double getFaktor() {
        return this.kursKronen;
    }

    public void setFaktor(double faktor) {
        this.kursKronen = faktor;
    }

    /**
     * Prüft, ob die schwedische Krone der gewünschten Zielwährung entspricht
     * @param variante gewünschte Zielwährung als String
     * @return true oder false
     */
    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.SW_KRONEN.getCode())) {
            return true;
        } else {
            return false;
        }
    }
}
