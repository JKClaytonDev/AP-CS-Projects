public class SciFiMovie extends Movie{
   double level;
   public SciFiMovie(int score, String title, double lvl){
      super(score, title);
      level = lvl;
   }
   public String getGenre(){
      return "SciFi";
   }
   public double getLevel(){
      return level;
   }
   public String toString(){
      return(super.toString() + " and has a complexity of: " + level);
   }

}