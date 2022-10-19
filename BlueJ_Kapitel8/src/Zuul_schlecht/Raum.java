package Zuul_schlecht;

import java.util.HashMap;
import java.util.Set;

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
     */
    public void setzeAusgaenge(String richtung, Raum nachbar)
    {
        this.ausgaenge.put(richtung, nachbar);
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
        String ausgabe = "Ausgänge:";
        for (String s : this.ausgaenge.keySet()) {

                ausgabe += " " + s;

        }
        return ausgabe;
    }
    /*Aufgabe 8.10:
    * Die Methode gibAusgaengeAlsString() erstellt zunächst einen String, inden die Schlussendliche Ausgabe gespeichert
    * wird. Mit einer for-Schleife itterieren wir anschließend durch das keySet der Ausgänge des aktuellen Raums.
    * Hat der aktuelle Raum z.B. die Ausgänge Ost und West, so sind diese jeweils als key gespeichert.
    * Indem wir durch dieses keySet itterieren, holen wir uns nacheinander die Ausgänge heraus.
    * Die Ausgabe würde dann so aussehen: "Ausgänge: east west*/

}
