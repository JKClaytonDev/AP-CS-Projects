public class binarySearchTest{
   public static void main (String[] args){
      int[] z = new int[] {1, 3, 6, 9, 12, 24, 36, 48, 55, 65, 121, 244};
      search(z, 16);
   }
   public static int[] search(int[] a, int s){
      int start = 0;
      int end = a.length-1;
      printArray(a);
      while (!(a[(start+(end/2)) + 1] > s && a[(start+(end/2))] < s))
      {
         if (a[start+(end/2)] > s)
            end/=2;
         if (a[start+(end/2)] < s)
            start = end/2;
         if (start == end)
            start = end-1;
      }
      int[] n = new int[a.length+1];
      for (int i = 0; i<=(start+end/2); i++)
         n[i] = a[i];
      n[(start+end/2)+1] = s;
      for (int i = (start+end/2) + 2; i<a.length+1; i++)
         n[i] = a[i-1];
         printArray(n);
      return n;
   }
   public static void printArray(int[] a){
   System.out.println("");
         for (int i = 0; i<a.length; i++)
         System.out.print(a[i] + ", ");
   System.out.println("");
   }
}