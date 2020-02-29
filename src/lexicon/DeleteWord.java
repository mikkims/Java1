
package lexicon;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class DeleteWord {
    
    public void deleteW(HashMap<String, String> del, String word) throws IOException{
        FileWriter reader = null;
        if(del.containsKey(word)){
            del.remove(word);
            reader = new FileWriter("1.txt");
            for(HashMap.Entry<String, String> item : del.entrySet()){
                reader.write(item.getKey() + " - " + item.getValue() + "\n");
                //System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
            }
            
        }
        else System.out.println("Ключа нет!");
        reader.close();
    }
    
    
}
