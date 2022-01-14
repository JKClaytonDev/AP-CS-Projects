import java.util.Random;

public class FractionTester{
   public static void main(String[] args){
      Fraction arr[] = new Fraction[10];
      Random rng = new Random();
      for(int i=0;i<arr.length;i++)
         arr[i]= new Fraction(1, 0);
      for(int i=0;i<arr.length;i++)
         for(int j=0;j<i;j++){
         System.out.println(""+arr[i]+" gcf = "+arr[i].gcf());
            System.out.println(""+arr[i]+" plus "+arr[j]+" = "+arr[i].add(arr[j]));
            System.out.println(""+arr[i]+" minus "+arr[j]+" = "+arr[i].subtract(arr[j]));
            System.out.println(""+arr[i]+" times "+arr[j]+" = "+arr[i].multiply(arr[j]));
            System.out.println(""+arr[i]+" divided by "+arr[j]+" = "+arr[i].divide(arr[j]));
            System.out.println("The decimal value of "+arr[i]+" is "+arr[i].decimalValue());
         }
      Fraction arr2[] = new Fraction[4];
      arr2[0] = new Fraction();
      arr2[1] = new Fraction(3,8);
      arr2[2] = new Fraction(8,12);
      arr2[3] = new Fraction(3,8);
      for(int i=0;i<arr2.length;i++)
         for(int j=0;j<i;j++)
            System.out.println(""+arr2[i]+" equals "+arr2[j]+" = "+arr2[i].equals(arr2[j]));
   }
}  