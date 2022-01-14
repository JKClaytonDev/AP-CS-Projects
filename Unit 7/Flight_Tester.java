import java.util.*;
public class Flight_Tester {
              
   public static void main ( String [] args ){
      Passenger p1=new Passenger("");
      System.out.println(p1);// no passenger
      Passenger p2=new Passenger("Alice");
      System.out.println(p2);//Alice      
      Seat s1=new Seat(Seat.AISLE);       
      System.out.println(s1.getType());//  aisle
      System.out.println(s1.getPassenger());//no passenger
      System.out.println(s1);// no passenger in aisle seat
      s1.setPassenger(p2);
      System.out.println(s1);//  Alice in aisle seat
      Passenger p3=new Passenger("Barbie");
      s1.setPassenger(p3);
      System.out.println(s1);//  Alice in aisle seat    
      Flight f= new Flight(2,6);
      //
      // checking setting Passengers
      System.out.println(f.setPassenger(-1, 2, "Kelly"));//false
      System.out.println(f.setPassenger(8, 2, "Kelly"));//false
      System.out.println(f.setPassenger(0, 8, "Kelly"));//false
      System.out.println(f.setPassenger(0, -4, "Kelly"));//false
      System.out.println(f.setPassenger(8, 8, "Kelly"));//false
      System.out.println(f.setPassenger(0, 0, "Kelly"));//true
      System.out.println(f.setPassenger(0, 0, "AnotherKelly"));//false
      f.setPassenger(0, 1, "Robin");
      f.setPassenger(0, 3, "Sandy");
      f.setPassenger(0, 5, "Fran");
      f.setPassenger(1, 0, "Chris");
      f.setPassenger(1, 1, "Alex");
      f.setPassenger(1, 4, "Pat");
      f.setPassenger(1, 5, "Sam");
      f.printChart();
      System.out.println();
   //
   // checking empty Seats
      System.out.println("There are "+f.emptySeatCount("middle")+" empty seat(s) in the midddle");//1
      System.out.println("There are "+f.emptySeatCount("window")+" empty seat(s) by the window");//1
      System.out.println("There are "+f.emptySeatCount("aisle")+" empty seat(s) in the aisle");//3
      System.out.println("Total number of empty seats is "+f.emptySeatCount("any"));//4
    //  
   //  checking finding blocks
      System.out.println("\n******Finding blocks*******");
      System.out.println( f.findBlock(-3, 1));		//  -1
      System.out.println( f.findBlock(7, 1));		//  -1
      System.out.println( f.findBlock(0, 1));		//  2 or 4
      System.out.println(f.findBlock(0, 2));		//     -1
      System.out.println(f.findBlock(1, 2));		//     2
   //   
    // checking assigning spaces for a group
      Passenger [] adults= new Passenger [3];
      System.out.println("\n***Finding space for "+adults.length+" adults:");
      adults[0]=new Passenger ("Adult1");
      adults[1]=new Passenger ("Adult2");
      adults[2]=new Passenger ("Adult3");   
      if ( f.assignGroup(adults))   System.out.println( "Successful!!");
      else System.out.println( "NOT Successful!!");//NOT Successful!! 
      f.printChart();
      System.out.println("\n");
      //
      Passenger [] kids= new Passenger [2];
      System.out.println("\n***Finding space for "+kids.length+" kids:");
      kids[0]=new Passenger ("Lilly");
      kids[1]=new Passenger ("Tommy");
      if ( f.assignGroup(kids))   System.out.println( "Successful!!");//Successful!!
      else System.out.println( "NOT Successful!!");
      f.printChart();
            
   }
}