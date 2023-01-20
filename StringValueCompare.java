public class StringValueCompare {
    public static void main(String[] args) {
        String name = "Amit";
        String name2 = new String("Amit");
        System.out.println("Ref Compare "+ (name == name2));
        System.out.println("Value Compare "+(name.equals(name2)));
        System.out.println("amit".equalsIgnoreCase("AMIT"));
        System.out.println("Amit".compareTo("Ram")); //- Negative first value is smaller
        System.out.println("Ram".compareTo("Amit")); // Positve
        System.out.println("Ram".compareTo("Ram"));
    }
}
