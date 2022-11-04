public class Main {
    public static void main(String[] args) {


        WR rechnerDollar = new EURO2Dollar();
        WR rechnerYen = new EURO2Yen();
        WR rechnerSEK = new EURO2SEK();
        WR rechnerReal = new EURO2BrReal();

        rechnerDollar.setNextConverter(rechnerYen);
        rechnerYen.setNextConverter(rechnerSEK);
        rechnerSEK.setNextConverter(rechnerReal);

        System.out.println(rechnerDollar.umrechnen("sek", 95));

    }
}