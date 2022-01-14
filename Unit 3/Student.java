//Jackson Clayton
//10/9/19

public class Student implements Gradable{
   private String name;
   private double grade;
   private int count;

   public Student(String n){
      name = n;
   }
   public void addTestScore(double score){
      grade+=score;
      count++;
   }
   public String getName(){
      return name;
   }
   public double getPercent(){
      grade= grade/count;
      return (double)grade;
   }
   public boolean isPassing(){
      return (grade>=60);
   }
}