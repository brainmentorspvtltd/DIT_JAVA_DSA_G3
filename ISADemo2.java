class A{
    int x, y;
    A(){
        x = 10;
        y = 20;
        System.out.println("A Cons Call");
    }
    A(int x){
        this();
        this.x = x ;
        y = 100;
        System.out.println("A Param Cons Call");
    }
}
class B extends A{
    int z;
    B(){
        // Implicit Super call
        //super(); // Parent Default Constructor Call
        super(10);
        z = x + y;
        System.out.println("B Cons Call "+z);
    }
    B(int a){
         // Implicit Super call
        //super(); // Parent Default Constructor Call
        // Explicit Super Constructor call
        this(); // Own class Default cons call
        // super(a*2);
        z = a +  x + y;
        System.out.println("B param Cons call "+z);

    }
}
public class ISADemo2 {
    public static void main(String[] args) {
        B obj = new B(100);
    }
}
