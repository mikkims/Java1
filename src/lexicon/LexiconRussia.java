
package lexicon;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LexiconRussia {
    private String inFile;
    BufferedReader reader;
    String st;
    
    public String getInFile() {
        return inFile;
    }

    public LexiconRussia(String inFile) throws IOException {
        this.inFile = inFile;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile), "UTF-8"));
        st = reader.readLine();
        System.out.println(st);
    }
    
    public void writeArrayToBinary(String fName, int[] m) {
        try(DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fName)))){
            for (int mi : m) {
                dos.writeInt(mi);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }

    
    
    
    
}
