import java.util.ArrayList;
import java.util.List;

/**
 * Die Klasse Scoreboard erstellt eine neue Liste mit Observer und speichert einen Score.
 */
public class Scoreboard {

    private List<Observer> observers;
    private int score;

    /**
     * Mit dem Konstruktor wird ein neues Objekt vom Typ Scoreboard erstellt. Gleichzeitig
     * wird eine neue Liste mit Observer erstellt, die zu Beginn noch leer ist. Außerdem
     * wird der Score auf 0 gesetzt.
     */
    public Scoreboard() {
        this.observers = new ArrayList<>();
        this.score = 0;
    }

    public int getScore() {
        return this.score;
    }

    /**
     * Der Methode wird ein neuer Spielstand mitgegeben, der dann auf den bestehenden
     * Score aufgerechnet wird. Außerdem wird die Methode notifyAllObservers() aufgerufen.
     * @param score - neuer Spielstand
     */
    public void setScore(int score) {
        this.score += score;
        notifyAllObservers();
    }

    /**
     * Der Liste Observer können neue Observer hinzugefügt werden.
     * @param observer - neuer Observer
     */
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * Der Liste Observer können bestehende Observer entfernt werden.
     * @param observerToDelete - zu löschender Observer
     */
    public void deleteObserver(Observer observerToDelete) {
        int observerIndex = observers.indexOf(observerToDelete);
        System.out.println("Observer " + (observerIndex+1) + " deleted!");
        observers.remove(observerIndex);
    }

    /**
     * Die Methode iteriert durch die Liste der Observer und ruft auf jedem der Objekte
     * die Methode update() auf. Sprich, die Observer sind wieder auf dem neusten Stand.
     */
    public void notifyAllObservers() {
        for(Observer o : this.observers) {
            o.update();
        }
    }
}
