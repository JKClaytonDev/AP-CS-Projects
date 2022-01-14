public class TransactionsTester
{

   public static void main (String[] args)
   {
   
   // define bankAccount objects
   
      Checking joeSoap = new Checking(0001,"Joe Soap",0);
      SuperNow joeBloggs = new SuperNow(0002,"Joe Bloggs", 1050);
      Savings  graceHopper1 = new Savings(0003,"Grace Hopper",2500.0);
      Checking graceHopper2 = new Checking(0004,"Grace Hopper ",0.0);
      Savings  maryWhite = new Savings();
   
   // checking account transactions
   
      joeSoap.deposit(2500);  // calls method from super class
      joeSoap.cashCheck(500.00); //calls method from Checking class
      joeSoap.cashCheck(500.00); 
      joeSoap.cashCheck(700.75); 
      joeSoap.cashCheck(200.75);
   
      graceHopper2.deposit(2500);
      graceHopper2.cashCheck(25.75);
      graceHopper2.cashCheck(75.25);
   
   // super now account transactions
      joeBloggs.deposit(2000.00);
      joeBloggs.cashCheck(200.00);
   
   // savings account transactions
   
      graceHopper1.deposit(2000.00);
      graceHopper1.withdraw(350);
   
      MoneyMarket joe = new MoneyMarket (316989, "Joe Joey", 40);
   
   
   // add interest and report account balances
      joeBloggs.addInterest();  // SuperNow add interest
      graceHopper1.addInterest(); // Savings add interest
      System.out.println("\n\n\t\t\tAccount Statement");
      System.out.println("Account Number: "+ joeSoap.accountNum() +  "\tName: " + joeSoap.accountName() + " " + joeSoap.getBalance());
      System.out.println("\n\n\t\t\tAccount Statement");
      System.out.println("Account Number: "  + joeBloggs.accountNum() + "\tName: " + joeBloggs.accountName() + " " + joeBloggs.getBalance());
      System.out.println("\n\n\t\t\tAccount Statement");
      System.out.println("Account Number: " + graceHopper1.accountNum() + "\tName: " + graceHopper1.accountName() + " " + graceHopper1.getBalance());
      System.out.println("\n\n\t\t\tAccount Statement");
      System.out.println("Account Number: "+ graceHopper2.accountNum()+ "\tName: "+ graceHopper2.accountName()+  " " + graceHopper2.getBalance());
      System.out.println("\n\n\t\t\tAccount Statement");
      System.out.println("Account Number: " + maryWhite.accountNum() + "\tName: " + maryWhite.accountName() + " " + maryWhite.getBalance());
      for (int i = 0; i<10; i++){
         System.out.println("Account Number: " + joe.accountNum() + "\tName: " + joe.accountName() + " " + joe.getBalance());
         joe.withdraw(-5);
      }
   }

}
