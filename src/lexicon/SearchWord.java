
package lexicon;

import java.util.HashMap;

public class SearchWord {
    
    private String searchWord;
    private String inFile;
    HashMap<String, String> mh;

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getInFile() {
        return inFile;
    }

    public void setInFile(String inFile) {
        this.inFile = inFile;
    }

    
    public void searchW(HashMap<String, String> mh, String searchWord){
        if(mh.containsKey(searchWord)){
            System.out.println("Значение для слова " + searchWord.toUpperCase() + " - " + mh.get(searchWord));
        }
        else System.out.println("Значение не найдено");
    }
    
       
    
}
