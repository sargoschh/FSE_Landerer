/**
 * Das Observer Design Pattern, kurz Observer Pattern bzw. deutsch Beobachter-Entwurfsmuster,
 * ist eine der beliebtesten Mustervorlagen für das Design von Computersoftware. Es gibt eine
 * einheitliche Möglichkeit an die Hand, eine Eins-zu-eins-Abhängigkeit zwischen zwei oder
 * mehreren Objekten zu definieren, um sämtliche Änderungen an einem bestimmten Objekt auf
 * möglichst unkomplizierte und schnelle Weise zu übermitteln. Zu diesem Zweck können sich
 * beliebige Objekte, die in diesem Fall als Observer bzw. Beobachter fungieren, bei einem
 * anderen Objekt registrieren. Letzteres Objekt, das man in diesem Fall auch als Subjekt
 * bezeichnet, informiert die registrierten Beobachter, sobald es sich verändert bzw.
 * angepasst wird.
 * Quelle: https://www.ionos.at/digitalguide/websites/web-entwicklung/was-ist-das-observer-pattern/
 *
 * In meinem einfachen Beispiel wird das Observer-Pattern ganz einfach veranschaulicht.
 * Wir nehmen an, dass ein lokaler Fußballverein ein Scoreboard hat, indem die Spielstände
 * gespeichert werden. Jedes Mal, wenn der Score verändert wird, werden 3 Zeitungen darüber
 * informiert, sodass diese immer auf dem neusten Stand bleiben. Dem Scoreboard können
 * beliebig viele Observer hinzugefügt werden.
 */
public class Main {
    public static void main(String[] args) {


        Scoreboard fbMilsBeiImst = new Scoreboard();

        Observer blickpunkt = new BPObserver(fbMilsBeiImst);
        Observer tirolerTageszeitung = new TTObserver(fbMilsBeiImst);
        Observer kronenZeitung = new KZObserver(fbMilsBeiImst);

        System.out.println("Benachrichigung der Zeitung: ");
        fbMilsBeiImst.setScore(5);

        System.out.println();
        System.out.println("Benachrichigung der Zeitung: ");
        fbMilsBeiImst.setScore(50);

        fbMilsBeiImst.deleteObserver(blickpunkt);

        System.out.println();
        System.out.println("Benachrichigung der Zeitung: ");
        fbMilsBeiImst.setScore(70);


    }
}