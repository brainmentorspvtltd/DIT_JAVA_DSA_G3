public class PrintDigit {
   public static void main(String[] args) {
        int num = 1234;
        int copy = num;
        int count = 0;
        // Count the Digits
        while(num!=0){
            count = count + 1;
            num = num/10;
        }
        System.out.println("Count is "+count);
        int power = 1;
        while(count>1){
            power = power * 10;
            count--;
        }
        System.out.println("Power is "+power);
        while(copy!=0){
            System.out.println(copy / power);
            copy = copy % power;
            power = power/10;
        }

   } 
}
