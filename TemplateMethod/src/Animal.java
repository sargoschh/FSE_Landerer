/**
 * Die abstrakte Klasse Animal dient als Vorlage für andere Tiere. Sprich, die Tiere haben gemeinsam, dass sie
 * sich bewegen, essen und Geräusche machen. Jedoch tut dies jedes Tier ganz individuell. Alle Tiere werden über denselben
 * Konstruktor erstellt, denn alle bekommen einen Namen. Auch animalIntroducesItself() bleibt bei allen Tieren gleich.
 */

public abstract class Animal {

    private String name;

    /**
     * Der Konstruktor erstellt ein neues Tier und setzt dessen Namen. Jede Unterklasse kann diesen Konstruktor mit
     * super() aufrufen.
     * @param name - Name des Tiers
     */
    public Animal(String name) {
        setName(name);
    }

    /**
     * Das Tier stellt sich vor und gibt seinen Namen, was für ein Tier es ist, wie es sich bewegt,
     * was es isst und wie es kommuniziert auf der Kommandozeile aus.
     */
    public void animalIntroducesItself() {
        System.out.println("Hello, my Name is " + getName());
        System.out.println("I am a: ");
        iAmA();
        System.out.println("To get forward I: ");
        howIMove();
        System.out.println("I eat: ");
        whatIEat();
        System.out.println("When I want to communicate I: ");
        howIMakeNoise();
    }

    /**
     * Setzt das Datenfeld Name auf den Namen des Tieres.
     * @param name - Name des Tieres
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Liefert den Namen des Tieres zurück.
     * @return Name des Tieres
     */
    public String getName() {
        return this.name;
    }

    /**
     * Die Unterklassen - also die verschiedenen Tiere - implementieren diese Methode aus und geben an, was für ein
     * Tier sie sind.
     */
    public abstract void iAmA();

    /**
     * Die Unterklassen - also die verschiedenen Tiere - implementieren diese Methode aus und geben an, wie sie
     * sich bewegen.
     */
    public abstract void howIMove();

    /**
     * Die Unterklassen - also die verschiedenen Tiere - implementieren diese Methode aus und geben an, was sie essen.
     */
    public abstract void whatIEat();

    /**
     * Die Unterklassen - also die verschiedenen Tiere - implementieren diese Methode aus und geben an, was für ein
     * Geräusch sie machen.
     */
    public abstract void howIMakeNoise();
}
