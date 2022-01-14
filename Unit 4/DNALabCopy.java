import java.util.Scanner;
public class DNALab{
   private static boolean Debug = false;
   public static void main (String[] args){
      System.out.println("How many mismatches are allowed?");
         Scanner input = new Scanner(System.in);
         int mismatches = input.nextInt();
       System.out.print("Enter data for DNA1, Type 'Done' to continue");
      char[] DNA1 = inputChar("DNA1");
       System.out.println("Enter data for DNA2, Type 'Done' to continue");
      char[] DNA2 = inputChar("DNA2");
      System.out.println(equalsDNA(DNA1, DNA2, mismatches) + "\nGoodbye.");
      
   }
   public static char[] inputChar(String name){
      char[] DNA1 = {};
      Scanner input = new Scanner(System.in);
      String s = "";
      int amount = 0;
      while (!s.equals("Done"))
      {
         System.out.println("\n\n\n" + "Type Done to continue");
         System.out.print(name+"[] =  ");
         for (char c : DNA1)
         System.out.print(c + ", ");
         
         s = input.nextLine();
         if (s.length() == 1){
            char k = s.charAt(0);
            amount++;
            if (DNA1.length < amount+1){
               char[] temp = new char[amount];
               for (int i = 0; i < amount-1; i++)
                  temp[i] = DNA1[i];
               DNA1 = temp;
            }
            DNA1[amount-1] = k;
         }
      }
      return DNA1;
   }
   public static String equalsDNA(char[] s1, char[] s2, int mismatches){
      int length = s1.length;
      if (s2.length < length)
         length = s2.length;
      int errors = 0;
      int reversederrors = 0;
      if (s1.length != s2.length)
         return ("DNA1 does not match with DNA2.");
      for (int i = 1; i<length; i++){
         if (s1[i] != s2[i]){
            errors++;
            if (Debug)
               System.out.println(s1[i] + "is NOT equal to " + s2[i] + "(forward)");
         }
         if (s1[i] != s2[s2.length-(i+1)]){
            reversederrors++;
            if (Debug)
               System.out.println(s1[i] + "is NOT equal to " + s2[s2.length-(i+1)] + "(backwards)");
         }
      }
      if (Debug)
         System.out.println("errors: " + errors + "\nreversed errors: " + reversederrors);
      if (reversederrors > mismatches && errors > mismatches)
         return ("DNA1 does not match with DNA2.");
      else if (reversederrors < errors)
         return("DNA1 matches with DNA 2 backwards with " + reversederrors + " mismatches ( "+mismatches+" mismatches are allowed).");
      else
         return("DNA1 matches with DNA 2 forward with " + errors + " mismatches ( "+mismatches+" mismatches are allowed).");
   }
}