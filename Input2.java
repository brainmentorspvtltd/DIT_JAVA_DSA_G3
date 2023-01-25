import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = scanner.nextInt(); // 1001 \n
        System.out.println("Id is "+id);


        System.out.println("Enter your Name");
        //String name = scanner.next();
        scanner.nextLine(); // eat \n comes from above
        String name = scanner.nextLine();
        System.out.println("Your Name is "+name);
        
        scanner.close();
        //byte arr[] = System.in.readAllBytes();
        // int singleByte= System.in.read();
        // System.out.println("NAme "+singleByte);
        // System.out.println("Char is "+(char)singleByte);
    }
}
