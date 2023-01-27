import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        //final int BURGER = 1;
        //final int PIZZA = 2;
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        System.out.println("5. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Choice");
        //int choice = scanner.nextInt();
        String choice = scanner.next(); 
        switch(choice){
            // case 1:
            //case BURGER:
            case "Burger":
            System.out.println("Price is 100 Rs");
            break;
            //case PIZZA:
            case "Pizza":
            System.out.println("Price is 300 Rs");
            break;
            //case 3:
            case "Drinks":
            System.out.println("Price is 80 Rs");
            break;
            case "Desserts":
            //case 4: 
            System.out.println("Price is 150 Rs");
            break;
           // case 5:
           case "Exit":
            System.out.println("Thanks for Using...");
            break;
            default:
            System.out.println("Wrong Choice...");
        }
        scanner.close();
    }
}
