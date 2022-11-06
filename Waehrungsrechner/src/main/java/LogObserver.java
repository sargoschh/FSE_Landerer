import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogObserver extends AObserver {

    private final Logger logger = Logger.getLogger("MyLog");
    private FileHandler fh = null;

    /**
     * Erstellt einen neuen Logger, der bei Aufruf von update() eine neue
     * LogDatei erstellt
     */
    public LogObserver() {

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

    /**
     * Die LogDatei wird erstellt.
     */
    @Override
    public void update() {
        this.logger.info(this.getMessage());
    }

}
