import java.util.Random;
public class Accidents{
   static final int DAYS  = 31;
   static final int HOURS = 24;
   private static int[][] accidents;
   public Accidents(){
      accidents = new int[DAYS][HOURS];
      for (int i = 0; i<DAYS; i++){
         Random ran = new Random();
         for (int x = 0; x<HOURS; x++){
            accidents[i][x] = 1+(int)(ran.nextDouble()*9);
         }
      }
   }
   public int hourAccidents(int hour){
      if (!(hour >= 0 && hour < HOURS)){
         System.out.println("INVALID INPUT");
         return -1;
      }
      else
      {
         int totalaccidents = 0;
         for (int i = 0; i<DAYS; i++){
            totalaccidents+=(accidents[i][hour]);
         }
         return totalaccidents;
      }
   
   }
   public int totalMonth(){
      int total = 0;
      for (int i = 0; i<DAYS; i++){
         for (int x = 0; x<HOURS; x++)
            total+=accidents[i][x];
      }
      return total;
   }
   public void printAccidents(){
      System.out.println("                         Hours:");
      for (int i = 0; i<DAYS; i++){
         if (i < 10)
            System.out.print("\nDay " + i + "  || ");
         else
            System.out.print("\nDay " + i + " || ");
         for (int x = 0; x<HOURS; x++){
            System.out.print(" " + accidents[i][x]);
         }
      }
   }
   
   public int highestAccidents(){
      int[] houraccidents = new int[24];
      for (int i = 0; i<DAYS; i++){
         for (int x = 0; x<HOURS; x++){
            houraccidents[x]+=accidents[i][x];
         }
      }
      int highestAccident = 0;
      for (int i = 0; i<houraccidents.length; i++){
         if (houraccidents[highestAccident] < houraccidents[i])
            highestAccident = i;
      }
      return highestAccident;
      
     
   }
}