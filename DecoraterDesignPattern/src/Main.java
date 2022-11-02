/**
 * Das Decorator Design Pattern wird verwendet, um bestehende Komponenten im Code zu erweitern,
 * ohne dass der bestehende Code dabei verändert wird. In diesem Beispiel wird das über ein
 * "Sandwich" verdeutlicht. Wir haben ein Interface (Sandwich) und eine Klasse
 * "EmptySandwich", die das Interface implementiert. Das leere Sandwich kann allein betrachtet
 * nicht viel. Es ist lediglich ein leeres Brötchen zu einem bestimmten Preis. Um das Brötchen
 * zu verbessern, ohne den Code des Brötchens zu verändern, wird ein Decorator, in diesem Fall
 * "FillYourSandwich", als abstrakte Klasse erstellt. Es können nun beliebig viele Unterklassen
 * erstellt werden, die von dem Decorator erben und die das Sandwich füllen. Diese Unterklassen
 * verändern das ursprüngliche Sandwich nicht, sie erweitern es.
 * Erstellt man dann ein neues Objekt bzw. ein neues Sandwich, kann man das leere Sandwich
 * in beliebig viele Zutaten wrappen und dem User während der Laufzeit fällt nicht auf, dass
 * das ursprüngliche Sandwich lediglich aus einem Brötchen besteht.
 *
 * https://www.youtube.com/watch?v=j40kRwSm4VE - Video zur Erklärung für mich
 */
public class Main {
    public static void main(String[] args) {


        Sandwich sandwich = new Salami(new Salad(new Mayonnaise(new EmptySandwich())));

        System.out.println(sandwich.getIngredients());
        System.out.println(sandwich.getCost());
    }
}