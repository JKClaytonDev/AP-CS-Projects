public class movieTester{
   public static void main (String[] args){
      Comedy c = new Comedy(15, "Shrek", 100);
      Comedy m = new Comedy(35, "Shrek 64" , 110);
      Comedy j = new Comedy(45, "Shrek 128" , 110);
      SciFiMovie b = new SciFiMovie(10, "Star Wars", 200);
      SciFiMovie w = new SciFiMovie(20, "Star Wars 76", 300);
      SciFiMovie k = new SciFiMovie(25, "Star Wars The Last Jedi", 300);
      MovieTrilogy f = new MovieTrilogy(c, b, w);
      System.out.println(f.toString());
      System.out.println(c.getLaughs());
      System.out.println(b.getLevel());
      System.out.println(c.toString());
      System.out.println(m.toString());
      System.out.println("Compare to: " + c.compareTo(m));
      System.out.println("Trilogy rating " + f.getScore());
      MovieTrilogy g = new MovieTrilogy(c, m, j);
      System.out.println("Compare to: " + g.compareTo(f));
      System.out.println(g.toString());
      System.out.println(k.toString());
      System.out.println(k.getTitle());
      System.out.println(k.toString());
      System.out.println(k.getGenre());
      System.out.println(j.toString());
      System.out.println(j.getTitle());
      System.out.println(j.toString());
      System.out.println(j.getGenre());
      System.out.println(c.toString());
      System.out.println(c.getTitle());
      System.out.println(c.toString());
      System.out.println(c.getGenre());
      System.out.println(c.toString());
      System.out.println(j.toString());
      System.out.println(k.toString());
      System.out.println(g.toString());
      System.out.println(m.toString());
   }
}