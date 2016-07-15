import dictionaries.KramersDictionary;

/**
 * Created by janve on 7-3-2016.
 */
public class KramersDictionaryAdapter implements IDictionary {
    private KramersDictionary dictionary = new KramersDictionary();
    private String name = "Kramers";

    public String translate(String word) {
        return dictionary.find(word);
    }

    public String getName() {
        return name;
    }
}
