import java.util.Random;
public class OrderMattersTester{
   static final boolean round = false;
   static final boolean random = false;
   public static void main (String[] args){
      Random h = new Random();
      int rows = 6+h.nextInt(5);
      int columns = 6+h.nextInt(5);
      OrderMatters o = new OrderMatters(rows, columns);
      double[] d = new double[rows*columns];
      double val = 1.0;
      for (int i = 0; i<d.length; i++){
         Random r = new Random();
         if (random)
         d[i] = 5+(r.nextDouble()*6);
         else
         d[i] = val;
         if (round)
         d[i] = (d[i]-d[i]%1);
         val++;
         }
      System.out.println("\n\n\nSET A:");
      System.out.println("\n\nRow Order:");
      o.rowOrder(d);
      o.Print2D();
      
      System.out.println("\n\n\nColumn Order:");
      o.columnOrder(d);
      o.Print2D();
      
      System.out.println("\n\n\nWrapped Order:");
      o.wrappedOrder(d);
      o.Print2D();
   
      rows = 6+h.nextInt(5);
      columns = 6+h.nextInt(5);
      OrderMatters y = new OrderMatters(rows, columns);
      d = new double[rows*columns];
      val = 1.0;
      for (int i = 0; i<d.length; i++){
         Random r = new Random();
         if (random)
         d[i] = 5+(r.nextDouble()*6);
         else
         d[i] = val;
         if (round)
         d[i] = (d[i]-d[i]%1);
         val++;
         }
       System.out.println("\n\n\nSET B:");
       
      System.out.println("\n\nRow Order:");
      y.rowOrder(d);
      y.Print2D();
      
      System.out.println("\n\n\nColumn Order:");
      y.columnOrder(d);
      y.Print2D();
      
      System.out.println("\n\n\nWrapped Order:");
      y.wrappedOrder(d);
      y.Print2D();
      
      rows = 6+h.nextInt(5);
      columns = 6+h.nextInt(5);
      OrderMatters s = new OrderMatters(rows, columns);
      d = new double[rows*columns];
      val = 1.0;
      for (int i = 0; i<d.length; i++){
         Random r = new Random();
         if (random)
         d[i] = 5+(r.nextDouble()*6);
         else
         d[i] = val;
         if (round)
         d[i] = (d[i]-d[i]%1);
         val++;
         }
       System.out.println("\n\n\nSET C:");
      
      System.out.println("\n\nRow Order:");
      s.rowOrder(d);
      s.Print2D();
      
      System.out.println("\n\n\nColumn Order:");
      s.columnOrder(d);
      s.Print2D();
      
      System.out.println("\n\n\nWrapped Order:");
      s.wrappedOrder(d);
      s.Print2D();
   }
}