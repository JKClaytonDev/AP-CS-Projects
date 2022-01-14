import java.util.Scanner;
public class LeapYear
{
   public static void main (String[] args){
   boolean endMe = false;
   while (!endMe){
      System.out.print("Enter a year 1582 or greater (0 to quit) :    ");
      Scanner input = new Scanner(System.in);
      int year = input.nextInt();
      if (year >= 1582){
         if (year%4 == 0 && (year%100 != 0 || year%400 == 0))
            System.out.println(year + " is a leap year\n");
          else
            System.out.println(year + " is not a leap year\n");
      }
      else if (year == 0){
         System.out.println("Good-bye\n");
         endMe = true;
      }
      else
         System.out.println("ERROR: the year must be greater than 1581\n");
   }
   }
}