public class Flier{

public interface Flier
{
    void fly( );
}

public interface Flier{
  void fly( ); // public by default
}

public class Bird implements Flier{
  public void fly( ) // public must be written here {
      System.out.println("Using my wings to fly");
   }
}

public class Airplane implements Flier{
     public void fly( ){
       System.out.println("Using my jet engines to fly ");
     }
}

public class SkiJumper implements Flier{
    public void fly( ){
       System.out.println("Using skis to take me into the air ");
    }
