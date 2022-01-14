import java.util.Arrays;
import java.util.*;
public class MergeTester{
public static void main (String[] args){
Random ran = new Random();
int[] a = new int[((int)ran.nextDouble()+1)*15];
int[] b = new int[((int)ran.nextDouble()+1)*15];
for (int i = 0; i<a.length; i++)
   a[i] = (int)(ran.nextDouble()*250);
for (int i = 0; i<a.length; i++)
   b[i] = (int)(ran.nextDouble()*250);
System.out.println(Arrays.toString(merge(a, b)));
   }
   public static int[] merge(int[] A, int[] B){ 
      Arrays.sort(A);
      Arrays.sort(B);
      int[] z = new int[A.length+B.length];
      int spot = 0;
      int xspot = 0;
      int yspot = 0;
      while (spot <= z.length-1){
      //System.out.println("Moved to spot " + spot + " out of " + (z.length-1) + " xspot is " + xspot + " yspot is " + yspot + " x:"+x[xspot] + " y:"+y[yspot]);
         boolean xfit = (A.length-1 >= xspot);
         boolean yfit = (B.length-1 >= yspot);
         if (xfit && yfit){
            if (A[xspot] < B[yspot]){
            //System.out.println("Used xspot aka x["+xspot+"] instead of y["+yspot+"] - value is " + x[xspot]);
               z[spot] = A[xspot];
               xspot++;
            }
            else if (A[xspot] > B[yspot]){
            //System.out.println("Used yspot aka y["+yspot+"] instead of x["+xspot+"]] - value is " + y[yspot]);
               z[spot] = B[yspot];
               yspot++;
            }
            else if (A[xspot] == B[yspot]){
            //System.out.println("Both were equal");
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
            //System.out.println("y didn't fit, so we used x[" + xspot + "]");
            z[spot] = A[xspot];
            xspot++;
         }
         else if (yfit){
            //System.out.println("x didn't fit, so we used y[" + yspot + "]");
            z[spot] = B[yspot];
            yspot++;
         }
         spot++;
      }
      return z;
   }
}