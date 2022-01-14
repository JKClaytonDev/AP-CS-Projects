public class Teacher extends Person{
private String subject;
private double salary;
public Teacher(String name, int age, String gender, String subjectIn, double salaryIn){
super (name, age, gender);
subject = subjectIn;
salary = salaryIn;
}
public String getSubject(){
   return subject;
}
public void setSubject(String s){
   subject = s;
}

public double getSalary(){
   return salary;
}

public void setSalary(double s){
   salary = s;
}

public String toString(){
return super.toString() + ", subject: " + subject + ", salary: " + salary;
}
}