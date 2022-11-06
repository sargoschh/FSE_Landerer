import java.util.ArrayList;
import java.util.List;

/**
 * Vereinfacht die Verarbeitung einer Liste von Observer.
 */
public class ObserverList {

    private ArrayList<AObserver> observerList;

    public ObserverList() {
        this.observerList = new ArrayList<>();
    }

    /**
     * Der ObserverListe werden neue Observer hinzugefügt.
     * @param observer neuer Observer
     */
    public void addObserver(AObserver observer) {
        this.observerList.add(observer);
    }

    /**
     * Liefert die Liste der Observer zurück
     * @return Liste von Observer
     */
    public List<AObserver> getListObserver(){
        return this.observerList;
    }
}
