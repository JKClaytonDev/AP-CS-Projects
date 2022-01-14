public class EmployeeTester{
public static void main (String[] args){
Employee jeff = new Employee("Jeff",  39, 12, 1250, 1482875);
Employee joe = new Employee("Joe", 50, 30, 1900, 35123);
Employee chungus = new Employee("Chungus", 70, 30000, 300000, 6666666);
Employee joey = new Employee("Joey", 200, 30, 40, 50);
Employee bigJohn = new Employee("Big John", 30, 50, 30, 12345);
Company jeffCorp = new Company("jeffCorp", 60, 10, 30);
jeffCorp.addEmployee(jeff);
jeffCorp.addEmployee(joe);
jeffCorp.addEmployee(chungus);
jeffCorp.addEmployee(joey);
jeffCorp.addEmployee(bigJohn);
jeffCorp.print();
}
}