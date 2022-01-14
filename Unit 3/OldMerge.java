public class OldMerge{
   public static int[] merge(int[] A, int[] B){
   //Merging arrays
      int[] c = new int[A.length+B.length];
      for (int i = 0; i<A.length; i++)
         c[i] = A[i];
      for (int i = 0; i<B.length; i++)
         c[i+A.length] = B[i];
    //Sorting arrays     
    for (int x = 1; x<c.length; x++){
         for (int i = 1; i<c.length-1; i++){
            if (c[i] > c[i+1]){
               c = replace(c, i, i+1);
               i++;
            }
            if (c[i] < c[i-1]){
               c = replace(c, i, i-1);
               i--;
            }
         }
      }
      return c;
   }
   
   public static int[] replace (int[] c, int index, int rindex){
      int t = c[rindex];
      int q = c[index];
      c[index] = t;
      c[rindex] = q;
      return c;
   }