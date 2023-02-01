public class PrimeBetter {
    public static void main(String[] args) {
        int num = 36;
        int factor = 0;
       // for(int i = 2; i<Math.sqrt(num); i++){
        for(int i = 2; i*i<=num; i++){
            if(num % i ==0){
                factor++;
            }
        }
        System.out.println(factor==0?"Prime No ":"Not a Prime");
    }
}
