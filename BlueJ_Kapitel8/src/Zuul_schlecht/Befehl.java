package Zuul_schlecht;

/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game.
 * 
 * Objekte dieser Klasse halten Informationen �ber Befehle,
 * die der Benutzer eingegeben hat. Ein Zuul_schlecht.Befehl besteht momentan
 * aus zwei Zeichenketten: einem Befehlswort und einem zweiten
 * Wort. Beim Zuul_schlecht.Befehl "nimm karte" beispielsweise sind die beiden
 * Zeichenketten "nimm" und "karte".
 * 
 * Befehle werden von Benutzern dieser Klasse auf G�ltigkeit
 * �berpr�ft. Wenn ein Spieler einen ung�ltigen Zuul_schlecht.Befehl eingegeben
 * hat (ein unbekanntes Befehlswort), dann ist das Befehlswort <null>.
 *
 * Wenn der Zuul_schlecht.Befehl nur aus einem Wort bestand, dann ist das
 * zweite Wort <null>.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */

class Befehl
{
    private String befehlswort;
    private String zweitesWort;

    /**
     * Erzeuge ein Befehlsobjekt. Beide W�rter m�ssen angegeben werden,
     * aber jedes oder beide d�rfen 'null' sein.
     * @param erstesWort   das erste Wort des Befehls. Sollte
     *                     'null' sein, wenn dieser Zuul_schlecht.Befehl als nicht
     *                     vom Zuul_schlecht.Spiel erkannt gekennzeichnet werden soll.
     * @param zweitesWort  das zweite Wort des Befehls
     */
    public Befehl(String erstesWort, String zweitesWort)
    {
        befehlswort = erstesWort;
        this.zweitesWort = zweitesWort;
    }

    /**
     * Liefere das Befehlswort (das erste Wort) dieses Befehls.
     * Wenn der Zuul_schlecht.Befehl nicht verstanden wurde, ist das Ergebnis
     * 'null'.
     * @return  das Befehlswort
     */
    public String gibBefehlswort()
    {
        return befehlswort;
    }

    /**
     * @return  das zweite Wort dieses Befehls. Liefere 'null', wenn
     *          es kein zweites Wort gab.
     */
    public String gibZweitesWort()
    {
        return zweitesWort;
    }

    /**
     * @return  true, wenn dieser Zuul_schlecht.Befehl nicht verstanden wurde
     */
    public boolean istUnbekannt()
    {
        return (befehlswort == null);
    }

    /**
     * @return  true, wenn dieser Zuul_schlecht.Befehl ein zweites Wort hat
     */
    public boolean hatZweitesWort()
    {
        return (zweitesWort != null);
    }
}

