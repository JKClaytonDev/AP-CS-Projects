public class Dog extends Animal{
private String tricks;
private String games;
Dog(String newName, String newSound, String trick, String game) 
{
super(newName, newSound); 
tricks = trick;
games = game;
} 

public String toString(){
   return (super.toString() + ", plays " + games + " and can " + tricks);
}
} 
