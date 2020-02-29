
package lexicon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AddLexicon {
    
    String inFile;
    String word;
    OutputStream os;

    public AddLexicon(String inFile){
      
    }
    
    public void addLexicon(String inFile, String word) throws IOException{
        
        os = new FileOutputStream(new File(inFile), true);
        os.write(word.getBytes(), 0, word.length());
       
        os.close();
    }
    
}
