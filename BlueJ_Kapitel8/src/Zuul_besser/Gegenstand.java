package Zuul_besser;

public class Gegenstand {

    private String beschreibung;
    private Integer gewicht;

    public Gegenstand(String beschreibung, Integer gewicht) {
        this.beschreibung = beschreibung;
        this.gewicht = gewicht;
    }

    public String gibBeschreibungUndGewicht() {
        return "Gegenstand: " + beschreibung + "\nGewicht: " + gewicht + "g";
    }

    public Integer gibGewicht() {
        return gewicht;
    }
}
