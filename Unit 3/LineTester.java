import java.util.*;
public class LineTester
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner ( System.in);
      System.out.print("What is the slope of your line? ");
      double m1 = input.nextDouble();
      System.out.print("What is the y-intercept of your line? ");
      double b1 = input.nextDouble();
      LinearFunction line = new LinearFunction(m1,b1);
      System.out.println("\nSlope of thes line is: "+line.getSlope());
      System.out.println("Y-intercept of this line is: "+line.getYIntercept());
      System.out.println("Slope-Intercept form: "+line);
      System.out.println("Root of this line is: "+line.getRoot());
     
      System.out.print("\nWhat is an x value for which you wish to solve for y? ");
      double x1 = input.nextDouble();
      double y1 = line.getYvalue(x1);
      System.out.println("\tthe y value corresponding to x = "+x1+" is " + y1);    
      System.out.print("\nWhat is an y value for which you wish to solve for x? ");
      double y2 = input.nextDouble();
      double x2 = line.getXvalue(y2);
      System.out.println("\tthe x value corresponding to y = "+y2+" is " + x2);
   }
}
