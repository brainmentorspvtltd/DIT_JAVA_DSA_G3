public class RotateNumber {
    public static void main(String[] args) {
        int num = 12345;
        int r = 7;
        // Step - 1 Count Digit
        int copy = num;
        int countDigit = 0;
        while(copy!=0){
            copy = copy / 10;
            countDigit ++;
        }
        r = r % countDigit; // with in the range
        if(r<0){ // Negative Case
            r = r + countDigit;
        }
        int power = (int)Math.pow(10, r);
        int leftPart = num / power;
        int rightPart= num % power;
        int count = countDigit - r;
        int result = rightPart * (int)Math.pow(10, count) + leftPart;
        System.out.println(result); 


    }
}
