/* 
 * Abstract class may have abstract method or not.
 * but if u have any abstract method in a class, so that class must be abstract.
*/
/*
 * Can Abstract class has constructor
 * Yes 
 * Who is going to call it because abstract class object wouldn't create 
 * it is called through child via super constructor call
 * 
 * Abstract class body methods - yes
 * abstract class instance variables - Yes
 */
abstract class Loan{
    int amount; // INstance variable
    Loan(){
        System.out.println("Loan class Default constructor");
    }
    Loan(int x){
        System.out.println("Loan Class Param Cons...");
    }
    void apply(){
        System.out.println("Apply For Loan....");
    }
    abstract void roi(); // Body Less / Declare
}
// So all the child of abstract class must override the abstract methods.
// If i am a child class and i wouldn't override the abstract methods so my class
// is also consider as a abstract class.
class AutoLoan extends Loan{
    boolean drivingLicenseValid(){
        return true;
    }
    AutoLoan(){
        // super(); // IMplicit call to the parent already there
        System.out.println("Auto Loan Default Constructor");
    }
    @Override
    void roi(){
        System.out.println("Auto Loan ROI 9%");
    }
}
class HomeLoan extends Loan{
    HomeLoan(int x){
        super(10 * x); // parent class Param Cons call.
        System.out.println("Home Loan Param Cons Call");
    }
    boolean validProperty(){
        return true;
    }
    @Override
    void roi(){
        System.out.println("Home Loan ROI 8%");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        AutoLoan autoloan = new AutoLoan();
        HomeLoan homeLoan = new HomeLoan(20);
        // so we don't want any dev create the object of Generic class.
        // it is just for inheritance.
       // Loan loan = new Loan() ; // Loan is a Generic class/Entity, so we can't identify which kind of loan this is ?

    }    
}
