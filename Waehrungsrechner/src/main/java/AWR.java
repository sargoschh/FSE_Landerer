import java.util.List;

/**
 * Abstrakte Klasse Währungsrechner dient als Mutterklasse für alle Rechner.
 */

/*
 * SOLID - Prinzip
 * S - wurde nicht eingehalten - Klasse hat mehrere Aufgaben
 */
public abstract class AWR implements IUmrechnen, IFaktor{

    private AWR nextConverter;
    private UmrechnungErgebnisList ergebnisList = new UmrechnungErgebnisList();
    private ObserverList observerList = new ObserverList();

    /**
     * Nimmt die eigentliche Umrechnung des Betrags vor.
     * Kann die Berechnung nicht vom aktuellen Rechner durchgeführt werden,
     * wird die Berechnung an den nächsten Währungsrechner weitergegeben.
     * @param variante gewünschte Zielwährung als String
     * @param betrag Ausgangsbetrag als double
     * @return Zielbetrag als double
     */
    public double umrechnen(String variante, double betrag){

        if(this.zustaendig(variante)) {
            double zielbetrag = betrag * this.getFaktor();
            this.addErgebnis(betrag, zielbetrag, variante, this.getFaktor());
            this.updateObserver();
            return zielbetrag;
        } else if(this.nextConverter != null){
            return this.nextConverter.umrechnen(variante, betrag);
        } else {
            return 0;
        }
    }

    /**
     * Setzt den nächsten Rechner in der ChainOfResponsibility
     * @param nextConverter nächster Converter als Währungsrechner
     */
    public void setNextConverter(AWR nextConverter) {
        this.nextConverter = nextConverter;
    }

    /**
     * Fügt der Liste der Observer einen neuen Observer hinzu.
     * Gleichzeitig wird dem Observer der Rechner hinzugefügt.
     * @param observer neuer Observer
     */
    public void addObserver(AObserver observer) {
        observer.addUmrechner(this);
        this.observerList.addObserver(observer);
    }

    /**
     * Wird bei jeder neuen Währungsrechnung aufgerufen. Dabei werden alle Observer
     * informiert und mit den Daten der Umrechnung beliefert.
     */
    public void updateObserver() {
        for(AObserver o : this.observerList.getListObserver()) {
            o.update();
        }
    }

    /**
     * Fügt der ErgebnisList ein neues Ergebnis hinzu. Dazu wird ein neues Ergebnis-Objekt
     * mithilfe des Builders erstellt.
     * @param ausgangsbetrag Ausgangsbetrag als Double
     * @param zielbetrag Zielbetrag als Double
     * @param zielwaehrung Zielwährung als String
     * @param faktor Faktor als Double
     */
    public void addErgebnis(double ausgangsbetrag, double zielbetrag, String zielwaehrung, double faktor) {
        UmrechnungErgebnis ergebnis = new UmrechnungErgebnis.Builder()
                .setZielbetrag(zielbetrag)
                .setZielwaehrung(zielwaehrung)
                .setAusgangsbetrag(ausgangsbetrag)
                .setFaktor(faktor)
                .build();
        this.ergebnisList.addErgebnis(ergebnis);
    }

    /**
     * Liefert die ErgebnisListe zurück
     * @return ErgebnisList
     */
    public List<UmrechnungErgebnis> getErgebnisse(){
        return this.ergebnisList.getErgebnisList();
    }
}
