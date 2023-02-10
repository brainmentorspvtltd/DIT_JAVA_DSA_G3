
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        MessageResourceBundleReader mr = new MessageResourceBundleReader();
        String ename = new String("Shashi");
       // System.out.println(ename.toString()); // ename.toString()
       System.out.println(ename);
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the Id");
       System.out.println(mr.getValue("input.id"));
        int id= scanner.nextInt(); // 1001 \n
        //System.out.println("Enter the Name");
        System.out.println(mr.getValue("input.name"));
        scanner.nextLine();
        String name = scanner.nextLine();
       // System.out.println("Enter the Basic Salary");
       System.out.println(mr.getValue("input.salary"));
        double salary = scanner.nextDouble();
       // Employee emp = new Employee();
       Employee emp = new Employee(id, name, salary); // Has a 
       emp.setDeptName("IT");
      // emp.setSalary(emp.getSalary() + 10000);
       System.out.println(emp);
       //System.out.println(emp.toString());  // emp.toString()
       //emp.print();
        scanner.close();
    }
}
