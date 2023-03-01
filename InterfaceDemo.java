/*
 * What is Interface?
 * Interface - Standard , Prototype , Dummy Model
 * Interface 100% Abstract
 * interface all methods are public
 * interface contains constants and abstract methods
 * because interface is abstract so we can't create the object of interface.
 */
    // What to Do
  interface DBOperations{ // abstract interface DBOperations
    int MAX_CONNECTIONS = 10; // public static final int MAX_CONNECTIONS=10
    boolean isOpen(); // public abstract boolean isOpen(); 
    int add(int id, String name, double salary); 
 }

 // Partial Implementation 
 abstract class DB implements DBOperations{
    @Override
    public boolean isOpen(){
        System.out.println("DB Connection Open...");
        return true;
    }
 }
// class implements the interface not extend it.
// class - how to do 
 class OracleDBOperations extends DB {
    // @Override
    // public boolean isOpen(){
    //     return true;
    // }
    @Override
    public int add(int id , String name, double salary){
            System.out.println("DB Added to Oracle "+id +" "+name+" "+salary);
            return 1;
    }
 }

public class InterfaceDemo {
    public static void main(String[] args) {
        OracleDBOperations opr = new OracleDBOperations();
        opr.isOpen();
        opr.add(1001, "Ram", 11110);
    }
}
