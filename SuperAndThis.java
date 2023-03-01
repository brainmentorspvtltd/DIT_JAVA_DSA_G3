/*
 * Super vs This
 * super and this both contains the reference
 * this contains the reference of current class object.
 * super contains the reference of parent class object.
 * both of them are keywords
 */
class AClass{
    int x; // Instance Var
    AClass(){
         x= 10;
        System.out.println("I am the Default Cons of AClass");
    }
    AClass(int x){
        // Instance Var = Local var
        this.x = x; 
        System.out.println("AClass Param Cons Call");
    }
    void show(){
        System.out.println("A Class Show...");
    }
}
class BClass extends AClass{
    int x;
    BClass(){
        // super(); Parent class Default Constructor (Implicit Constructor Call)
        x = super.x + 20;
        System.out.println("I am the Default Cons of B Class");
    }
    BClass(int x){
        // super(); 
        // Explicit Call super constructor
        super(x); // Parent Class Param Cons Call (Must be in a First Call)
        this.x = x + super.x;
       
    }
    @Override
    void show(){
        super.show(); // Parent show call
        System.out.println("X of B "+this.x+" X of A "+super.x);
    }
}
public class SuperAndThis {
    public static void main(String[] args) {
        BClass obj = new BClass(20);
        obj.show();
    }
}
