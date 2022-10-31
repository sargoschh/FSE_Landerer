public class Main {
    /**
    Bei der Chain of Responsibility geht es darum, Aufgaben weiterzugeben, wenn diese nicht den eigenen Möglichkeiten
    entsprechen. In diesem Beispiel sieht dies folgendermaßen aus:
    Es werden vier Kettenglieder erstellt, alle "können" etwas anderes.
    Das erste Kettenglied bekommt zwei Zahlen mit - außerdem die Anweisung, was mit diesen Zahlen passieren soll.
    Kann das erste Kettenglied die Aufgabe lösen, wird dies erledigt und das Programm ist fertig - kann das erste
    Kettenglied die Aufgabe nicht lösen, gibt es die Zahlen und die Anweisung an das nächste Kettenglied weiter.
    Entspricht die Anweisung keiner der Möglichkeiten der einzelnen Glieder, so wird eine Fehlermeldung ausgegeben.
     */
    public static void main(String[] args) {
        Chain chain1 = new Addieren();
        Chain chain2 = new Subtrahieren();
        Chain chain3 = new Multiplizieren();
        Chain chain4 = new Dividieren();

        chain1.setNextInChain(chain2);
        chain2.setNextInChain(chain3);
        chain3.setNextInChain(chain4);

        chain1.calculateNumbers(5,4,"null");

    }
}