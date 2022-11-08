import com.rometools.rome.feed.atom.Content;
import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.atom.Feed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Unterklasse von AObserver. Erstellt einen AtomFeed der Ergebnisse
 */
/*
 * SOLID - Prinzip
 * S - wurde eingehalten - Klasse hat nur Methoden, die den
 * AtomObserver betreffen
 */
public class AtomObserver extends AObserver {

    private List<Entry> entries = new ArrayList<>();
    private List<Content> contents = new ArrayList<>();
    private Feed feed = new Feed("Log");

    /**
     * Erstellt, beim Aufruf, einen neuen AtomFeed. Diesem wird eine Liste von
     * Einträgen und Contents mitgegeben.
     */
    @Override
    public void update() {
        Entry entry = this.newEntry();
        this.newContent(this.getMessage());
        entry.setContents(this.contents);
        this.entries.add(entry);
        this.feed.setEntries(this.entries);

        System.out.println(this.feed.toString());
    }

    /**
     * Erstellt einen neuen Eintrag für den Feed
     * @return Objekt vom Typ Entry
     */
    public Entry newEntry(){
        Entry entry = new Entry();
        entry.setCreated(new Date());
        entry.setTitle("LOG vom Waehrungsrechner");
        entry.setCreated(new Date());
        return entry;
    }

    /**
     * Erstellt neuen Content für den Feed
     * @param msg String mit Ergebnissen
     */
    public void newContent(String msg) {
        Content content = new Content();
        content.setValue(msg + "\n");
        content.setType("LOG");
        contents.add(content);
    }

}
