public class PrintDigitOfANumber {
    public static void main(String[] args) {
        int num = 1234;
        while(num!=0){
        System.out.println(num % 10); // Last Digit
        num = num/10; // Small Number
        }
    }
}
