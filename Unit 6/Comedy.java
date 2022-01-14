public class Comedy extends Movie{
   int averageLaughs;
   public Comedy(int score, String title, int avgLaughs){
      super(score, title);
      averageLaughs = avgLaughs;
   }
   public String getGenre(){
      return "Comedy";
   }
   public int getLaughs(){
      return averageLaughs;
   }
   public String toString(){
      return(super.toString() + " average Laughs: " + averageLaughs);
   }
}