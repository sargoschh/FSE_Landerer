/**
 * Enum für Währungen. Beliebig viele Währungen können hinzugefügt werden.
 */
/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Klasse hat nur die Aufgabe, die
 * unterschiedlichen Währungen zu verarbeiten und bereitzustellen.
 */
public enum Waehrungen {

    USD("US Dollar"),
    SEK("Schwedische Krone"),
    YEN("Japanischer Yen"),
    BRL("Brasilianischer Real"),
    EUR("Euro");



    public final String code;
    public final String waehrungName;

    Waehrungen(String waehrungName){this(null, waehrungName);}

    Waehrungen(String code, String waehrungName) {
        this.waehrungName = waehrungName;
        this.code = (code == null) ? name() : code;
    }

    public String getCode() {
        return code;
    }

    public String getWaehrungName() {
        return waehrungName;
    }
}
