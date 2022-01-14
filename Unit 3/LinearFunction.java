public class LinearFunction{
   private double m;
   private double b;
   public LinearFunction(double m1, double b1){
      m = m1;
      b = b1;
   }
   public double getSlope(){
      return m;
   }
   public double getYIntercept(){
      return b;
   }
   public double getRoot(){
      return(-b/m);
   }
   public double getYvalue(double x){
      return(m*x+b);
   }
   public double getXvalue(double y){
      return((y-b)/m);
   }
   public String toString(){
      return("f(x) = "+m+"x + "+b);
   }
}