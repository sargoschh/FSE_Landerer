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
    private List<WR> converter;

    public LogObserver() {

        this.converter = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("M-d-y_HHmmss");
        try {
            fh = new FileHandler("log/Waehrungsumrechnungen_"
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
        String msg = "Neue Waehrungsumrechnungen\n------------------------------------------------------\n";
        for(WR con : this.converter) {
            for(UmrechnungErgebnis ue : con.getErgebnisse()) {
                msg += ue.getMessage() +
                        "\n------------------------------------------------------\n";
            }
        }
        return msg;

    }

    @Override
    public void addUmrechner(WR umrechner) {
        this.converter.add(umrechner);
    }
}
