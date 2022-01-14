import java.util.*;
public class TestReview{
   public static void main (String[] args){
     double width = 55;
     double height = 40;
     while ((width > 0) && (height/width > 5))
     {
     System.out.print((width > 0) && (height/width > 5));
     System.out.print((width == 0) && (height/width > 5));
     System.out.print((width<=0) && (height/width > 5));
     System.out.print((width==0) || (height/width > 5));
     System.out.print((width<=0) || (height/width > 5));
      height-=width;
      width-=2;
     }
   }
}