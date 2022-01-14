  public class Checking extends BankAccount
   {
   //DATA MEMBERS
      private double minimum = 500;	//MINIMUM BALANCE TO
   				                        //AVOID CHECK CHARGE
      private double charge = 0.5;  //PER-CHECK CHARGE
   
   //METHOD MEMBERS
   
   //PARAMETERLESS CONSTRUCTOR
      public Checking()
      {
         super(0000,"",0.0);
      }//END Checking()
   
   //CONSTRUCTOR TO INITIALIZE ACCOUNT NUMBER name AND BALANCE
      public Checking(int acctNum, String name,double bal)
      {
         super(acctNum,name,bal);
      }//END Checking(int,double)
   
   //CONSTRUCTOR TO INITIALIZE ALL PRIVATE DATA
      public Checking(int acctNum, String name,double bal, double min, double chg)
      {
         super(acctNum,name,bal);
         minimum = min;
         charge = chg;
      } //END Checking(int,double,double,double)
   
   //cashCheck() METHOD
      public void cashCheck (double amt)
      {
         if ( amt > getBalance() )		//TEST FOR OVERDRAW
            System.out.println("Cannot cash check, account overdrawn.\n");
         else  				        //CASH CHECK
            if (getBalance() < minimum)		            //CHECK FOR MIN BALANCE
               changeBalance(-(amt+charge));
            else                    			        
               changeBalance(-amt);	
      } //END cashCheck()
   
      public double getMinimum()
      {
         return minimum;       //RETURN  MIN BALANCE
      }//END getMinimum
    
      public void setMinimum(double m)
      {
         minimum = m;				//set  MIN BALANCE
      
      }//END setMinimum
      
   	public void setCharge(double c)
      {
         charge = c;				//set  CHARGE
      
      }//END setCHARGE

   
   }//END Checking  CLASS


