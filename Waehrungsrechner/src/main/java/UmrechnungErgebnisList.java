import java.util.ArrayList;
import java.util.List;

public class UmrechnungErgebnisList {

    private List<UmrechnungErgebnis> ergebnisList;

    public UmrechnungErgebnisList() {
        this.ergebnisList = new ArrayList<>();
    }

    public void addErgebnis(UmrechnungErgebnis ergebnis){
        this.ergebnisList.add(ergebnis);
    }

    public List<UmrechnungErgebnis> getErgebnisList(){
        return this.ergebnisList;
    }
}
