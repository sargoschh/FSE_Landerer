/**
 * Bei Verwendung der Template Method gibt eine abstrakte Klasse definierte Wege/Vorlagen zur Ausführung ihrer
 * Methoden vor. Die Unterklassen können diese Methoden dann nach Bedarf überschreiben. Der Aufruf der Methode muss
 * jedoch auf die gleiche Weise erfolgen, wie von der abstrakten Klasse vorgegeben.
 */
public class Main {
    /**
     * Es werden nun also vier Tiere erstellt, alle über denselben Mutterklassenkonstruktor.
     * Alle Tiere rufen dann dieselbe Methode, animalIntroduceItself() auf - die Ausgabe unterscheidet sich
     * jedoch bei jedem Tier.
     */
    public static void main(String[] args) {

        Animal animal1 = new Cat("Cindy");
        Animal animal2 = new Dog("Nico");
        Animal animal3 = new Horse("Spirit");
        Animal animal4 = new Cow("Annabell");

        animal1.animalIntroducesItself();
        System.out.println();
        animal2.animalIntroducesItself();
        System.out.println();
        animal3.animalIntroducesItself();
        System.out.println();
        animal4.animalIntroducesItself();

    }
}