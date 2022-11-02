/**
 * Die eigentliche Seifenkiste implementiert den Plan. Mit SoapBox könnte nun also
 * eine neue Seifenkiste erstellt werden. Um dies zu realisieren wird allerdings
 * noch ein Builder benötigt.
 */
public class SoapBox implements SoapBoxPlan{

    private String soapBoxWheel;
    private String soapBoxSeat;
    private String soapBoxTires;
    private String soapBoxTorso;

    /*
    Grundsätzlich wäre es auch möglich, mit diesem Konstruktor eine Seifenkiste zu
    erstellen. Da es aber bei der Mitgabe der Parameter ganz einfach zu Verwechslungen
    kommen kann, könnte es auch sein, dass statt des Lenkrades ein Reifen als solches
    montiert wird. Um dies zu verhindern, wird der Bau der Seifenkiste an einen
    Builder übergeben.

    public SoapBox(String wheel, String seat, String tires, String torso) {
        this.soapBoxWheel = wheel;
        this.soapBoxSeat = seat;
        this.soapBoxTires = tires;
        this.soapBoxTorso = torso;
    }*/


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

    @Override
    public String toString() {
        return "SoapBox:\n" +
                "soapBoxWheel= " + soapBoxWheel + "\n" +
                "soapBoxSeat= " + soapBoxSeat + "\n" +
                "soapBoxTires= " + soapBoxTires + "\n" +
                "soapBoxTorso= " + soapBoxTorso;
    }
}
