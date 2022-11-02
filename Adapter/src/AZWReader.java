/**
 * Wird benötigt, um mit dem StandardReader später Bücher im .azw Format zu öffnen.
 */
public class AZWReader implements AdvancedEReader{


    @Override
    public void openBookInPDF(String bookName) {

    }

    @Override
    public void openBookInAZW(String bookName) {
        System.out.println("Opening book as .azw (Kindle). BookName: " + bookName);
    }
}
