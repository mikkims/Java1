
package lexicon;

import java.io.IOException;
import java.util.HashMap;

public class Lexicon {

    public static void main(String[] args) throws IOException {
        //LexiconRussia lr = new LexiconRussia("lex.txt");
        CarveLexicon cl = new CarveLexicon("lex.txt");
        AddLexicon al = new AddLexicon("lex.txt");
        SearchWord sw = new SearchWord();
        
//        int[] m = new int[100];
//        for(int i = 0; i < m.length; i++){
//            m[i] = i;
//        }
        //lr.writeArrayToBinary("binary.txt", m);
        
        al.addLexicon("lex.txt", "Дантист - зубной врач, зубной техник.");
        al.addLexicon("lex.txt", "Такси - автомобиль, используемый для перевозки пассажиров и грузов с оплатой проезда обычно по таксометру. Маршрутные такси осуществляют перевозки по определенным линиям.");
        cl.carve("lex.txt");
        sw.searchW(cl.mp, "Кабан");
        sw.searchW(cl.mp, "Такси");
    }
    
}
