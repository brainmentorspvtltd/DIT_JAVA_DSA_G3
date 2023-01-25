import java.util.LinkedList;
class Cart{
    String name;
    double price;
    int qty;
}
public class WrapperTypes {
    public static void main(String[] args) {
        int r = 100; // Value Store
        
        //Integer a = 10; // Boxing (Integer Literal)
        Integer a = new Integer(10); // Manual Way Boxing
        //Integer b = 20;
        Integer b = new Integer(20);
        //Integer c = a + b; // From Java 1.5 Onwards (AutoBoxing)
        Integer c  = new Integer(a.intValue() + b.intValue());
        System.out.println(c);
        Character e = 'A';
        char t = 'A';
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        LinkedList<Cart> carts = new LinkedList<>();
        // Predefine Data Structure
        LinkedList<String> cartItems = new LinkedList<>();
        cartItems.add("Iphone Mobile");
        cartItems.add("Toy");
        LinkedList<Double> list = new LinkedList<>();


    }
}
