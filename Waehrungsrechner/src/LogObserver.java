import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogObserver implements IObserver {

    private final Logger logger = Logger.getLogger("MyLog");
    private FileHandler fh = null;
    private WRList converter;

    public LogObserver() {

        SimpleDateFormat format = new SimpleDateFormat("M-d-y_HHmmss");
        try {
            fh = new FileHandler("Waehrungsumrechnungen_"
                    + format.format(Calendar.getInstance().getTime()) + ".log");
        } catch (Exception e) {
            e.printStackTrace();
        }

        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
    }

    @Override
    public void update() {

        this.logger.info(getMessage());

    }

    public String getMessage(){
        String msg = "Neue Waehrungsumrechnungen";
        int length = this.converter.getListSize();
        for(WR con : this.converter.getUmrechnungsListe()) {
            msg += "\nAusgangswaehrung: " + con.getAusgangswaehrungBeschreibung() +
                    "\nAusgangsbetrag: " + con.getAusgangsbetrag() +
                    "\nZielwaehrung: " + con.getZielwaehrung() +
                    "\nZielbetrag: " + con.getZielbetrag();
            if(length > 1) {
                msg += "\n";
            }
        }
        return msg;

    }

    @Override
    public void addUmrechner(WR umrechner) {
        this.converter.addUmrechner(umrechner);
    }
}
