/*
 * final - keyword
 * if use it with class , so that's class can't be inherit.
 */
final class Calc{

}
// class ScCalc extends Calc{

// }

class Parent1{
    // Instance Variables (4th final with instance variables)
    final int x =10;
    final int y ;
    Parent1(){
        y = 20;
    }
    Parent1(int x){
        //this();
        y = 30;
    }
    void show(){
        System.out.println("Parent1 Show");
    }
    private final void output(){
        System.out.println("Parent output...");
    }
    // final prevent overriding
    final void disp(){
        System.out.println("Parent1 Disp");
    }
}
class Child1 extends Parent1{
    int a;
    int b;
   // @Override
    void output(){
        System.out.println("Child1 output....");
    }
    void disp(int x){
        System.out.println("Overloading....");
    }
    // @Override
    // void disp(){

    // }
}

public class SealedClass {
    public static void main(String[] args) {
        final Child1 obj= new Child1();
        obj.a++;
        obj.b++;
        //obj  = new Child1();
       // These are final classes
        // Math 
        //String
        //System
        //Integer w;

        // 2nd use case of final 
        final int MAX = 100; // Constant
        //MAX = 200;
        //MAX++;
        final int[] arr = new int[5];
        arr[0] = 1000;
        arr[1] = 2000;
        for(int e : arr){
            System.out.println(e);
        }
        //arr = new int[20];

        //3rd use case final with override
    }
}
