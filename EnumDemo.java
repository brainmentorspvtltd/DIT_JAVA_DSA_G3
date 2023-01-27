/*
 * enum is a special type and it represents group of constants
 */
// enum is a keyword , then given enum name
enum FoodItems{
    BURGER, PIZZA, DRINKS, DESSERTS // group of constants (UpperCase)
}
public class EnumDemo {
    public static void main(String[] args) {
        // final int BURGER = 1;
        // final int PIZZA = 2;
        // Using Enum
        FoodItems item = FoodItems.PIZZA;
        System.out.println(item);
        System.out.println(item.ordinal());
        switch(item){
            case BURGER:
            System.out.println("Price is Rs 100");
            break;
            case PIZZA:
            System.out.println("Price is Rs 300");
            break;
            default:
            System.out.println("Wrong Choice...");
        }
    }
}
