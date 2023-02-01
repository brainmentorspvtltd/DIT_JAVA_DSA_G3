public class GCD {
    public static void main(String[] args) {
        
        int a = 40;
        int b = 48;
        // // Simple Approach
        // int min = Math.min(a, b);
        // while(min>0){
        //     if(a%min==0 && b%min==0){
        //         break;
        //     }
        //     min--;
        // }
        // System.out.println(min);
        // Approach-2
            //Euclidean Algo
        // while(a!=b){
        //     if(a>b){
        //         a= a -b;
        //     }
        //     else{
        //         b = b - a;
        //     }
        // }
        // System.out.println(a);
        // Approach-3 /Euclidean Algo
        while(a%b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        System.out.println(b);

    }
}
