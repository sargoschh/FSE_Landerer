public class Main {
    public static void main(String[] args) {


        IUmrechnen rechnerDollar = new EURO2Dollar();
        IUmrechnen rechnerYen = new EURO2Yen();
        IUmrechnen rechnerSEK = new EURO2SEK();
        IUmrechnen rechnerReal = new EURO2BrReal();

        rechnerDollar.setNextConverter(rechnerYen);
        rechnerYen.setNextConverter(rechnerSEK);
        rechnerSEK.setNextConverter(rechnerReal);

        System.out.println(rechnerDollar.umrechnen("sek", 95));

        WRDecorator decorator = new DecoraterFixFees(rechnerDollar);

        System.out.println(decorator.umrechnen("sek", 95));

        WRDecorator decorator1 = new DecoratorFeesInPercent(rechnerDollar);

        System.out.println(decorator1.umrechnen("sek", 95));

        rechnerSEK.setFaktor(50);

        System.out.println(rechnerDollar.umrechnen("sek", 95));


    }
}