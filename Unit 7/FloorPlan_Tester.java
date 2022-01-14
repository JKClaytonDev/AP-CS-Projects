import java.util.*;
public class FloorPlan_Tester{
   public static void main (String [] args){
      FloorPlan m1= new FloorPlan (9, 9); 
      m1.eliminate(2,2);
      m1.eliminate(0,2);
      m1.eliminate(2,8);
      m1.eliminate(3,8);
      m1.eliminate(4,8);
      m1.eliminate(5,8);
      m1.eliminate(7,5);
      m1.eliminate(7,6);
      m1.eliminate(7,7);
      int[][] arr;
arr= m1.getRoom();
System.out.println (Arrays.deepToString(arr));
m1.printRoom();
int w=4, h=2;// 4 by 2 piece of furniture
System.out.println("Checking 4x2 piece");
Location loc1= new Location (2,2); System.out.println(""+loc1+"    "+m1.fits(w, h, loc1));//true
Location loc6= new Location (6,1);
Location loc2= new Location (3,6);
System.out.println(loc6+"    "+m1.fits(w, h, loc6));//false
System.out.println("testing equals "+loc2.equals(loc6));
int wi=7, hi=3;// 7 by 3 piece of furniture
System.out.println(loc2+"    "+m1.fits(wi, hi, loc2));//true
Location loc3= new Location (6,0);
System.out.println(loc3+"    "+m1.fits(wi, hi, loc3));//false

}
}
