public class WSRecursionPractice{
   public static void main (String[] args){
   System.out.println("38%4 == " + 38%4);
   System.out.println("\n\n\n mist" + mist(5));
   System.out.println("\n\n\n misty");
   misty(38);
   System.out.println("\n\n\n mistier" + mistier(3));
   System.out.println("\n\n\n mistiest" + mistiest(2));
   System.out.println("\n\n\n whoKnows" + whoKnows(5));
   System.out.println("\n\n\n weird" + weird(2, 2));
   System.out.println("\n\n\n weirder" + weirder(3, 2));
   System.out.println("\n\n\n weirdest");
   weirdest(40);
   }
   public static int mist(int n){
   System.out.println("TEMP " + n);
      if (n == 1)
         return 3;
      
      return 3*mist(n-1);
   }
   public static void misty(int n){
   System.out.println("TEMPMISTY " + n);
      if (n>4)
         misty(n%4);
      System.out.println(n/4 + " ");
      System.out.println("TEMPMISTY " + n);
   }
   public static int mistier(int n){
   System.out.println("TEMP " + n);
   if (n == 0)
      return 1;
      return 4*mistier(n-1)+2;
   }
   public static int mistiest(int n){
   System.out.println("TEMP " + n);
   if (n==6)
      return 6;
      else
      return 2*mistiest(n+1);
   }
   public static int whoKnows(int n){
   System.out.println("TEMP " + n);
   if (n<=1)
      return n;
      else
      return n+whoKnows(n-1);
   }
   public static int weird(int p, int q){
   System.out.println("TEMP " + p + " TEMP " + q);
   if (p==1)
      return p+1;
    if (q==0)
      return weird(p-1, q);
    else
      return weird(p-1, weird(p, q-1));
   }
   public static int weirder(int r, int s){
   System.out.println("TEMP " + r + " TEMP " + s);
   if (r == 0 || r == s)
      return 1;
      return weirder(r-1, s) + weirder(r-1, s-1);
   }
   public static void weirdest(int x){
   
   if (x> 1)
   weirdest(x/2);
   else
   System.out.println(x+" ");
   }
}