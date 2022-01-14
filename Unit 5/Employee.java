public class Employee {
   private String name;
   private int age;
   private int years;
   private double salary;
   private int ID;

//constructor
   public Employee (String nameIn, int ageIn, int yearsIn, double salaryIn, int IDIn){
      name = nameIn;
      age = ageIn;
      years = yearsIn;
      salary = salaryIn;
      ID = IDIn;
   }
//returns the name of this employee
   public String getName(){
      return name;
   }
//returns the age (in years) of this employee
   public int getAge(){
      return age;
   }
//returns the number of years this employee has worked
   public int getYearsOnJob(){
      return years;
   }
//returns the salary of this employee
   public double getSalary(){
      return salary;
   }
//returns the ID of this emplyee
   public int getID(){
      return ID;
   }
   public String toString(){
      return (this.getName() + " age: " + this.getAge() + ", worked for " + this.getYearsOnJob() + " years; salary: " + this.getSalary());
   }
}