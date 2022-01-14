//Jackson Clayton
//1/15/20
import java.util.ArrayList;
public class ZooTester{
   public static void main (String[] args){
      Zoo z = new Zoo();
      z.addResident(new Animal("Bird", "chirp")); //new panda class
      z.addResident(new Cow("Cow", "moo")); //new panda class
      z.addResident(new Camel("Camel", "*camel noises",  21)); //new panda class
      z.addResident(new Panda("Panda", "yelp", "Bamboo",  21)); //new panda class
      z.addResident(new Dog("Dog",  "bark", "sit on command","fetch")); //new dog class
      z.addResident(new Fish("Fish", "blub", "fish food", "swim")); //New fish class
      z.getResidents();
   }
}