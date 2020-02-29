
package lexicon;

import java.util.HashMap;

public class SearchWord {

    public void searchW(HashMap<String, String> mh, String searchWord){
        if(mh.containsKey(searchWord)){
            System.out.println("Значение для слова " + searchWord.toUpperCase() + " - " + mh.get(searchWord));
        }
        else System.out.println("Значение не найдено");
    } 
}
