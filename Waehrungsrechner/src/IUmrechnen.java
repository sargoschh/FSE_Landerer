public interface IUmrechnen{
    double umrechnen(String variante, double betrag);
    double getFaktor();
    void setFaktor(double faktor);
    boolean zustaendig(String variante);
    void setNextConverter(IUmrechnen nextConverter);
}