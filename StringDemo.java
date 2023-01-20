public class StringDemo {
    /*
     * String objects can be created in 2 styles
     * a) String Literal - First check in a Pool
     * that string is exist or not , if not then create a new
     * one, otherwise point to the old one
     * b) new Object --> It create one object in a pool if not exist and another one outside the pool
     */
    public static void main(String[] args) {
        String name = "Amit"; // String Literal (1 Object)
        // internally String name = "Amit".intern()
        String name2 = "Amit"; // String Literal (0 Object)
        System.out.println(name ==name2); // true
        String name3 = new String("Amit"); // 2 or 1
        String name4 = new String("Ram");// 2
        String name5 = new String("Amit").intern();
        System.out.println(name == name3); // false
        System.out.println(name== name5); // true
    }
}
