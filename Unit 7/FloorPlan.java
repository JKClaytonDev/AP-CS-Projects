import java.util.*;
public class FloorPlan {
   private int [] [] room;
   private final int ROWS; // number of rows in this floor plan
   private final int COLS; // number of columns in this floor plan
  // constructs 2D array of integers filled with 0’s
   public FloorPlan(int r, int c){
   ROWS = r;
   COLS = c;
   room = new int[r][c];
   }   
   public void printRoom(){
   for (int i = 0; i<room.length; i++){
   for (int k = 0; k<room[i].length; k++){
   System.out.print(room[i][k]);
   }
   System.out.println();
   }
   } //prints room[] as a matrix
   public int [][] getRoom(){
   return room;
   } //returns room[]
   // makes the (r,c) cell unavailable (sets the value to 1)
   public void eliminate(int r, int c){     
      if (r>= 0 && c>=0 && r<room.length && c<room[r].length)
         room[r][c]=1;
   }
   public boolean isEmptyRegion(int top, int bottom, int left, int right){
      for (int i = 0; i<room.length; i++){
         for (int k = 0; k<room[i].length; i++){
            if (room[i][k] != 0)
               return false;
         }
      }
      return true;
   }
   public boolean fits(int width, int height, Location ulCorner){
   boolean spotFound = false;
      for (int i = 0; i<room.length-width; i++){
         for (int k = 0; k<room.length-height; k++){
         boolean found = true;
         for (int j = i; j<width; j++){
         for (int l = k; l<height; l++){
         if (room[i][k] != 0)
            found = false;
         }
         }
         if (found)
            spotFound = true;
         }
      } 
      return spotFound;
      }
   public ArrayList<Location> whereFits(int width, int height){
   ArrayList<Location> loc = new ArrayList();
   for (int i = 0; i<room.length; i++){
         for (int k = 0; k<room[i].length; i++){
            if (fits(i, k, new Location(0, 0)))
               loc.add(new Location(i, k));
         }
      }
      return loc;
      }
}
