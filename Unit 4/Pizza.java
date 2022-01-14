import java.util.Arrays;
public class Pizza{
   private final int MAX=15;
   private String[] toppings;
   String last;
   private int numToppings;
   public Pizza(String[] i){
      if (i.length <= MAX)
         toppings = i;
      int length = 0;
      for (int z = 0; z<toppings.length; z++){
         if (toppings[z] != null && toppings[z] != "zzz")
            length++;
      }
      String[] noNulls = new String[length];
      int counter = 0;
      for (int x = 0; x<toppings.length; x++){
         if (toppings[x] != null && toppings[x] != "zzz"){
            noNulls[counter] = toppings[x];
            counter++;
         }
      }
      toppings = noNulls;
      Arrays.sort(noNulls);
   }
   public int getNumTopping(){
      int count = 0;
      for (int i = 0; i<toppings.length; i++){
         if (toppings[i] != null && toppings[i] != "zzz")
            count++;
      }
      return count;
   } 
   public void printTopping(){
      for (int i = 0; i<toppings.length; i++){
         if (toppings[i] != null && toppings[i] != "zzz")
            System.out.print(toppings[i] + ", ");
      }   
      System.out.println();
   }
   public boolean addTopping(String topping){
      boolean found = false;
      for (int i = 0; i < toppings.length && !found; i++){
         if (toppings[i] == null || toppings[i] == "zzz"){
            toppings[i] = topping;
            Arrays.sort(toppings);
            found = true;
         }
      }
      return (found);
   }
   public int binarySearch(String key) {
      int b = 0;
      int t = toppings.length-1;
      int v = b+(t/2);
      int c = 0;
      while(toppings[v].compareTo(key) != 0 && c < toppings.length * toppings.length){
         v = b+(t/2);
         if (v > toppings.length-1)
            v = toppings.length-1;
         if (v < 0)
            v = 0;
         if (toppings[v].compareTo(key) > 0)
            t/=2;
         if (toppings[v].compareTo(key) <0)
            b=b+t/2;
         c++;
      }
      if (c > toppings.length * toppings.length)
      return -1;
      return v;
   }
}