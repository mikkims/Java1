
package lexicon;

import java.io.FileWriter;
import java.io.IOException;

public class AddLexicon {
    
    FileWriter fw;

    public AddLexicon(String inFile) throws IOException {
        this.fw = new FileWriter(inFile);
    }
    
    public void addLexicon(String word, String designation) throws IOException{
        fw.write(word + "-" + designation);
        fw.close();
    } 
   
}
