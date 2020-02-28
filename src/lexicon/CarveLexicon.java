
package lexicon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CarveLexicon {
    
    private String key;
    private String value;
    Map<String, String> mp = new HashMap<>();

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CarveLexicon(String st) {
        
    }
    
    public void carve(String inFile) throws IOException{
        Reader reader = null;
        if(inFile != null){
            reader = new FileReader(inFile);
        }
        else System.out.println("Нет файла!");
        
        BufferedReader br = new BufferedReader(reader);
        for (String line = br.readLine(); line != null; line = br.readLine()){
            StringTokenizer st = new StringTokenizer(line, "-");
            while(st.hasMoreTokens()){
                key = st.nextToken();
                value = st.nextToken();
                mp.put(key, value);
            }
        }
        br.close();
        for(Map.Entry<String, String> item : mp.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
        }
    }
    
    
    
}
