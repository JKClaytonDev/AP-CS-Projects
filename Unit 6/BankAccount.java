//SUPERCLASS FOR ALL BANK ACCOUNTS
public class BankAccount
{
  //DATA MEMBERS
   private int accountNumber;		//ACCOUNT NUMBER
   private String accountName;         // Account Name  
   private double balance;        	//ACCOUNT BALANCE


  //METHOD MEMBERS

  //CONSTRUCTOR TO INITIALIZE DATA MEMBERS
   public BankAccount(int acctNum, String inname, double bal)
   {
      accountNumber = acctNum;
      accountName = inname;
      balance = bal;
   } //END BankAccount(int,double)

  //deposit() METHOD
   public void deposit(double amount)
   {
      if (balance + amount < 0){
         System.out.println("insufficient funds");
         return;
      }
      balance = balance + amount;
   } //END deposit()

  //accountNum() ACCESS METHOD
   public int accountNum()
   {
      return  accountNumber; 		//RETURN ACCOUNT NUMBER
   } //END accountNumber()
 
 // accountName() Access method
   public String accountName()
   {
   
      return accountName;                // return account name
   }

  //currentBalance() ACCESS METHOD
   public double getBalance()	
   {
      return  balance; 			//RETURN ACCOUNT BALANCE
    
    
   } //END getBalance()
  
   public void changeBalance(double d)
   {
      if (balance + d < 0){
         System.out.println("insufficient funds");
         return;
      }
      balance=balance+d;				//change ACCOUNT BALANCE by adding d
   }//END changeBalance()

  
} //END BankAccount CLASS
