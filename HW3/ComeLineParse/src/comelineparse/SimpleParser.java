
package comelineparse;

public class SimpleParser extends ComLineParserBase {
    
    private String inFile;
    private String outFile;

    public SimpleParser() {
        super(new String[] {"?", "r", "w"});
    }

    public String getInFile() {
        return inFile;
    }

    public void setInFile(String inFile) {
        this.inFile = inFile;
    }

    public String getOutFile() {
        return outFile;
    }

    public void setOutFile(String outFile) {
        this.outFile = outFile;
    }
    
    
    @Override
    protected void onUsage(String errorKey){
        if (errorKey != null)
            System.out.println("Command-line switch error:" + errorKey);

        System.out.println("формат ком.строки: имяПрограммы [-r<input-fileName>] [-w<output-fileName>]");
	System.out.println("   -?  показать Help файл");
	System.out.println("   -r  задать имя входного файла");
	System.out.println("   -w  выполнить вывод в указанный файл");
    }

    @Override
    protected SwitchStatus onSwitch(String key, String keyValue) {
        SwitchStatus status = SwitchStatus.NoError;
        switch(key){
            case "?": status = SwitchStatus.ShowUsage; break;
            case "r": 
                if(keyValue != null){
                    inFile = keyValue;
                } else {
                    System.out.println("Error!");
                    status = SwitchStatus.Error;
                } break;
            case "w":
                if(keyValue != null){
                    outFile = keyValue;
                } else {
                    System.out.println("Error!");
                    status = SwitchStatus.Error;
                } break;
            default: status = SwitchStatus.Error;
        }
        return status;
    }
    
    
    
    
    
    
    
    
}
