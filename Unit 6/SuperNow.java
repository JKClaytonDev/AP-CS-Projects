//SUBCLASS SuperNow INHERITS Checking CLASS
   public class SuperNow extends Checking
   {
   //DATA MEMBERS
      private double interestRate = 0.0;	//ANNUAL INTEREST RATE
   
   //METHOD MEMBERS
   
   //PARAMETERLESS CONSTRUCTOR
      public SuperNow()
      {
         super(0000,"",0.0);
      }//END SuperNow()
   
   //CONSTRUCTOR TO INITIALIZE ACCOUNT NUMBER AND BALANCE
      public SuperNow(int acctNum, String name,double bal)
      {
         super(acctNum,name, bal);
      }//END SuperNow(int)
   
   //CONSTRUCTOR TO INITIALIZE ALL DATA
      public SuperNow (int acctNum,String name,
      	           double bal,
      	           double min,
      	           double chg,
      	           double rate)
      {
         super(acctNum,name,bal);
         setMinimum(min);
         setCharge(chg);
         interestRate = rate;
      } //END SuperNow(int,double,double,double,double)
   
   //IMPLEMENTATION FOR addInterest() METHOD
      public void addInterest()
      {
         double interest = 0.0;	//LOCAL VARIABLE TO CALC. INTEREST
         if (getBalance() >= getMinimum())
         {
            interest = getBalance() * (interestRate/12/100);
            changeBalance(interest);
         } //END IF
      } //END addInterest()
   }//END SuperNow CLASS


