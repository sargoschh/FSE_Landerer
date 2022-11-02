/**
 * Im Builder Design Pattern werden vier Akteure unterschieden:
 *
 * Direktor: Dieser Akteur konstruiert das komplexe Objekt, indem er die Schnittstelle
 * des Erbauers verwendet. Er kennt die Anforderungen an die Arbeitsreihenfolge des Erbauers.
 * Beim Direktor wird die Konstruktion eines Objekts vom Kunden („Auftraggeber“) entkoppelt.
 *
 * Erbauer: Hält eine Schnittstelle zur Erzeugung der Bestandteile eines komplexen Objekts
 * (bzw. Produkts) bereit.
 *
 * Konkreter Erbauer: Dieser Akteur erzeugt die Teile des komplexen Objekts und
 * definiert (und verwaltet) die Repräsentation des Objekts und hält eine Schnittstelle
 * zur Ausgabe des Objekts vor.
 *
 * Produkt: Das Ergebnis der „Tätigkeit“ des Builder Patterns, also das zu konstruierende
 * komplexe Objekt.
 *
 * Beim Direktor geschieht der entscheidende Vorgang des Erbauer-Musters, die Trennung
 * der Herstellung eines Objekts/Produkts vom Auftraggeber.
 *
 * Vorteile des Erbauer-Entwurfsmusters:
 * Die Konstruktion (das Erbauen) und die Repräsentation (die Ausgabe) werden voneinander
 * isoliert eingebunden. Die internen Repräsentationen der Erbauer sind vor dem
 * Direktor „versteckt“. Neue Repräsentationen können leicht durch neue konkrete
 * Erbauerklassen eingefügt werden. Der Prozess der Konstruktion wird vom Direktor als
 * explizite Stelle gesteuert. Müssen dabei Änderungen vorgenommen werden, ist das ohne
 * Rückfragen beim Klienten möglich.
 *
 * Nachteile des Builder Patterns:
 * Es besteht eine enge Kopplung zwischen Produkt, konkretem Erbauer und den am
 * Konstruktionsprozess beteiligten Klassen, so dass Änderungenam grundsätzlichen
 * Prozessschwierig sein können. Das Erbauen (Konstruktion) der Objekte erfordert oft
 * Wissen über deren spezielle Verwendung und ihre Umgebung. Die Nutzung von bekannten
 * Patterns, so auch des Erbauer-Entwurfsmusters, können Programmierer dazu verleiten,
 * einfachere und vielleicht elegantere Lösungen zu übersehen. Letztlich gilt das
 * Erbauer-Muster unter Programmierern als eines der weniger wichtigen Entwurfsmuster.
 *
 * Quelle: https://www.ionos.at/digitalguide/websites/web-entwicklung/was-ist-das-builder-pattern/
 */
public class Main {
    public static void main(String[] args) {

        SoapBoxBuilder soapBoxBuilder = new FastestSoapBoxBuilder();

        SoapBoxEngineer engineer = new SoapBoxEngineer(soapBoxBuilder);

        engineer.makeSoapBox();

        SoapBox tollsteSeifenkiste = engineer.getSoapBox();

        System.out.println(tollsteSeifenkiste);
    }
}