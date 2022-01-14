// calculates pay for an employee                                                  
 // input is rate per hour and hours worked 	
   import java.util.Scanner;
	class ComputePay {
   	public static void main (String args[]){
  	//   variable declarations
     	Scanner console = new Scanner(System.in);
     	double  rate, pay , hours;
  	
  	// input required data
  	
     	System.out.println("Enter hours worked");
     	hours = console.nextDouble();
     	System.out.println("Enter rate per hour ");
     	rate =  console.nextDouble();
  	
  	// calculate basic pay
  	
     	pay = rate * hours;
  	
  	// add overtime if any
  	
     	if (hours  >  40)
        	pay = pay + (hours - 40) *(rate * .50);
  	
  	//  Display pay
   System.out.println("The pay for this employee is " + pay);
  	
  	}  // end main
  
   }  //end ComputePay

