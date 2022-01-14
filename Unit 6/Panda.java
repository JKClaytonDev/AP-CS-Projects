public class Panda extends Animal{
private String favoriteFood;
private int age;
Panda(String newName, String newSound, String food, int years) 
{
super(newName, newSound); 
favoriteFood = food;
age = years;
} 

public String toString(){
   return (age + " year old " + super.toString() + " and eats " + favoriteFood);
}
} 
 