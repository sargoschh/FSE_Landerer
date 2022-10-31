public abstract class Animal {

    private String name;

    public Animal(String name) {
        setName(name);
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void iAmA();

    public abstract void howIMove();

    public abstract void whatIEat();

    public abstract void howIMakeNoise();
}
