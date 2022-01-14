public class TestingRecursion{
public static void main (String[] args){
System.out.println("fes"+fes(0));
System.out.println("home");home(9);
System.out.println("method");method(7);
System.out.println("pls"+pls(4));
System.out.println("what");what(4);
System.out.println("gigi");gigi(11, 2);
System.out.println("rig"+rig(4));
System.out.println("mm"+mm(6));
System.out.println("admin"+admin(5));
System.out.println("zz"+zz(0));
System.out.println("elvis");elvis(11);
System.out.println("sal"+sal(5));
System.out.println("puff");puff(4);
System.out.println("bbc");bbc(6, 2);
System.out.println("weirdo");weirdo(40);
System.out.println("product" + product(1));
System.out.println("negative" + negative(-3));
System.out.println("identity" + identity(10));
System.out.println("TESTA" + testA(255));
System.out.println("TESTB" + testB(255));
}
public static int fes (int n){
System.out.println("ITERATION " + n);
if (n>6)
return n-3;
else{
n=n*2;
return(n+fes(n+1));
}
}
public static void home (int n){
System.out.println("ITERATION " + n);
if (n<=1)
   System.out.print(n);
   else{
      home(n/2);
      System.out.print(", " + n);
   }
}
public static void method(int n){
System.out.println("ITERATION " + n);
if (n<=1)
   System.out.print(n);
else{
method(n-2);
System.out.print(", "+n);
}
}
public static int pls (int n){
System.out.println("ITERATION " + n);
if (n==0)
   return 5;
else if (n==1)
   return 11;
   else
   return pls(n-1)+2*pls(n-2);
}
public static void what (int z){
System.out.println("ITERATION " + z);
if (z==0)
System.out.print("z");
else{
System.out.print("{");
what(z-1);
System.out.print("}");
}
}
public static void gigi(int x, int y){
System.out.println("ITERATION " + y);
if (x/y!=0){
gigi(x/y, y);
}
System.out.print(x/y+1);
}
public static int rig (int n) {
System.out.println("ITERATION " + n);
if (n<=0)
   return 10;
else
   return n+mm(n-1);
}
public static int mm(int n){
System.out.println("ITERATION " + n);
if (n<=0)
   return 10;
   else
   return n+mm(n-1);
}
public static int admin(int n) {
System.out.println("ITERATION " + n);
if (n<=1)
   return n;
   else
   return n*admin(n-2);
}
public static int zz(int n){
System.out.println("ITERATION " + n);
if (n>10)
   return n-2;
   else{
   n=n*3;
   return n+zz(n+2);
   }
}
public static void elvis(int n){
System.out.println("ITERATION " + n);
if (n<=3)
   System.out.print(n+1);
   else{
   elvis(n-3);
   System.out.print(">>"+(n-1));
   
   }
}
public static int sal (int n){
System.out.println("ITERATION " + n);
if (n == 2)
   return 100;
   else if (n==3)
   return 200;
   else
   return (2*sal(n-1)+sal(n-2)+1);
}
public static void puff(int n){
System.out.println("ITERATION " + n);
if (n==1){
System.out.print("x");
}
else if (n%2==0){
System.out.print("{");
puff(n-1);
System.out.print("}");
}
}
public static void bbc(int p, int q){
System.out.println("ITERATION (p)" + p + " (q) " + q);
if (p/q==0)
System.out.print(p+q+1);
else{
System.out.println(p);
bbc(p/q, q);
}
}
public static void weirdo(int x){
System.out.println("ITERATION " + x);
System.out.print(x+" ");
if (x>1)
weirdo(x/2);
}
public static int product(int num){
System.out.println("ITERATION " + num);
if (num>20)
   return -1;
return num*product(-2*num);
}
public static int testA(int n){
if (n==1)
   return 1;
   else
   return n+testA(n-1);
}
public static int testB(int n){
if (n==1)
   return 1;
   else
   return testB(n)+testA(n-1);
}
public static int negative(int num){
System.out.println("ITERATION " + num);
if (num>=20)
return 5;
return negative(num+4)+2*num;
}
public static int identity(int num){
if (num < 1){
   return 10;
   }
   else
      return num + identity(num-2);
}
}