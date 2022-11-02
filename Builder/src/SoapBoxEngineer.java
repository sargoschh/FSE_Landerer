/**
 * Der Engineer ist dafür zuständig, über den Builder die Seifenkiste zu erstellen.
 */
public class SoapBoxEngineer {

    private SoapBoxBuilder soapBoxBuilder;

    public SoapBoxEngineer(SoapBoxBuilder soapBoxBuilder) {
        this.soapBoxBuilder = soapBoxBuilder;
    }

    public SoapBox getSoapBox() {
        return this.soapBoxBuilder.getRobot();
    }

    public void makeSoapBox() {
        this.soapBoxBuilder.buildSoapBoxWheel();
        this.soapBoxBuilder.buildSoapBoxSeat();
        this.soapBoxBuilder.buildSoapBoxTires();
        this.soapBoxBuilder.buildSoapBoxTorso();
    }
}
