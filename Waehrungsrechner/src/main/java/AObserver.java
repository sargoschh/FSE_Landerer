import java.util.ArrayList;
import java.util.List;

/**
 * Dient als Mutterklasse für alle Observer
 */
public abstract class AObserver {

    private List<AWR> converter = new ArrayList<>();

    /**
     * Wird in den jeweiligen Unterklassen ausimplemeniert.
     */
    abstract void update();

    /**
     * Holt die Ergebnisse der Währungsrechner und speichert diese in einen String
     * @return Ergebnisliste als String
     */
    public String getMessage() {
        String msg = "Neue Waehrungsumrechnungen\n------------------------------------------------------\n";
        for(AWR con : this.converter) {
            for(UmrechnungErgebnis ue : con.getErgebnisse()) {
                if(!ue.isAlreadyInLog()) {
                    msg += ue.getMessage() +
                            "\n------------------------------------------------------\n";
                    ue.isLogged();
                }
            }
        }
        return msg;
    }

    /**
     * Wird in den jeweiligen Unterklassen ausimplemeniert.
     */
    public void addUmrechner(AWR umrechner) {
        this.converter.add(umrechner);
    }
}
