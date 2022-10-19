package Zuul_schlecht;

import java.util.Scanner;

/**
 * Diese Klasse ist Teil der Anwendung "Die Welt von Zuul".
 * "Die Welt von Zuul" ist ein sehr einfaches textbasiertes 
 * Adventure-Game. 
 * 
 * Dieser Zuul_schlecht.Parser liest Benutzereingaben und wandelt sie in
 * Befehle f�r das Adventure-Game um. Bei jedem Aufruf
 * liest er eine Zeile von der Konsole und versucht, diese als
 * einen Zuul_schlecht.Befehl aus bis zu zwei W�rtern zu interpretieren. Er
 * liefert den Zuul_schlecht.Befehl als ein Objekt der Klasse Zuul_schlecht.Befehl zur�ck.
 * 
 * Der Zuul_schlecht.Parser verf�gt �ber einen Satz an bekannten Befehlen. Er
 * vergleicht die Eingabe mit diesen Befehlen. Wenn die Eingabe
 * keinen bekannten Zuul_schlecht.Befehl enth�lt, dann liefert der Zuul_schlecht.Parser ein als
 * unbekannter Zuul_schlecht.Befehl gekennzeichnetes Objekt zur�ck.
 * 
 * @author  Michael K�lling und David J. Barnes
 * @version 2016.02.29
 */
class Parser 
{
    private Befehlswoerter befehle;  // h�lt die g�ltigen Befehlsw�rter
    private Scanner leser;           // Lieferant f�r eingegebene Befehle

    /**
     * Erzeuge einen Zuul_schlecht.Parser, der Befehle von der Konsole einliest.
     */
    public Parser() 
    {
        befehle = new Befehlswoerter();
        leser = new Scanner(System.in);
    }

    /**
     * @return Den n�chsten Zuul_schlecht.Befehl des Benutzers.
     */
    public Befehl liefereBefehl() 
    {
        String eingabezeile;   // f�r die gesamte Eingabezeile
        String wort1 = null;
        String wort2 = null;

        System.out.print("> ");     // Eingabeaufforderung

        eingabezeile = leser.nextLine();
        
        // Finde bis zu zwei W�rter in der Zeile
        Scanner zerleger = new Scanner(eingabezeile);
        if(zerleger.hasNext()) {
            wort1 = zerleger.next();     // erstes Wort lesen
            if (zerleger.hasNext()) {
                wort2 = zerleger.next();    // zweites Wort lesen
                // Hinweis: Wir ignorieren den Rest der Eingabezeile.
            }
        }
        
        // Jetzt pr�fen, ob der Zuul_schlecht.Befehl bekannt ist. Wenn ja, erzeugen
        // wir das passende Zuul_schlecht.Befehl-Objekt. Wenn nicht, erzeugen wir
        // einen unbekannten Zuul_schlecht.Befehl mit 'null'.
        if(befehle.istBefehl(wort1)) {
            return new Befehl(wort1, wort2);
        }
        else {
            return new Befehl(null, wort2);
        }
    }

}
