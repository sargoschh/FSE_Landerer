package Zuul_mit_Enums_V2;
/**
 * Repr�sentationen f�r alle g�ltigen Befehlsw�rter des Spiels,
 * zusammen mit einer Zeichenkette in einer bestimmten Sprachen.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
public enum Befehlswort
{
    // Ein Wert f�r jedes Befehlswort zusammen mit der dazugeh�rigen
    // Benutzereingabe
    GO("go"), QUIT("quit"), HELP("help"), UNKNOWN("?");
    
    // Das Befehlswort als Zeichenkette
    private String befehlswort;
    
    /**
     * Initialisieren mit dem entsprechenden Befehlswort.
     * @param befehlswort  das Befehlswort als Zeichenkette
     */
    Befehlswort(String befehlswort)
    {
        this.befehlswort = befehlswort;
    }
    
    /**
     * @return  das Befehlswort als Zeichenkette
     */
    public String toString()
    {
        return befehlswort;
    }
}
