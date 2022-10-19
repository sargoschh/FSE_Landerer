import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JSONExporter implements IExportable{
    @Override
    public void export(List<Article> articleList) {
        try {
            FileWriter fileWriter = new FileWriter("JSONExport.csv");
            fileWriter.write("[\n");
            int length = articleList.size();
            for (Article article : articleList) {
                String line = "{\"Number\":" + article.getNumber() +
                        ",\"Name\":\"" + article.getName() +
                        "\",\"Manufacturer\":\"" + article.getManufacturer() + "\"}";
                if(length > 1){
                    line = line + ",\n";
                } else {
                    line = line + "\n";
                }
                length--;
                fileWriter.write(line);

            }
            fileWriter.write("]\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    [
    * {"Number":1,
    * "Name":"Win10",
    * "Manufacturer":Windows
    * },
    * {"Number":2,
     * "Name":"MacOsX",
     * "Manufacturer":"Apple"
     * }
    * ]*/
}
