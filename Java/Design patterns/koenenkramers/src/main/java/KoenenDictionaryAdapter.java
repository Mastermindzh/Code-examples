import dictionaries.KoenenDictionary;

/**
 * Created by janve on 7-3-2016.
 */
public class KoenenDictionaryAdapter implements IDictionary {
    private String name = "Koenen";
    private KoenenDictionary dictionary = new KoenenDictionary();

    public String translate(String word) {
        return dictionary.lookUp(word);
    }

    public String getName() {
        return name;
    }
}
