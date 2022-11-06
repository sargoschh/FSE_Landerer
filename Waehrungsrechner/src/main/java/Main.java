public class Main {
    public static void main(String[] args) {


        System.out.println("Test ChainOfResponsibility & TemplateMethod:");

        //neue Währungsrechner werden erstellt
        AWR rechnerDollar = new EURO2Dollar();
        AWR rechnerYen = new EURO2Yen();
        AWR rechnerSEK = new EURO2SEK();
        AWR rechnerReal = new EURO2BrReal();

        //den Rechnern wird ein nächstes Kettenglied hinzugefügt
        rechnerDollar.setNextConverter(rechnerYen);
        rechnerYen.setNextConverter(rechnerSEK);
        rechnerSEK.setNextConverter(rechnerReal);

        System.out.println(rechnerDollar.umrechnen("sek", 95));

        System.out.println();
        System.out.println("Test Decorator:");

        //neuer Decorator wird erstellt und auf den Währungsrechner rechnerDollar angewendet
        AWRDecorator decorator = new DecoraterFixFees(rechnerDollar);

        System.out.println(decorator.umrechnen("sek", 95));

        //neuer Decorator wird erstellt und auf den Währungsrechner rechnerDollar angewendet
        AWRDecorator decorator1 = new DecoratorFeesInPercent(rechnerDollar);

        System.out.println(decorator1.umrechnen("sek", 95));

        //neuer Faktor wird gesetzt
        rechnerSEK.setFaktor(50);

        System.out.println(rechnerDollar.umrechnen("sek", 95));

        System.out.println();


        System.out.println("Test Builder:");


        System.out.println(rechnerDollar.umrechnen("brl", 95));

        //Mithilfe des Builders wird ein neuer Währungsrechner für Real erstellt
        IUmrechnen converterBRL = new EURO2BrReal.Builder()
                .setFaktor(8)
                .setNextConverter(new EURO2Yen())
                .build();

        System.out.println(converterBRL.umrechnen("brl", 95));
        System.out.println(converterBRL.umrechnen("yen", 95));

        System.out.println();
        System.out.println("Test Adapter:");


        double[] test = {5.4, 95, 7.6};

        //Ein neuer Sammelrechner wird erstellt - mit diesem wird eine Liste von Werten berechnet
        Sammelrechner sammelrechner = new Sammelrechner(decorator);
        System.out.println(sammelrechner.sammelumrechnen(test, "usd"));
        System.out.println(decorator.umrechnen("usd", 5.4) +
                decorator.umrechnen("usd", 95) +
                decorator.umrechnen("usd", 7.6));

        System.out.println();
        System.out.println("Test Observer:");

        //ein neuer LogObserver wird erstellt und den Währungsrechnern zugeteilt
        AObserver logObserver = new LogObserver();
        rechnerDollar.addObserver(logObserver);
        rechnerReal.addObserver(logObserver);
        rechnerSEK.addObserver(logObserver);
        rechnerYen.addObserver(logObserver);

        //ein neuer AtomObserver wird erstellt und den Währungsrechnern zugeteilt
        AObserver atomObserver = new AtomObserver();
        rechnerDollar.addObserver(atomObserver);
        rechnerReal.addObserver(atomObserver);
        rechnerSEK.addObserver(atomObserver);
        rechnerYen.addObserver(atomObserver);

        rechnerDollar.umrechnen("usd", 435);
        rechnerDollar.umrechnen("sek", 732);
        rechnerDollar.umrechnen("yen", 13.5);




    }
}