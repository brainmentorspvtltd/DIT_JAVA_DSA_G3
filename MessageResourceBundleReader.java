import java.util.Locale;
import java.util.ResourceBundle;

public class MessageResourceBundleReader {
    private Locale locale;
    ResourceBundle rb ;
    MessageResourceBundleReader(int choice){
        if(choice == 1){
             locale = new Locale("hi","IN");
        }
        else if(choice == 2){
             locale = new Locale("en","US");
        }
        else{
            System.out.println("Wrong Choice...");
            System.exit(0); 
            //return ;
        }
        rb = ResourceBundle.getBundle("message", locale);
    }
    
    public String getValue(String key){
        return rb.getString(key);
    }
}
