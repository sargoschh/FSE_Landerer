public class Reader implements EReader{

    FormatAdapter formatAdapter;

    /*
    Ohne den FormatAdapter wäre es dem normalen Reader nicht möglich, ein anderes Format
    als epub zu öffnen.
    public void open(String bookFormat, String bookName) {

        if(bookFormat.equalsIgnoreCase("epub")) {
            System.out.println("Opening book as epub. BookName: " + bookName);
        } else {
            System.out.println("Invalid Format. " + bookFormat + " format not supported");
        }
    }
     */

    /**
     * Mit dem Adapter ist es dieser Methode nun möglich, mehrere Formate zu öffnen.
     * Handelt es sich beim Buch um ein anderes Format als epub, würd geprüft, ob
     * es einem der neuen Formate entspricht. Je nach Format wird dann ein neues
     * Reader-Objekt erstellt und dieses öffnet dann das Buch
     * @param bookFormat - das Format des Buchs
     * @param bookName - der Name des Buchs
     */
    @Override
    public void open(String bookFormat, String bookName) {

        if(bookFormat.equalsIgnoreCase("epub")) {
            System.out.println("Opening book as epub. BookName: " + bookName);
        } else if(bookFormat.equalsIgnoreCase("pdf") ||
                bookFormat.equalsIgnoreCase("azw")) {
            this.formatAdapter = new FormatAdapter(bookFormat);
            this.formatAdapter.open(bookFormat, bookName);
        } else {
            System.out.println("Invalid Format. " + bookFormat + " format not supported");
        }
    }
}
