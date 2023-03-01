/*
 * Interface Implement Ways
 */
// SAM Interface
@FunctionalInterface
interface CalcInterface{
    
    int compute(int x, int y); // public abstract int compute(int x, int y);
}
// 1st way Define a Named class and implement an interface and then override the methods
class MyCalc implements CalcInterface{
    @Override
    public int compute(int x, int y){
        return x + y;
    }
}

public class InterfaceDemo4 {
    public static void main(String[] args) {
        //CalcInterface o = new MyCalc(); // Upcasting
        // 2nd Way
        // During the object creation i want to create a class , Anonymous class/ UnNAmed class
        CalcInterface obj = (x,y)->x*y; // Lambda Expression Java 8
        int r = obj.compute(10, 20);
        System.out.println(r);
        CalcInterface obj2 = (a,b)->{
            System.out.println("A is "+a+" and B is "+b);
            return a + b;
        };
        // if(true){
        //     CalcInterface obj= new CalcInterface(){
        //         @Override
        //         public int compute(int x, int y){
        //             show(); 
        //             return x * y;
        //         }
        //         void show(){
        //             System.out.println("I am the show...");
        //         }
        //     };
        //     System.out.println( obj.compute(10, 20));
           
        //}
        // MyCalc cal = new MyCalc(); 
        // int r = cal.compute(10, 20);
        // System.out.println(r);
    }
}
