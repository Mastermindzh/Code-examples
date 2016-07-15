/**
 * Created by janve on 7-3-2016.
 */
public class DictionaryFactory {
    private static DictionaryFactory dictionaryFactory;

    private DictionaryFactory(){};

    public static DictionaryFactory getInstance(){
        if(dictionaryFactory == null){
            dictionaryFactory = new DictionaryFactory();
        }
        return dictionaryFactory;
    }

    public IDictionary createDictionary(String dictNaam){
        IDictionary dictionary;
        switch (dictNaam){
            case "koenen":
                dictionary = new KoenenDictionaryAdapter();
                break;
            case "kramers":
                dictionary = new KramersDictionaryAdapter();
                break;
            default:
                throw new IllegalArgumentException("geen bekende dictionary");
        }
        return dictionary;
    }
}
