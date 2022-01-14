public class CollegeStudent extends Student{                                                                                                   private String major;
private int year;
public CollegeStudent(String name, int age, String gender,String idNum, double gpa, int yearIn, String majorIn){
super (name, age, gender, idNum, gpa);
major = majorIn;
year = yearIn;
}
public String getMajor(){
   return major;
}
public void setMajor(String s){
   major = s;
}

public int getYear(){
   return year;
}

public void setYear(int s){
   year = s;
}

public String toString(){
return super.toString() + ", year: " + year + ", major: " + major;
}
}