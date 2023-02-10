
import java.util.Date;

public class Employee { //extends Object {
    private int id; // Instance Variables
    private String name;
    private double salary;
    private String companyName;
    private String deptName;
    

    public int getId() {
        return id;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    // this is a default constructor
    // every class has a default construtor by default
    // Nothing it do
    /*
     * Constructor - when u create object using new , it call a constructor
     * Constructor is used to initliaze the instance variables.
     * Constructor it is name is same as class name
     * Constructor returns nothing even don't write void in front of constructor
     * // if u  write it treated like a method.
     */
    public  Employee(){
        companyName = "Brain Mentors";
    }
    // In a One class we can have multiple constructor and it beocme constructor overloading.
    // this is a Parameterized Constructor
    public Employee(int id , String name , double salary){
        // Constructor Chaining
        this(); // Calling Default Constructor (Must be the first line)
        // Instance Var = Local var
        this.id = id;
        this.name = name;
        this.salary = salary;
        
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    private double hra(){
        return salary * 0.50;
    }
    private double da(){
        return salary * 0.30;
    }
    private double ta(){
        return salary * 0.20;
    }
    private double ma(){
        return salary * 0.25;
    }
    private double pf(){
        return salary * 0.05;
    }

    private double gs(){
        return salary + hra() + da() + ta() + ma();
    }

    private double tax (){
        return gs() * 0.10;
    }

    private double ns(){
        return gs() - pf() - tax();
    }

    /* 
    public void print(){
        System.out.println("Id "+id+" Name "+name + " basic salary "+salary+" Company Name "+companyName);
    }
    */

    @Override
    public String toString() {
        Date date = new Date();
        Formatting formatting = new Formatting("JP","ja"); // Has A 
        String allowances = "Hra "+formatting.format(hra()) + " DA "+formatting.format(da()) + " TA  "+formatting.format(ta()) + " MA "+formatting.format(ma()) + " PF "+formatting.format(pf()) + "\n GS "+formatting.format(gs()) + "\nTAX "+formatting.format(tax()) +"\n NS "+formatting.format(ns());
        return "Employee [Date is "+ formatting.dateFormat(date) + "\n\n id=" + id + ", name=" + formatting.getTitleCase(name) + ", salary=" + salary + ", companyName=" + companyName + "\n "+
        "Allowances "+ allowances+"]";
        
    }

    

    // @Override
    // public String toString(){
    //     return "Id "+id +" Name "+name+" Basic Salary"+salary+" Company Name "+companyName;
    // }
}
