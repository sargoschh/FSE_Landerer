/**
 * Das Adapter Pattern wird dazu verwendet, Funktionalitäten unabhängiger oder inkompatibler
 * Schnittstellen zusammenzuführen.
 * Als Beispiel wird hier ein E-Reader verwendet, der zu Beginn nur ein eBook im Format
 * epub öffnen kann. Da es aber viele eBooks in anderen Formaten gibt, wurde ein Adapter
 * hinzugefügt, der dem ursprünglichen Reader hilft, neue Formate zu verarbeiten.
 * Dazu wird ein neues Interface implementiert, das die neuen Formate verarbeiten kann.
 * Die jeweiligen Formate werden dann in eigenen Readern ausimplementiert. Mit dem
 * FormatAdapter wird dann geprüft, welches Format das gewünschte Buch hat, und erstellt ein
 * entsprechendes Objekt im richtigen Format.
 * Der einfache Reader kann dann über diesen Adapter mit den neuen Formaten umgehen und diese
 * öffnen.
 *
 * https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm - Pattern durch diese
 * Website gelernt
 *
 * Beim Durcharbeiten dieses Beispiels ist mir auf jeden Fall klar geworden, dass dies nur
 * als grobes Beispiel dient. Im Sinne der Erweiterbarkeit des Codes würde man den Reader
 * auf jeden Fall anders erweitern.
 */
public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();

        reader.open("epub", "Eragon");
        reader.open("pdf", "Herr der Ringe");
        reader.open("azw", "Harry Potter");
        reader.open("txt", "Biene Maja");
    }
}