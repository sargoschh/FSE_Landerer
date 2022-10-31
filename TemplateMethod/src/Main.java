public class Main {
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