public class FormatAdapter implements EReader{

    AdvancedEReader advancedEReader;

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
