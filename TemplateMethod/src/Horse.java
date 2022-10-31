public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void iAmA() {
        System.out.println("Horse");
    }

    @Override
    public void howIMove() {
        System.out.println("walk on four hoofs");
    }

    @Override
    public void whatIEat() {
        System.out.println("vegetables like carrots");
    }

    @Override
    public void howIMakeNoise() {
        System.out.println("Ihaaaa");
    }
}