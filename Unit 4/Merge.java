import java.util.Arrays;
import java.util.*;
public class Merge{
   public static void main (String[] args){
      Random ran = new Random();
      int[] a = new int[((int)ran.nextDouble()+1)*15];
      int[] b = new int[((int)ran.nextDouble()+1)*15];
      for (int i = 0; i<a.length; i++)
         a[i] = (int)(ran.nextDouble()*250);
      for (int i = 0; i<a.length; i++)
         b[i] = (int)(ran.nextDouble()*250);
      System.out.println("Array A: " + Arrays.toString(a));
      System.out.println("Array B: " + Arrays.toString(b));
      int[] tempA = a;
      int[] tempB = b;
      Arrays.sort(tempA);
      Arrays.sort(tempB);
      System.out.println("Array A (Sorted): " + Arrays.toString(tempA));
      System.out.println("Array B (Sorted): " + Arrays.toString(tempB));
      System.out.println("Merged Array: " + Arrays.toString(merge(a, b)));
   }
   public static int[] merge(int[] A, int[] B){ 
      Arrays.sort(A);
      Arrays.sort(B);
      int[] z = new int[A.length+B.length];
      for (int spot = 0, xspot = 0, yspot = 0; spot <= z.length-1; spot++){
         boolean xfit = (A.length-1 >= xspot);
         boolean yfit = (B.length-1 >= yspot);
         if (xfit && yfit){
            if (A[xspot] < B[yspot]){
               z[spot] = A[xspot];
               xspot++;
            }
            else if (A[xspot] > B[yspot]){
               z[spot] = B[yspot];
               yspot++;
            }
            else if (A[xspot] == B[yspot]){
               z[spot] = B[yspot];
               if (spot != z.length-1){
                  spot++;
                  z[spot] = B[yspot];
                  yspot++;
                  xspot++;
               }
            }
         }
         else if (xfit){
            z[spot] = A[xspot];
            xspot++;
         }
         else if (yfit){
            z[spot] = B[yspot];
            yspot++;
         }
      }
      return z;
   }
}