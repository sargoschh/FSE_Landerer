public interface IUmrechnen{
    double umrechnen(String variante, double betrag);
    boolean zustaendig(String variante);
    void setNextConverter(IUmrechnen nextConverter);
}