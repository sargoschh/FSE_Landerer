/**
 * Die abstrakte Klasse Observer dient als Mutterklasse für alle Observer
 */
public abstract class Observer {

    /**
     * Protected, damit aus den Unterklassen auf das Datenfeld zugegriffen werden kann.
     */
    protected Scoreboard scoreboard;

    /**
     * Wird in den Unterklassen ausimplementiert.
     */
    public abstract void update();
}
