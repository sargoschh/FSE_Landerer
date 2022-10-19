package Zuul_schlecht;

import java.util.HashMap;
import java.util.Set;

/**
 * Diese Klasse modelliert Räume in der Welt von Zuul.
 * 
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Ein "Raum" repräsentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen Räumen über Ausgänge verbunden.
 * Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * Für jede Richtung hält ein Raum eine Referenz auf den
 * benachbarten Raum.
 * 
 * @author  Michael Kölling und David J. Barnes
 * @version 2016.02.29
 */
public class Raum 
{
    private String beschreibung;
    private HashMap<String, Raum> ausgaenge;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausgänge. Eine Beschreibung hat die Form
     * "in einer Küche" oder "auf einem Sportplatz".
     * @param beschreibung  die Beschreibung des Raums
     */
    public Raum(String beschreibung) 
    {
        this.beschreibung = beschreibung;
        this.ausgaenge = new HashMap<>();
    }

    /**
     * Definiere die Ausgänge dieses Raums. Jede Richtung
     * führt entweder in einen anderen Raum oder ist 'null'
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
        String ausgabe = "Ausgaenge:";
        for (String s : this.ausgaenge.keySet()) {

                ausgabe += " " + s;

        }
        return ausgabe;
    }

    public String gibLangeBeschreibung() {
        return "Sie sind " + beschreibung + ".\n" + gibAusgaengeAlsString();
    }



}
