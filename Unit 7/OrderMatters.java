import java.util.Arrays;
import java.util.Random;
public class OrderMatters{
   private double[][] orderedData;
   private int rows;
   private int cols;
   public OrderMatters(int numberOfRows, int numberOfColumns){
      rows = numberOfRows;
      cols = numberOfColumns;
      orderedData = new double[rows][cols];
   }
   public void fillList(){
      for (int i = 0; i<orderedData.length; i++){
         double[] d = orderedData[i];
         System.out.println();
         for (int f = 0; f<d.length; f++){
            Random r = new Random();
            orderedData[i][f] = (r.nextDouble()*20)-10;
         }
      }
   }
   public void Print2D(){
   System.out.print("\n   \t\t");
      for (int i = 0; i<orderedData[0].length; i++){
         System.out.print("col"+i);
         for (int j = 0; j<(""+orderedData[0][i]).length()-3; j++)
            System.out.print(" ");
         if ((""+orderedData[0][i]).length() == 3)
            System.out.print("  ");
         if ((""+orderedData[0][i]).length() == 4)
            System.out.print(" ");
      }
     
      for (int i = 0; i<orderedData.length; i++  ){
      double[] d = orderedData[i];
         System.out.print("\nrow " + i + "\t\t");
         for (double f : d){
            System.out.print(f+"\t");
         }
      }
   }
   public void rowOrder(double[] rowscols){
      Arrays.sort(rowscols);
      int c = 0;
      int r = 0;
      for (double d : rowscols){
         if (r < rows) 
            orderedData[r][c] = d;
         c++;
         if (c >= cols){
            c = 0;
            r++;
         }
      }
   }
   public void columnOrder(double[] rowscols){
      Arrays.sort(rowscols);     
      int c = 0;
      int r = 0;
      for (double d : rowscols){
         if (c < cols) 
            orderedData[r][c] = d;
         r++;
         if (r >= rows){
            r = 0;
            c++;
         }
      }
   }
   public void wrappedOrder(double[] rowscols){
      Arrays.sort(rowscols);
      int c = 0;
      int r = 0;
      for (double d : rowscols){
         if (c < cols) {
            if (r%2 != 0)
            orderedData[r][orderedData[r].length-c-1] = d;
            else
            orderedData[r][c] = d;
            }
         c++;
         if (c >= cols){
            c = 0;
            r++;
         }
      }
   }
}