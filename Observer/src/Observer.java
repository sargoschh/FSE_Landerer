/**
 * Die abstrakte Klasse Observer dient als Mutterklasse für alle Observer
 */
public abstract class Observer {

    /**
     * Protected, damit aus den Unterklassen auf das Datenfeld zugegriffen werden kann.
     */
    protected Scoreboard scoreboard;

    public Observer(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
        this.scoreboard.addObserver(this);
    }

    /**
     * Wird in den Unterklassen ausimplementiert.
     */
    public abstract void update();
}
