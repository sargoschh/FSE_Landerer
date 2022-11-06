import java.util.ArrayList;
import java.util.List;

public abstract class AObserver {

    private List<WR> converter = new ArrayList<>();
    abstract void update();
    public String getMessage() {
        String msg = "Neue Waehrungsumrechnungen\n------------------------------------------------------\n";
        for(WR con : this.converter) {
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

    public void addUmrechner(WR umrechner) {
        this.converter.add(umrechner);
    }
}
