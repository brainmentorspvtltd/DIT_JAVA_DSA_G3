// From Java 8 Onwards Interface can have non abstract methods , those are default and static methods
interface I1{
    void show(); // public abstract void show();
    default void print(){ // Defination
        System.out.println("I1 Print....");
    }
    static void disp(){
        System.out.println("I am the Disp ....");
    }
}
interface I2{
    void show();
    default void print(){ // Defination
        System.out.println("I2 Print....");
    }
}
class K implements I1, I2{
    @Override
    public void print(){
        I1.super.print();
        I2.super.print();
        System.out.println("K Print...");
    }
    @Override
    public void show(){
        System.out.println("K Show....");
    }
}
public class InterfaceDemo3 {
    public static void main(String[] args) {
        I1.disp();
        K obj = new K();
        obj.show();
        obj.print();
    }
}
