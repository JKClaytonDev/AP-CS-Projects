import java.util.Scanner;
import java.util.*;
//Jackson Clayton
//Pd 7
//10/30/19

public class DNALab{
   final static int MISMATCHES = 10;
   public static void main (String[] args){
      char[] c1 = {'j', 'a', 'c', 'k', 's', 'o', 'n'};
      char[] c2 = {'n', 'o', 's', 'k', 'c', 'a', 'j'};
      char[] c3 = {'j', 'a', 'c', 'k', 'c', 'a', 'j'};
      char[] c4 = {'c', 'o', 'm', 'p', 's', 'c', 'i'};
      char[] c5 = {'i', 'c', 's', 'p', 'm', 'o', 'c'};
      char[] c6 = {'j', 'c', 'a', 'k', 's', 'o', 'n'};
   
      System.out.println(equalsDNA(c1, c2));
      System.out.println(equalsDNA(c1, c6));
      System.out.println(equalsDNA(c1, c1));
      System.out.println(equalsDNA(c1, c4));
      System.out.println(equalsDNA(c4, c5));
      System.out.println(equalsDNA(c2, c5));
      System.out.println(equalsDNA(c2, c6));
      System.out.println(equalsDNA(c2, c3));
      System.out.println(equalsDNA(c2, c4));
      System.out.println(equalsDNA(c3, c5));
   }

   public static String equalsDNA(char[] s1, char[] s2){
      int errors = 0;
      int reversederrors = 0;
      System.out.println("\nYou entered " + Arrays.toString(s1) + " and " + Arrays.toString(s2));
      if (s1.length != s2.length)
         return ("DNA1 does not match with DNA2.");
      for (int i = 1; i<s2.length; i++){
         if (s1[i] != s2[i])
            errors++;
         if (s1[i] != s2[s2.length-(i+1)])
            reversederrors++;
      }
      if (reversederrors > MISMATCHES && errors > MISMATCHES)
         return ("DNA1 does not match with DNA2.");
      if (reversederrors < MISMATCHES && errors < MISMATCHES)
         return ("DNA1 matches DNA2 in both directions.");
      if (reversederrors < errors){
         if (reversederrors == 0)
            return("DNA1 matches with DNA 2 backwards.");
         return("DNA1 matches with DNA 2 backwards with " + reversederrors + " mismatches ( "+MISMATCHES+" mismatches are allowed).");
      }
      if (errors == 0)
         return("DNA1 matches with DNA 2 forward.");
      return("DNA1 matches with DNA 2 forward with " + errors + " mismatches ( "+MISMATCHES+" mismatches are allowed).");
   }
}