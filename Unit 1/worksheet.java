import java.util.Scanner;
public class worksheet{
public static void main(String[] args)
{
  boolean stop = false;
while (!stop){
System.out.print("\nShe sells seashells by the seashore.\nDo you want to hear it again? ");
Scanner input = new Scanner(System.in);
	stop = (input.nextLine() != "n");
}

}
public static int zeroDigits(int digits){
   String word = (""+digits);
   int count = 0;
   for (int i = 0; i < word.length(); i++){
      if (word.charAt(i) == '0')
         count++;
   }
   return count;
}
}