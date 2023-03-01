interface A4{
    int MAX = 100; // public static final int MAX = 100;
    void show();
}
interface B4{
    int MAX = 200;
    void show();
}
// a interface can inherit multiple interfaces
interface D4 extends A4, B4{
    void disp();
}

class C4 implements D4{
    @Override
    public void show(){
        System.out.println("C4 Show...");
    }
    @Override
    public void disp(){
        System.out.println("C4 Disp...");
    }
}
// A Class can implement N Number of Interfaces
// No show method conflict because both of them are empty.
// class C4 implements A4, B4{
//     @Override
//     public void show(){
//         System.out.println("C Show.. "+A4.MAX+" "+B4.MAX);
//     }
//     void print(){
//         System.out.println("Print...");
//     }
// }
public class InterfaceDemo2 {
    public static void main(String[] args) {
       // A4 obj = new A4();
       A4 obj = new C4(); // Upcasting
        //C4 obj = new C4();
        obj.show();
        //obj.print();
    }
}
