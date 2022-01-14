import java.util.Arrays;
public class wsTester{
public static void main (String[] args){
double[] zz, top = {12.1, 13.1, 14.1, 15.1, 18};
  zz = top;
  zz[2] = 99;
  top[3] = 100.2;
System.out.println(Arrays.toString(zz));
System.out.println(Arrays.toString(top));

}
}