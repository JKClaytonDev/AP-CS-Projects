import java.util.ArrayList;
public class Company
{
   private ArrayList<Employee> empList;
   private int retireAge;
   private int retireYears;
   private double retireSalary;
   private double salaryBudget;

   public Company (String nameIn, int retireAgeIn, int retireYearsIn, double retireSalaryIn){
      retireAge = retireAgeIn;
      retireYears = retireYearsIn;
      retireSalary = retireSalaryIn;
      empList = new ArrayList();
   }
   public void addEmployee (Employee newEmp){
      empList.add(newEmp);
      salaryBudget+=newEmp.getSalary();
   }
   public double getBudget(){
      return salaryBudget;
   }
   public void print(){
      for (Employee e : empList)
         System.out.println(e.toString());
   }
   public boolean isEmployeeEligible(Employee emp){
      int eligible = 0;
      if (emp.getAge() >= retireAge)
         eligible++;
      if (emp.getYearsOnJob() >= retireYears)
         eligible++;
      if (emp.getSalary() >= retireSalary)
         eligible++;
      return (eligible >= 2);
   }
   public void processRetirements(){
      int len = empList.size();
      for (int i = 0; i<len; i++){
         Employee e = empList.get(i);
         if (this.isEmployeeEligible(e)){
            salaryBudget-=e.getSalary();
            empList.remove(e);
            len--;  
         }
      }  
   }
}