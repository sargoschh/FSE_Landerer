public class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    public void iAmA() {
        System.out.println("Cow");
    }

    @Override
    public void howIMove() {
        System.out.println("walk on four hoofs");
    }

    @Override
    public void whatIEat() {
        System.out.println("grass");
    }

    @Override
    public void howIMakeNoise() {
        System.out.println("Mooooh");
    }
}