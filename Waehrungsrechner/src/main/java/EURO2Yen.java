/**
 * Unterklasse von AWR. Sorgt für die Umrechnung von Euro in japanische YEN.
 */
/*
 * SOLID - Prinzip
 * S - ich bin mir nicht sicher, ob das Prinzip eingehalten
 * wurde - Klasse hat mehrere Aufgaben
 */
public class EURO2Yen extends AWR {
    private final Waehrungen J_YEN = Waehrungen.YEN;
    private double kursYen = 144.9060;

    @Override
    public double getFaktor() {
        return this.kursYen;
    }

    public void setFaktor(double faktor) {
        this.kursYen = faktor;
    }

    /**
     * Prüft, ob der japanische YEN der gewünschten Zielwährung entspricht
     * @param variante gewünschte Zielwährung als String
     * @return true oder false
     */
    @Override
    public boolean zustaendig(String variante) {
        if(variante.equalsIgnoreCase(this.J_YEN.getCode())) {
            return true;
        } else {
            return false;
        }
    }

}
