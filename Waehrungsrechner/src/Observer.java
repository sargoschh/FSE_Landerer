public abstract class Observer {

    protected WR umrechner;

    public Observer(WR umrechner) {
        this.umrechner = umrechner;
        this.umrechner.addObserver(this);
    }

    public abstract void update();
}
