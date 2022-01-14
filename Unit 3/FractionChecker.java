import java.util.*;
import java.lang.Comparable;
public class FractionChecker{
   public static void main(String[] args){
      int n, d;
      Random rand = new Random();
      Fraction[] f = new Fraction [20];
      for (int j= 0; j<20; j++){
         n = rand.nextInt(20);
         d = rand.nextInt(19)+1;  // denominators cannot be 0
         f[j] = new Fraction (n,d);
      }
      Arrays.sort(f);
      
      
      System.out.println("Sorted Array\nFraction        Decimal Value");
      for(int i = 0; i<=f.length-1; i++){
         String simplifySpaces = (i + ") " + f[i]);
         String spaces = "";
         for (int x = 0; x<10-simplifySpaces.length(); x++)
            spaces+=" ";
         System.out.println(i + ") " + f[i] + "      " + spaces +  f[i].decimalValue());
      
      }
   }
}