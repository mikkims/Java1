
package lexicon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AddLexicon {

    public void addLexicon(String inFile, String word) throws IOException{
        
        OutputStream os = new FileOutputStream(new File(inFile), true);
        os.write((System.lineSeparator() + word).getBytes());
        os.close();
    }
    
}
