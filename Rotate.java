public class Rotate {
   public static void main(String[] args) {
        int num = 12345;
        int copy = num;
        int rot = 2;
        int count =0;
        // Count Digit
        while(copy!=0){
            copy = copy /10;
            count = count + 1;
        }
        int power = (int)Math.pow(10, rot);
        int leftPart = num /power;
        int rightPart = num % power;
        int rem = count - rot;
        int power2 = (int)Math.pow(10, rem);
        int result = rightPart * power2 + leftPart;
        System.out.println(result);

   } 
}
