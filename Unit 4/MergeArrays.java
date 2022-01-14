import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class MergeArrays{
   public static void main (String[] args){
      Random ran = new Random();
      int[] a = new int[(int)(ran.nextDouble()*5 + 5)];
      int[] b = new int[(int)(ran.nextDouble()*5 + 5)];
      for (int i = 0; i<50; i++){
         int nextA = (int)(ran.nextDouble() * 40);//*40 - 20;
         int nextB = (int)(ran.nextDouble() * 40);//*40 - 20;
         if (i<a.length)
            a[i] = nextA;
         if (i<b.length)
            b[i] = nextB;
      }
      Arrays.sort(a);
      Arrays.sort(b);
      System.out.println(a);
      System.out.println("a: "+ Arrays.toString(a));
      System.out.println("b: "+Arrays.toString(b));
      a = Merge.merge(a, b);
      System.out.println("a+b: "+Arrays.toString(a));
   }
   
}
/*
a.  Pick two random integers from 20 – 50
b.  Declare two arrays: one with as many elements as the first random number and the second with as many elements as the second random number
c.  Create two arrays of random integers both positives and negatives (think of a way to do this)
d.  Call Arrays.sort to sort both arrays.
e.  Create a third array with as many elements as the sum of the two random numbers
f.  Call the static merge method and return the merged array
g. Print out all three arrays.  DO NOT USE ARRAYS.SORT AFTER CREATING THE TWO ARRAYS
*/