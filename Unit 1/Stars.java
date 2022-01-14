public class Stars {
   public static void main (String[] args){
      System.out.println("\nPrint Triangle\n");
      printTriangle(5);
      System.out.println("\nPrint Arrowhead\n");
      printArrowhead(3);
      System.out.println("\nPrint Diamond\n");
      printSquareOnDiagonal(5);
      System.out.println("\nPrint X in Square\n");
      printXinSquare(10);
      System.out.println("\nPrint Stairs\n");
      printStairs(3);
   }
   public static void printTriangle(int rows){
      for (int i = 0; i<rows; i++){
         for (int f = 0; f<i+1; f++){
            System.out.print("*");
         }
         System.out.println("");
      } 
   }
   public static void printArrowhead(int width){
      for (int i = 0; i<width; i++){
         for (int f = 0; f<i+1; f++){
            System.out.print("*");
         }
         System.out.println("");
      } 
      for (int i = 0; i<width; i++){
         for (int f = 0; f<width-(i+1); f++){
            System.out.print("*");
         }
         System.out.println("");
      } 
   }


   public static void printSquareOnDiagonal(int width)  {
      width/=2;
      for (int i = 0; i<width; i++){
         for (int f = 0; f<(width-i); f++){
            System.out.print(" ");
         }
         for (int f = 0; f<2*i+1; f++){
            System.out.print("*");
         }
         System.out.println("");
      } 
      for (int i = width; i>=0; i--){
         for (int f = 0; f<(width-i); f++){
            System.out.print(" ");
         }
         for (int f = 0; f<2*i+1; f++){
            System.out.print("*");
         }
         System.out.println("");
      } 
   
   }


   public static void printXinSquare(int width) {
      width+=1;
      for (int i = 1; i <width; i++){
         for (int f = 1; f <width; f++){
            if (f == i || f == (width-i))
               System.out.print("  ");
            else
               System.out.print("* ");
         }
         System.out.println("");
      }
   }

   public static void printStairs(int numMen)  {
      for (int i = 0; i<numMen; i++){
         int f = 0;
         for (f = 0; f<numMen-i; f++){
            System.out.print("     ");
         }
      
         System.out.print(" o  ******");
      
         for (f = f; f<numMen; f++)
            System.out.print("     ");
      
         System.out.print("*\n");
      
         for (f = 0; f<numMen-i; f++)
            System.out.print("     ");
      
      
         System.out.print("/|\\ * ");
      
         for (f = f; f<numMen; f++)
            System.out.print("     ");
         System.out.print("    *\n");
      
         for (f = 0; f<numMen-i; f++){
            System.out.print("     ");
         }
         System.out.print("/ \\ * ");
      
         for (f = f; f<numMen; f++)
            System.out.print("     ");
         System.out.print("    *\n");
      
      
      }
      System.out.print("     ");
      for (int f = 0; f<numMen+1; f++)
         System.out.print("*****")              ;
      System.out.print("*");
   }

}