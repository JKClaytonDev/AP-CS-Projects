public class MovieTrilogy extends Movie{
   Movie m1;
   Movie m2;
   Movie m3;
   public MovieTrilogy(Movie a, Movie b, Movie c){
      super((a.getScore()+b.getScore()+c.getScore())/3, a.getTitle() + "/" + b.getTitle() + "/" + c.getTitle());
      m1 = a;
      m2 = b;
      m3 = c;
   
   }
   public String getGenre(){
      if (m1.getGenre().equals(m2.getGenre()) && m2.getGenre().equals(m3.getGenre()))
         return "Trilogy: " + (m1.getGenre());
      else
         return "Trilogy";
   }
   public String toString(){
      return ("This trilogy contains: " + super.getTitle() + " which has a score of " + super.getScore() + " and is a " + getGenre());
   }
}