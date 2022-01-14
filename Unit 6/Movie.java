public abstract class Movie implements Comparable<Movie>{
   int score;
   String title;
   public Movie (int scoreIn, String titleIn){
      score = scoreIn;
      title = titleIn;
   }
   public int compareTo(Movie comparable){
      if (comparable.getScore() > score)
         return 1;
      if (comparable.getScore() == score)
         return 0;
      return -1;
   
   }
   public int getScore(){
      return score;
   }
   public String getTitle(){
      return title;
   }
   public String toString(){
      return ("Title: " + title + " Score: " + score);
   }
   public abstract String getGenre();
}