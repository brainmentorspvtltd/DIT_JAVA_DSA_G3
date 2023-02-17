import java.io.IOException;
import java.net.SocketException;

/*
 * method signature must be match with parent class.
 * Rule - 1 weaker access rule (Same or Large Scope)
 * Rule - 2 covariant return type rule, sub type rule
 * Rule - 3 sub exception rule 
 */
class X1{
    int a,b,c;
}
class X2 extends X1{
    int d,e;
}
class Y{
    
}
class P1{
    // the scope of this method is default
  X1 show() throws Exception{
   System.out.println("P1 Show...");
   X1 obj = new X1();
   obj.a = 10;
   obj.b = ++obj.a;
   obj.c = obj.a + obj.b;
   return obj;
 }
 void disp() throws ArrayIndexOutOfBoundsException{

 }
}
class C1 extends P1{
    void disp() throws NullPointerException{

    }
 protected X2 show() throws SocketException{
   System.out.println("c1 show...");
   X2 obj = new X2();
   obj.a = 10;
   obj.b  = obj.a + 2;
   obj.c = obj.a + obj.b;
   obj.d = obj.c * 3;
   obj.e = obj.a + obj.b + obj.c + obj.d;
   return obj;
 }
}


public class OverridingRules {
    public static void main(String[] args) throws Exception {
        C1 obj = new C1();
        obj.show();
    }
}
