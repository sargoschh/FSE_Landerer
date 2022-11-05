import java.util.ArrayList;
import java.util.List;

public class WRList{
    private List<WR> umrechnungsListe;

    public WRList() {
        this.umrechnungsListe = new ArrayList<>();
    }

    public void addUmrechner(WR umrechner) {
        this.umrechnungsListe.add(umrechner);
    }

    public List<WR> getUmrechnungsListe() {
        return umrechnungsListe;
    }

    public int getListSize(){
        return this.umrechnungsListe.size();
    }
}
