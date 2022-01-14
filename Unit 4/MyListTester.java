public class MyListTester{
   public static void main (String[] args){
      String toppings[] = {"Ham" , "Buger", "Fries", "Pasta", "Burger", "help"};
      Pizza pi = new Pizza(toppings);
      pi.printTopping();
      pi.addTopping("Borger");
      pi.printTopping();
      for (int i = 0; i<25; i++){
      int k = i;
         while (k > toppings.length-1)
            k-=toppings.length;
         int v = pi.binarySearch(toppings[k]);
         if (v != -1)
         System.out.println("Found " + toppings[k] + " at spot " + v + " (Found value " + toppings[v] + ") ");
         else
         System.out.println("Didn't find value");
      }
      //System.out.println(pi.nonbinarySearch("Fries"));
   }
}