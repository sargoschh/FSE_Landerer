public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void iAmA() {
        System.out.println("Cat");
    }

    @Override
    public void howIMove() {
        System.out.println("walk on four paws");
    }

    @Override
    public void whatIEat() {
        System.out.println("meat and fish");
    }

    @Override
    public void howIMakeNoise() {
        System.out.println("Miauu");
    }
}
