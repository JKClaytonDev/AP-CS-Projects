import java.util.*;
public class Company_Tester {
              
   public static void main ( String [] args ){
      Company c=new Company( "IBM", 55, 20, 15000);
      System.out.println("New Company Budget : "+c.getBudget());
     
      Company c1=new Company( "IBM1", 55, 20, 15000);
      Company c2=new Company( "IBM2", 55, 20, 15000);
         
      Employee e1= new Employee ("Bill", 25, 15, 12000, 1);
      System.out.println("New Employee created:");
      System.out.println(e1.getName());
      System.out.println(e1.getAge());
      System.out.println(e1.getYearsOnJob());
      System.out.println(e1.getSalary());
      System.out.println(e1.getID());
      System.out.println(e1);
      Employee e2= new Employee ("Ann", 66, 26, 25000, 2);
      Employee e3= new Employee ("Rick", 64, 22, 3000, 3);
      Employee e4= new Employee ("Dunot", 55, 2, 200000, 4);
      Employee e5=new Employee ("Bob", 35, 20, 200000, 5);
      Employee e6= new Employee ("Frank", 60, 10, 10000, 6); 
      Employee e7= new Employee ("Nick", 51, 19, 19000, 7);
      //
      System.out.println("\nTesting Adding Employees ");
      c.addEmployee(e1);
      c.addEmployee(e2);
      c.addEmployee(e3);
      c.addEmployee(e4);
      c.addEmployee(e5);
      c.addEmployee(e6);
      c.addEmployee(e7); 
      c. print();
      System.out.println("*****Total budget "+ c.getBudget()+"\n");
      //
      c1.addEmployee(e1);
      c1. print();
      System.out.println("*****Total budget "+ c1.getBudget()+"\n");
         //
      c2.addEmployee(e2);
      c2. print();
      System.out.println("*****Total budget "+ c2.getBudget()+"\n");
   //
      System.out.println("Testing Eligibility ");
      System.out.println(e1.getName()+" is eligible? "+ c.isEmployeeEligible(e1));
      System.out.println(e2.getName()+" is eligible? "+ c.isEmployeeEligible(e2));
      System.out.println(e3.getName()+" is eligible? "+ c.isEmployeeEligible(e3));
      System.out.println(e4.getName()+" is eligible? "+ c.isEmployeeEligible(e4));
      System.out.println(e5.getName()+" is eligible? "+ c.isEmployeeEligible(e5));
      System.out.println(e6.getName()+" is eligible? "+ c.isEmployeeEligible(e6));
      System.out.println(e7.getName()+" is eligible? "+ c.isEmployeeEligible(e7));
      System.out.println();
     // Testing processRetirements();
      c.processRetirements();
      System.out.println("\nAfter removing people: ");
      c. print();
      System.out.println("Budget after removing people "+ c.getBudget());
      //
      c1.processRetirements();
      System.out.println("\nAfter removing people: ");
      c1. print();
      System.out.println("Budget after removing people "+ c1.getBudget());
      //
      c2.processRetirements();
      System.out.println("\nAfter removing people: ");
      c2. print();
      System.out.println("Budget after removing people "+ c2.getBudget());     
    
          
   }
}
/*
New Company Budget : 0.0
 New Employee created:
 Bill
 25
 15
 12000.0
 1
 Bill age: 25; worked for 15 years; salary= 12000.0
 
 Testing Adding Employees 
 Bill age: 25; worked for 15 years; salary= 12000.0
 Ann age: 66; worked for 26 years; salary= 25000.0
 Rick age: 64; worked for 22 years; salary= 3000.0
 Dunot age: 55; worked for 2 years; salary= 200000.0
 Bob age: 35; worked for 20 years; salary= 200000.0
 Frank age: 60; worked for 10 years; salary= 10000.0
 Nick age: 51; worked for 19 years; salary= 19000.0
 *****Total budget 469000.0
 
 Bill age: 25; worked for 15 years; salary= 12000.0
 *****Total budget 12000.0
 
 Ann age: 66; worked for 26 years; salary= 25000.0
 *****Total budget 25000.0
 
 Testing Eligibility 
 Bill is eligible? false
 Ann is eligible? true
 Rick is eligible? true
 Dunot is eligible? true
 Bob is eligible? true
 Frank is eligible? false
 Nick is eligible? false
 
 
 After removing people: 
 Bill age: 25; worked for 15 years; salary= 12000.0
 Frank age: 60; worked for 10 years; salary= 10000.0
 Nick age: 51; worked for 19 years; salary= 19000.0
 Budget after removing people 41000.0
 
 After removing people: 
 Bill age: 25; worked for 15 years; salary= 12000.0
 Budget after removing people 12000.0
 
 After removing people: 
 Budget after removing people 0.0
*/