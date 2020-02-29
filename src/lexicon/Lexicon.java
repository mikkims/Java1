
package lexicon;

import java.io.IOException;

public class Lexicon {

    public static void main(String[] args) throws IOException {
        //LexiconRussia lr = new LexiconRussia("lex.txt");
        CarveLexicon cl = new CarveLexicon("lex.txt");
        AddLexicon al = new AddLexicon("lex.txt");
        
//        int[] m = new int[100];
//        for(int i = 0; i < m.length; i++){
//            m[i] = i;
//        }
        //lr.writeArrayToBinary("binary.txt", m);
        
        cl.carve("lex.txt");
        al.addLexicon("lex.txt", "Дантист - зубной врач, зубной техник");
    }
    
}
