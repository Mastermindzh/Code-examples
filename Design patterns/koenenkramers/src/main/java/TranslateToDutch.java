/**
 * Created by janve on 7-3-2016.
 */
public class TranslateToDutch {

    public static void main(String[] args){
        TranslateToDutch translateToDutch = new TranslateToDutch();
    }

    public TranslateToDutch(){
        IDictionary koenen = DictionaryFactory.getInstance().createDictionary("koenen");
        IDictionary kramers = DictionaryFactory.getInstance().createDictionary("kramers");

        koenen.getName();
        kramers.getName();

        System.out.println(kramers.translate("bird"));
        System.out.println(koenen.translate("bird"));
    }


}
