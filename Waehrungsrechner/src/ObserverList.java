import java.util.ArrayList;
import java.util.List;

public class ObserverList {

    private ArrayList<IObserver> observerList;

    public ObserverList() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    public List<IObserver> getListObserver(){
        return this.observerList;
    }
}
