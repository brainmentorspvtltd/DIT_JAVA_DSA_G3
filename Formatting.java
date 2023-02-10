import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
    private NumberFormat nf ;
    private DateFormat dateFormat;
    private Locale locale;
    public Formatting(String country, String lang){
        locale = new Locale(lang, country);
        nf = NumberFormat.getCurrencyInstance(locale);
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);

    }

    private String initCap(String value){
        // char firstChar =  value.charAt(0);
        // String firstCharUpper = String.valueOf(firstChar).toUpperCase();
        // String remSmall = value.substring(1).toLowerCase();
        // return firstCharUpper + remSmall;
        return String.valueOf(value.charAt(0)).toUpperCase() +  value.substring(1).toLowerCase();
    }

    public String getTitleCase(String name){
      // String names [] = name.split(" ");
       String fullName = "";
       for(String val : name.split(" ")){
            fullName = fullName +  initCap(val) + " ";
       }
       return fullName;
        

    }

    public String dateFormat(Date date){
        return dateFormat.format(date);
    }
    public String format(double value){
        return nf.format( value);
    }
}
