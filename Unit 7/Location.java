public class Location {
   private int x;
   private int y;
  //
   public Location (int x, int y){
   this.x = x;
   this.y = y;
   }
   public boolean equals (Object o){
   return true;
   }     
   public String toString(){
   return (" x " + x + " y " + y);
   }
   public int  getRow(){
   return y;
   }
   public int  getCol(){
   return x;
   }
}
