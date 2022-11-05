public class BPObserver extends Observer{

    /**
     * Erstellt ein neues Objekt vom Typ BPObserver.
     * Dem Datenfeld der Mutterklasse wird das mitgegebene Scoreboard zugewiesen und
     * der gerade erstellte Observer der Liste des Scoreboards hinzugefügt.
     * @param scoreboard - aktuelles Scoreboard
     */
    public BPObserver(Scoreboard scoreboard) {
        super(scoreboard);

    }

    /**
     * Update gibt die aktuellen Punktestände aus.
     */
    @Override
    public void update() {

            System.out.println("Blickpunkt berichtet: " +
                    "\nDie Mannschaft hat neue Punkte gesammelt." +
                    "\nAktueller Punktestand: " + this.scoreboard.getScore() + "\n");
    }
}
