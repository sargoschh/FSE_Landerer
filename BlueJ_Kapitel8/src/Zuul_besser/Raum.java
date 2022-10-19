package Zuul_besser;
import java.util.Set;
import java.util.HashMap;

/**
 * Diese Klasse modelliert R�ume in der Welt von Zuul.
 * 
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Ein "Raum" repr�sentiert einen Ort in der virtuellen Landschaft des
 * Spiels. Ein Raum ist mit anderen R�umen �ber Ausg�nge verbunden.
 * F�r jeden existierenden Ausgang h�lt ein Raum eine Referenz auf 
 * den benachbarten Raum.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */

class Raum 
{
    private String beschreibung;
    private HashMap<String, Raum> ausgaenge; // die Ausg�nge dieses Raums
    private Gegenstand gegenstand;

    /**
     * Erzeuge einen Raum mit einer Beschreibung. Ein Raum
     * hat anfangs keine Ausg�nge. Eine Beschreibung hat die Form 
     * "in einer K�che" oder "auf einem Sportplatz".
     * @param beschreibungRaum  die Beschreibung des Raums
     * @param beschreibungGegenstand die Beschreibung des Gegenstandes
     * @param gewichtGegenstand das Gewicht des Gegenstandes
     */
    public Raum(String beschreibungRaum, String beschreibungGegenstand, Integer gewichtGegenstand)
    {
        this.beschreibung = beschreibungRaum;
        gegenstand = new Gegenstand(beschreibungGegenstand, gewichtGegenstand);
        ausgaenge = new HashMap<>();
    }

    /**
     * Definiere einen Ausgang f�r diesen Raum.
     * @param richtung  die Richtung, in der der Ausgang liegen soll
     * @param nachbar   der Raum, der �ber diesen Ausgang erreicht wird
     */
    public void setzeAusgang(String richtung, Raum nachbar) 
    {
        ausgaenge.put(richtung, nachbar);
    }

    /**
     * @return  die kurze Beschreibung dieses Raums (die dem Konstruktor
     *          �bergeben wurde)
     */
    public String gibKurzbeschreibung()
    {
        return beschreibung;
    }

    /**
     * Liefere eine lange Beschreibung dieses Raums, in der Form:
     *     Sie sind in der K�che.
     *     Ausg�nge: north west
     * @return  eine lange Beschreibung dieses Raumes
     */
    public String gibLangeBeschreibung()
    {
        return "Sie sind " + beschreibung + ".\n" + gibAusgaengeAlsString() + "\n" + gegenstand.gibBeschreibungUndGewicht();
    }

    /**
     * Liefere eine Beschreibung der Ausg�nge dieses Raumes,
     * beispielsweise "Ausg�nge: north west".
     * @return  eine Beschreibung der Ausg�nge dieses Raumes
     */
    private String gibAusgaengeAlsString()
    {
        String ergebnis = "Ausgaenge:";
        Set<String> keys = ausgaenge.keySet();
        for(String ausgang : keys)
            ergebnis += " " + ausgang;
        return ergebnis;
    }

    /**
     * Liefere den Raum, den wir erreichen, wenn wir aus diesem Raum
     * in die angegebene Richtung gehen. Liefere 'null', wenn in
     * dieser Richtung kein Ausgang ist.
     * @param   richtung die Richtung, in die gegangen werden soll
     * @return  den Raum in der angegebenen Richtung
     */
    public Raum gibAusgang(String richtung) 
    {
        return ausgaenge.get(richtung);
    }
}

