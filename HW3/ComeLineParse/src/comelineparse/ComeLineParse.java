
package comelineparse;

public class ComeLineParse {

    public static void main(String[] args) {
        
        SimpleParser smr = new SimpleParser();
        smr.parse(args);
        System.out.println(smr.getInFile());
        System.out.println(smr.getOutFile());
        
    }
    
}
