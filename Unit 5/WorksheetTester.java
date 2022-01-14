import java.util.*;
public class WorksheetTester{
   public static void main (String[] args){
   ArrayList<String> band = new ArrayList<String>();

   band = ["Christine", "Danny", "Lindsay", "Mick", "Stevie"];
   for(int i = 0; i < band.size(); i++)
   band.remove(i) ;
   System.out.println(band);


   }
}