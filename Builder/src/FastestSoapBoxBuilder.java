/**
 * Diese Klasse wird verwendet, um eine "Alte Seifenkiste" zu erstellen.
 * Als Datenfeld wird der Klasse eine "leere" Seifenkiste mitgegeben.
 */
public class FastestSoapBoxBuilder implements SoapBoxBuilder{

    private SoapBox soapBox;

    public FastestSoapBoxBuilder() {
        this.soapBox = new SoapBox();
    }

    @Override
    public void buildSoapBoxWheel() {
        this.soapBox.setSoapBoxWheel("RedRazerWheel");
    }

    @Override
    public void buildSoapBoxSeat() {
        this.soapBox.setSoapBoxSeat("BlueCozySeat");
    }

    @Override
    public void buildSoapBoxTires() {
        this.soapBox.setSoapBoxTires("GreenAirTires");
    }

    @Override
    public void buildSoapBoxTorso() {
        this.soapBox.setSoapBoxTorso("AerodynamicTurboTorso");
    }

    @Override
    public SoapBox getRobot() {
        return this.soapBox;
    }
}
