class P{
    int x;
    P(){
        x = 1;
    }
}
class Q extends P{
    int x;
    Q(){
        x = 2;
    }
}
class R extends Q {
    int x;
    R(int x){
        this.x = x  + 10;
        // Local x
        int z  = x  + this.x + ((Q)this).x + ((P)this).x;
        System.out.println(z);
    }
}
public class MultiLevel {
   public static void main(String[] args) {
        R obj = new R(2);
   } 
}
