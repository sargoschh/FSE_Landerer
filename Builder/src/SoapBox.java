public class SoapBox implements SoapBoxPlan{

    private String soapBoxWheel;
    private String soapBoxSeat;
    private String soapBoxTires;
    private String soapBoxTorso;


    @Override
    public void setSoapBoxWheel(String wheel) {
        this.soapBoxWheel = wheel;
    }

    @Override
    public void setSoapBoxSeat(String seat) {
        this.soapBoxSeat = seat;
    }

    @Override
    public void setSoapBoxTires(String tires) {
        this.soapBoxTires = tires;
    }

    @Override
    public void setSoapBoxTorso(String torso) {
        this.soapBoxTorso = torso;
    }
}
