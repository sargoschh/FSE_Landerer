public class TTObserver extends Observer{

    /**
     * Erstellt ein neues Objekt vom Typ TTObserver.
     * Dem Datenfeld der Mutterklasse wird das mitgegebene Scoreboard zugewiesen und
     * der gerade erstellte Observer der Liste des Scoreboards hinzugefügt.
     * @param scoreboard - aktuelles Scoreboard
     */
    public TTObserver(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
        this.scoreboard.addObserver(this);

    }

    /**
     * Update gibt die aktuellen Punktestände aus.
     */
    @Override
    public void update() {
            System.out.println("Die Tiroler Tageszeitung berichtet: " +
                    "\nDie Mannschaft hat neue Punkte gesammelt." +
                    "\nAktueller Punktestand: " + this.scoreboard.getScore() + "\n");
    }
}
