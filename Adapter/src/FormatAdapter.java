/**
 * Der FormatAdapter fungiert als Brücke zwischen den inkompatiblen Schnittstellen.
 * Er erstellt, je nach Bedarf, ein neues AdvancedReader Objekt vom richtigen Typ.
 */
public class FormatAdapter implements EReader{

    AdvancedEReader advancedEReader;

    /**
     * Konstruktor erstellt, je nach Format, ein neues Objekt vom jeweiligen Reader.
     * @param bookFormat
     */
    public FormatAdapter(String bookFormat) {

        if(bookFormat.equalsIgnoreCase("pdf")) {
            this.advancedEReader = new PDFReader();
        } else if(bookFormat.equalsIgnoreCase("azw")) {
            this.advancedEReader = new AZWReader();
        }
    }

    @Override
    public void open(String bookFormat, String bookName) {
        if(bookFormat.equalsIgnoreCase("pdf")) {
            this.advancedEReader.openBookInPDF(bookName);
        } else if(bookFormat.equalsIgnoreCase("azw")) {
            this.advancedEReader.openBookInAZW(bookName);
        }
    }
}
