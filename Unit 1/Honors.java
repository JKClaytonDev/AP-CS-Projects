import java.util.Scanner;
	class Honors {
   public int honors = 0;
 	public static void main (String[] args){
    // program to print test whether a student got first class
    // honors
       Scanner console = new Scanner(System.in);
       int student;   	// student number  - input from user
	   int mark;     	//  exam mark 	-  input from user
       int  countHons = 0; 
  	
	   System.out.println("enter student id ");
       student = console.nextInt();
   	System.out.println("enter exam mark for student  " + student);
       mark = console.nextInt();  
  	
    if (mark >= 70){
      countHons++;
      System.out.println("student " + student + " got first class honors! ");
      
      }
  	
        	}// end main
  
   }// end class


//A student is said to have gotten First Class Honors if their exam mark (score) is 70 or higher.
 
//(a)	Write a statement that could be inserted in the line marked in the code, which would print a message if the student got first class honors. Example output: student 1234  got first class honors

 
//(b)	In addition to printing a message, a count of honors students should be increased by 1 if the student got first class honors. Extend the code above to accomplish this task, and explain below what programmers must be careful about when there is more than one thing to do when a condition is satisfied.
