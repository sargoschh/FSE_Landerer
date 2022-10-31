public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void iAmA() {
        System.out.println("Dog");
    }

    @Override
    public void howIMove() {
        System.out.println("walk on four paws");
    }

    @Override
    public void whatIEat() {
        System.out.println("meat");
    }

    @Override
    public void howIMakeNoise() {
        System.out.println("Woof");
    }
}
