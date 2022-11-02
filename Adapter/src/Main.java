/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();

        reader.open("epub", "Eragon");
        reader.open("pdf", "Herr der Ringe");
        reader.open("azw", "Harry Potter");
        reader.open("txt", "Biene Maja");
    }
}