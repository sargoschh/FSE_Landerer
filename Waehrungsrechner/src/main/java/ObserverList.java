import java.util.ArrayList;
import java.util.List;

public class ObserverList {

    private ArrayList<AObserver> observerList;

    public ObserverList() {
        this.observerList = new ArrayList<>();
    }

    public void addObserver(AObserver observer) {
        this.observerList.add(observer);
    }

    public List<AObserver> getListObserver(){
        return this.observerList;
    }
}
