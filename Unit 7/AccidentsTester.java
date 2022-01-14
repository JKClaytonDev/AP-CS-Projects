public class AccidentsTester{
   public static void main (String[] args){
      Accidents acc = new Accidents();
      acc.printAccidents();
      System.out.println("\n\nThe most accidents occured at "+timeToString(acc.highestAccidents()));
      System.out.println("There were "+(acc.hourAccidents(acc.highestAccidents())) + " accidents at " + timeToString(acc.highestAccidents()));
      //System.out.println("There were "+(acc.hourAccidents(15)) + " accidents at " + timeToString(15));
      System.out.println("There were " + acc.totalMonth() + " accidents this month");
   }
   public static String timeToString(int hour){
      String time;
      if (hour > 12){
         hour-=12;
         time = (hour + " PM");  
      }
      else
         time = (hour + " AM");
      if (hour == 0 || hour == 24)
         time = "12 AM";
      if (hour == 12)
         time = "12 PM";
      return (time);
   }
}