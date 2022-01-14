//Jackson Clayton
//10/9/19

public class DriversEd implements Gradable{
private String name;
private int total;

public DriversEd(String n){
   name = n;
   total  = 100;
}
public void deductPoints(double points){
   total-=points;
}
public String getName(){
   return name;
}
public double getPercent(){
   return (double)total;
}
public boolean isPassing(){
   return(total>=85);
}
}