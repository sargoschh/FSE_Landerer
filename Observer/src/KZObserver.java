public class KZObserver extends Observer{

    /**
     * Erstellt ein neues Objekt vom Typ KZObserver.
     * Dem Datenfeld der Mutterklasse wird das mitgegebene Scoreboard zugewiesen und
     * der gerade erstellte Observer der Liste des Scoreboards hinzugefügt.
     * @param scoreboard - aktuelles Scoreboard
     */
    public KZObserver(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
        this.scoreboard.addObserver(this);

    }

    /**
     * Update gibt die aktuellen Punktestände aus.
     */
    @Override
    public void update() {

            System.out.println("Die Kronen Zeitung berichtet: " +
                    "\nDie Mannschaft hat neue Punkte gesammelt." +
                    "\nAktueller Punktestand: " + this.scoreboard.getScore() + "\n");

    }
}
