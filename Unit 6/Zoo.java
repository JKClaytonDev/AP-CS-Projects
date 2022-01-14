import java.util.ArrayList;
public class Zoo{
private ArrayList<Animal> residents;
public Zoo(){
residents = new ArrayList();
}
public void addResident(Animal a){
   residents.add(a);
}
public void getResidents(){
   for (Animal a : residents)
      System.out.println(a.toString());
}
}