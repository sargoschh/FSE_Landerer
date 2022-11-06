import java.util.ArrayList;
import java.util.List;

/**
 * Vereinfacht die Verarbeitung einer Liste von UmrechnungErgebnissen.
 */
public class UmrechnungErgebnisList {

    private List<UmrechnungErgebnis> ergebnisList;

    public UmrechnungErgebnisList() {
        this.ergebnisList = new ArrayList<>();
    }

    /**
     * Der Ergebnisliste werden neue Ergebnisse hinzugefügt.
     * @param ergebnis neues Ergebnis
     */
    public void addErgebnis(UmrechnungErgebnis ergebnis){
        this.ergebnisList.add(ergebnis);
    }

    /**
     * Liefert die Liste der Ergebnisse zurück.
     * @return Liste von Ergebnissen
     */
    public List<UmrechnungErgebnis> getErgebnisList(){
        return this.ergebnisList;
    }
}
