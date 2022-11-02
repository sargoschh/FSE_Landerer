public class Reader implements EReader{

    FormatAdapter formatAdapter;

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
