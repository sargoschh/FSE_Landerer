package Zuul_schlecht;

import java.util.HashMap;

/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * 
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Ein "Zuul_schlecht.Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Zuul_schlecht.Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * F�r jede Richtung h�lt ein Zuul_schlecht.Raum eine Referenz auf den
 * benachbarten Zuul_schlecht.Raum.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
public class Raum 
{
    private String beschreibung;
    private HashMap<String, Raum> ausgaenge;

    /**
     * Erzeuge einen Zuul_schlecht.Raum mit einer Beschreibung. Ein Zuul_schlecht.Raum
     * hat anfangs keine Ausg�nge. Eine Beschreibung hat die Form 
     * "in einer K�che" oder "auf einem Sportplatz".
     * @param beschreibung  die Beschreibung des Raums
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung;
    }

    /**
     * Definiere die Ausg�nge dieses Raums. Jede Richtung
     * f�hrt entweder in einen anderen Zuul_schlecht.Raum oder ist 'null'
     * (kein Ausgang).
     * @param norden  der Nordausgang
     * @param osten   der Ostausgang
     * @param sueden  der Südausgang
     * @param westen  der Westausgang
     */
    public void setzeAusgaenge(Raum norden, Raum osten,
                               Raum sueden, Raum westen) 
    {
        if(norden != null) {
            ausgaenge.put("north", norden);
        }
        if(osten != null) {
            ausgaenge.put("east", osten);
        }
        if(sueden != null) {
            ausgaenge.put("south", sueden);
        }
        if(westen != null) {
            ausgaenge.put("west", westen);
        }
    }

    public Raum gibAusgang(String richtung) {

        return ausgaenge.get(richtung);
    }

    /**
     * @return  die Beschreibung dieses Raums
     */
    public String gibBeschreibung()
    {
        return beschreibung;
    }

    /**
     * Liefert eine Beschreibung der Ausgänge dieses Raumes
     *
     * */
    public String gibAusgaengeAlsString() {
        String ausgabe = "Ausgänge: ";
        for (String s : this.ausgaenge.keySet()) {
            if(this.ausgaenge.get(s) != null) {
                ausgabe = ausgabe + s + " ";
            }
        }
        return ausgabe;
    }

}
