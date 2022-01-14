//TOGGLE CSD WITH F2/SHIFT F2
import java.util.Scanner;
import java.util.Arrays;
public class Factoring{
   public static void main (String[] args){
      System.out.println("Input Number:");
      Scanner sc = new Scanner(System.in);
      int target = sc.nextInt();
      int[] multipliers = new int[25];
      int lowest;
      for (int i = 0; target != 1; i++){
      for (lowest = 2; lowest<target && target%lowest != 0; lowest++){
         
      }
      target/=lowest;
      multipliers[i] = lowest;
      }
      String[] multiplierString = new String[25];
      for (int i = 0; i<25; i++)
         multiplierString[i] = multipliers[i]+"";
      for (int i = 0; i<multipliers.length; i++){
         for (int k = i; k<multipliers.length; k++){
            if (k != i && multipliers[i] == multipliers[k] && multipliers[i] != 0){
               multiplierString[i] = multipliers[i]+"/\\2";
               multiplierString[k] = 0+"";
               multipliers[k] = 0;
               }
         }
      }
      System.out.println(multiplierString[0]);
      for (int i = 0; i<multiplierString.length; i++){
         if (multiplierString[i] != "0")
            System.out.print(" * " + multiplierString[i]);

      }
   }
}