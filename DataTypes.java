public class DataTypes {
    public static void main(String[] args) {
        char agree = 'Y'; // 2 Byte (Unicode)
        char hindi = 'न';
        System.out.println(agree +  " "+hindi); 
        boolean att = true; // 0 , 1 (1 Byte ) (2 Byte)
        int a = 10;
        int b = 20;
        int c = a;
        c = c + 20;
        System.out.println("A is "+a+" And C is "+c);
    }
}
