    public class SimpleDateTester {
      public static void main(String[] args) {
      
      // Test the one argument constructor.
      // Expected output: date1 Year: 2002
      //                  date1 Month: 1
         SimpleDate date1 = new SimpleDate(2002);
         System.out.println("date1 Year: " + date1.getYear());
         System.out.println("date1 Month: " + date1.getMonth());
      
      // Test the two argument constructor.
      // Expected output: date2 Year: 2001
      //                  date2 Month: 8
         SimpleDate date2 = new SimpleDate(8,2001);
         System.out.println("date2 Year: " + date2.getYear());
         System.out.println("date2 Month: " + date2.getMonth());
      
      // Test the two argument constructor with invalid months.
      // Expected output: date3 Month: 1
      //                  date4 Month: 1
         SimpleDate date3 = new SimpleDate(13,2001);
         SimpleDate date4 = new SimpleDate(0,2001);
         System.out.println("date3 Month: " + date3.getMonth());
         System.out.println("date4 Month: " + date4.getMonth());
         // checking leap year:
         // •	A year that is not divisible by 4.
         SimpleDate date5 = new SimpleDate(1997);// false
         System.out.println("Is date5 a leap year? " + date5.isLeapYear());
      // •	A year that is divisible by 4 but not divisible by 100 or 400. 
         SimpleDate date6 = new SimpleDate(2016);//true
         System.out.println("Is date6 a leap year? " + date6.isLeapYear());
      // •	A year that is divisible by 4 and 100 but not 400.
         SimpleDate date7 = new SimpleDate(1900);//false
         System.out.println("Is date7 a leap year? " + date7.isLeapYear());
      
      // •	A year that is divisible by 4 and 100 and 400. 
         SimpleDate date8 = new SimpleDate(2000);//true
         System.out.println("Is date8 a leap year? " + date8.isLeapYear());
      // •	A year prior to 1582 that is a leap year. 
         SimpleDate date9 = new SimpleDate(2, 1580);//true
         System.out.println("Is date9 a leap year? " + date9.isLeapYear());
         
         System.out.println("Num. of days in "+date9.getMonth()+" of " + date9.getYear()+" is "+date9.daysInMonth()); // 29 day in Feb, leap year
      //	A year prior to 1582 that is not a leap year.
     
         SimpleDate date10 = new SimpleDate(3, 1541);//false
         System.out.println("Is date10 a leap year? " + date10.isLeapYear());
         System.out.println("Num. of days in "+date10.getMonth()+" of " + date10.getYear()+" is "+date10.daysInMonth());// 31 day in march, not leap
      
       // Test the 3 argument3 constructor.
      // Expected output: date11:  10/5/2001
         SimpleDate date11 = new SimpleDate(5,10,2001);
         System.out.println("date11:  "+date11.getShortDate());
         // Expected output: date12:  1/1/2001
         SimpleDate date12 = new SimpleDate(45,13,2001);
         System.out.println("date12:  "+date12.getShortDate());
          // Expected output: date13:  2/29/1580
         SimpleDate date13 = new SimpleDate(29,2, 1580);
         System.out.println("date13:  "+date13.getShortDate());
         
      // Expected output: date14:  7/1/1998
         SimpleDate date14 = new SimpleDate(0,7,1998);
         System.out.println("date14:  "+date14.getShortDate());
      //Test getLongDate method
      // Expected output: date15:  August 26, 1774
         SimpleDate date15 = new SimpleDate(26,8,1774);
         System.out.println("date15:  "+date15.getLongDate());
         // advance year test
         SimpleDate date16 = new SimpleDate(28,12,1775); // regular day, not leap year
         System.out.println("date16:  "+date16.getLongDate());
         date16.advanceYear(); // expected: date16 plus a year:  December 28, 1776
         System.out.println("date16 plus a year:  "+date16.getLongDate());
         
         SimpleDate date17 = new SimpleDate(29,2,1808); // 29 Feb. leap year
         System.out.println("date17:  "+date17.getLongDate());
         date17.advanceYear();// expected: date17 plus a year:  Februaury 28, 1809
         System.out.println("date17 plus a year:  "+date17.getLongDate());
         SimpleDate date18 = new SimpleDate(29,6,1808); // 29 June leap year
         System.out.println("date18:  "+date18.getLongDate());
         date18.advanceYear();// expected: date18 plus a year:  June 29, 1809
         System.out.println("date18 plus a year:  "+date18.getLongDate());

      // advance month test: regular date
         SimpleDate date19 = new SimpleDate(20,3,1900); // 20 March 1900
         System.out.println("date19:  "+date19.getLongDate());
         date19.advanceMonth();// expected: date19 plus a month:  April 20 1900
         System.out.println("date19 plus a month:  "+date19.getLongDate());
      // advance month test: day exceeds the next month length
         SimpleDate date20 = new SimpleDate(31,10,2001); // 
         System.out.println("date20:  "+date20.getLongDate());
         date20.advanceMonth();// expected: date20 plus a month:  30 Nov. 2001
         System.out.println("date20 plus a month:  "+date20.getLongDate());
      // advance month test: december --> next year
         SimpleDate date21 = new SimpleDate(15,12,2001); // 
         System.out.println("date21:  "+date21.getLongDate());
         date21.advanceMonth();// expected: date21 plus a month:  15 Jan. 2002
         System.out.println("date21 plus a month:  "+date21.getLongDate());
      // advance month test: January 31 --> Feb.28/29
         SimpleDate date22 = new SimpleDate(31,1,2000); //  jan.31 leap year -> feb 29.
         System.out.println("date22:  "+date22.getLongDate());
         date22.advanceMonth();// expected: ddate22 plus a month:  February 29, 2000
         System.out.println("date22 plus a month:  "+date22.getLongDate());
      //
         SimpleDate date23 = new SimpleDate(31,1,1999); //  jan.31  NOT leap year -> feb 28.
         System.out.println("date23:  "+date23.getLongDate());
         date23.advanceMonth();// expected: ddate23 plus a month:  February 28, 1999
         System.out.println("date23 plus a month:  "+date23.getLongDate());
      
      // advance a day test: regular date
         SimpleDate date24 = new SimpleDate(15,5,1789); // 
         System.out.println("date24:  "+date24.getLongDate());
         date24.advanceDay();// expected: date24 plus a day:  May 16 1789
         System.out.println("date24 plus a day:  "+date24.getLongDate());
       // advance a day test: the end of the month
         SimpleDate date25= new SimpleDate(31,5,1789); // 
         System.out.println("date25:  "+date25.getLongDate());
         date25.advanceDay();// expected: date25 plus a day:  June 1 1789
         System.out.println("date25 plus a day:  "+date25.getLongDate());
         // advance a day test: 31 December
         SimpleDate date26 = new SimpleDate(31,12,1789); // 
         System.out.println("date26:  "+date26.getLongDate());
         date26.advanceDay();// expected: date26 plus a day:  Jan.1 1790
         System.out.println("date 26 plus a day:  "+date26.getLongDate());

      }
   }
/*
   date1 Year: 2002
 date1 Month: 1
 date2 Year: 2001
 date2 Month: 8
 date3 Month: 1
 date4 Month: 1
 Is date5 a leap year? false
 Is date6 a leap year? true
 Is date7 a leap year? false
 Is date8 a leap year? true
 Is date9 a leap year? true
 Num. of days in 2 of 1580 is 29
 Is date10 a leap year? false
 Num. of days in 3 of 1541 is 31
 date11:  10/5/2001
 date12:  1/1/2001
 date13:  2/29/1580
 date14:  7/1/1998
 date15:  August 26, 1774
 date16:  December 28, 1775
 date16 plus a year:  December 28, 1776
 date17:  February 29, 1808
 date17 plus a year:  February 28, 1809
 date18:  June 29, 1808
 date18 plus a year:  June 29, 1809
 date19:  March 20, 1900
 date19 plus a month:  April 20, 1900
 date20:  October 31, 2001
 date20 plus a month:  November 30, 2001
 date21:  December 15, 2001
 date21 plus a month:  January 15, 2002
 date22:  January 31, 2000
 date22 plus a month:  February 29, 2000
 date23:  January 31, 1999
 date23 plus a month:  February 28, 1999
 date24:  May 15, 1789
 date24 plus a day:  May 16, 1789
 date25:  May 31, 1789
 date25 plus a day:  June 1, 1789
 date26:  December 31, 1789
 date 26 plus a day:  January 1, 1790



*/
