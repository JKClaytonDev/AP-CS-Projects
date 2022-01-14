public class Fish extends Animal{
private String activity;
private String food;
Fish(String newName, String newSound, String foodIn, String activityIn) 
{
super(newName, newSound); 
activity = activityIn;
food = foodIn;
} 

public String toString(){
   return (super.toString() + " likes to " + activity + " and eat " + food);
}
} 
