
package lexicon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CarveLexicon {
    
    private HashMap<String, String> mp = new HashMap<>();

    public HashMap<String, String> getMp() {
        return mp;
    }    
    
    public void carve(String inFile) throws IOException{
        Reader reader = null;
        String key;
        String value;
        if(inFile != null){
            reader = new FileReader(inFile);
        }
        else System.out.println("Нет файла!");
        
        BufferedReader br = new BufferedReader(reader);
        for (String line = br.readLine(); line != null; line = br.readLine()){
            StringTokenizer st = new StringTokenizer(line, "-");
            while(st.hasMoreTokens()){
                key = st.nextToken().trim();
                value = st.nextToken();
                mp.put(key, value);
            }
        }
        br.close();
        for(HashMap.Entry<String, String> item : mp.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
