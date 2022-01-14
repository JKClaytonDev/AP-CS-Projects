//Jackson Clayton
//10/1/19
//Pd 7
public class SimpleDate{
   private int y;  //years
   private int d;  //days
   private int m;  //months
   int[] daysInMonth;  // a dynamic list, shows the amount of days in each month.
   static int[] nonLeapYearDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //the first static list, the amount of days in a non-leap year
   static int[] leapYearDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};  //the second static list, the amount of days in a non-leap year
   static String[] wordsForMonth = {"None", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; //month names, i need to set the first to "none" because there is no month marked as 0

   
   //Constructs with only year
   public SimpleDate(int Year){ 
      y = Year;
      d = 1;
      m = 1;
      
   }


   //Constructs with month and year
   public SimpleDate(int Month, int Year){
      y = Year;
      d = 1;
      if (Month <= 12 && Month >= 1)
         m = Month;
      else
         m = 1;
   }


   //Constructs with day, month and year
   public SimpleDate(int Day, int Month, int Year){
      y = Year;
      d = Day;
      if (Month <= 12 && Month >= 1)
         m = Month;
      else
         m = 1;
      if (Day < 1)
         Day = 1;
      
      d = Day;
   }


   //returns year
   public int getYear(){
      return y;
   }


   //returns month
   public int getMonth(){
      return m;
   }


   //returns day
   public int getDay(){
      return d;
   }


   //true if it isn't a leap year
   public boolean isLeapYear(){
      return (y%4 == 0 && (!(y%100 == 0) || (y%400 == 0)));
   }


   //returns amount of days in each month, depending on if it is/isn't a leap year
   public int daysInMonth(){
      if (!isLeapYear())
         daysInMonth = nonLeapYearDays;
      else
         daysInMonth = leapYearDays;
      
      return daysInMonth[m];
   }


   //advances by 1 year
   public void advanceYear(){
      d+=365;
      
      if (!isLeapYear())
         daysInMonth = nonLeapYearDays;
      else
         daysInMonth = leapYearDays;
      
      while(d > daysInMonth[m]){
      
         if (!isLeapYear())
            daysInMonth = nonLeapYearDays;
         else
            daysInMonth = leapYearDays;
         
         d-=daysInMonth[m];
         m++;
         if (m > 12){
            m = 1;
            y++;
         } 
      }
   }


   //advances by one month
   public void advanceMonth(){
      
      if (!isLeapYear())
         daysInMonth = nonLeapYearDays;
      else
         daysInMonth = leapYearDays;
      
      m+=1;
      if (m > 12)
      m = 1;
      if (d > daysInMonth[m])
         d = daysInMonth[m];
   }


    //advances by one day
   public void advanceDay(){
      if (!isLeapYear())
         daysInMonth = nonLeapYearDays;
      else
         daysInMonth = leapYearDays;
      
      d+=1;
      
      while(d > daysInMonth[m]){
            if (!isLeapYear())
         daysInMonth = nonLeapYearDays;
      else
         daysInMonth = leapYearDays;
         if (m < 12)
         d-=daysInMonth[m+1];
         else
         d-=daysInMonth[1];
         m++;
         if (m > 12){
            m = 1;
            y++;
         } 
      }
   }


   //gives the short (number only) version of the date
   public String getShortDate(){
      return (m+"/"+d+"/"+y);
   }


   //gives the long (month as a word) version of the date
   public String getLongDate(){
      return (wordsForMonth[m] + " " + d + ", " + y);
   }
}