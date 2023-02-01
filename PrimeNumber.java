public class PrimeNumber {
    public static void main(String[] args) {
        int num = 11;
        int factor = 0;
        for(int i = 2; i<=num-1; i++){
            if(num % i ==0){
                factor++;
            }
            if(factor==1){
                break; // exit from loop
            }
        }
        System.out.println(factor==0?"Prime No ":"Not Prime");
        //System.out.println(factor==2?"Prime No ":"Not Prime");
    }
}
