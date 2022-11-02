/**
 * Das Interface SoapBoxBuilder gibt die Struktur für den Builder der Soapbox vor.
 */
public interface SoapBoxBuilder {

    void buildSoapBoxWheel();
    void buildSoapBoxSeat();
    void buildSoapBoxTires();
    void buildSoapBoxTorso();
    SoapBox getRobot();
}
