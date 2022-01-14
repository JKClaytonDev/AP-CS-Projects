//Jackson Clayton
//10/9/19

public class GradableRunner 
{
   public static void main(String[] args)
   {
      Student John = new Student("John");
      Student Paul = new Student("Paul");
      
      DriversEd george = new DriversEd("George");
      DriversEd ringo = new DriversEd("Ringo");
      
      
      John.addTestScore(94.5);
      John.addTestScore(45);
      John.addTestScore(29);
      John.addTestScore(99);
      
      Paul.addTestScore(74);
      Paul.addTestScore(82);
      Paul.addTestScore(0);
      Paul.addTestScore(71);
      
      george.deductPoints(5);
      george.deductPoints(4);
      george.deductPoints(7);
      
      ringo.deductPoints(1);
      ringo.deductPoints(9);
      ringo.deductPoints(2);
      
      System.out.print(John.getName()+" has a "+John.getPercent()+" percent and ");
      if(John.isPassing())
         System.out.println("is passing");
      else
         System.out.println("isn't passing");
      
      
      System.out.print(Paul.getName()+" has a "+Paul.getPercent()+" percent and ");
      if(Paul.isPassing())
         System.out.println("is passing");
      else
         System.out.println("isn't passing");
      
      System.out.print(george.getName()+" has a "+george.getPercent()+" percent and ");
      if(george.isPassing())
         System.out.println("is passing");
     else
         System.out.println("isn't passing");
      
      System.out.print(ringo.getName()+" has a "+ringo.getPercent()+" percent and ");
      if(ringo.isPassing())
         System.out.println("is passing");
      else
         System.out.println("isn't passing");
   }
}
