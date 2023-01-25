import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

public class BigTypes {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("1234567544343343434");
        BigInteger a = new BigInteger("6567434234234324");
       BigInteger c = a.add(b);
       System.out.println(c);

       Date d = new Date();
       System.out.println("Time is "+d.getTime());
       System.out.println(d.getDay()+" "+d.getMonth()+" "+d.getYear());
       System.out.println(d);
       Calendar ca = Calendar.getInstance();
      ca.setTime(d);
      

    }
}
