//Jackson Clayton
public class MoneyMarket extends Savings{
   private int numWithdrawals;
   public MoneyMarket(int acctNum,String name,double bal){
      super(acctNum,name, bal);
      numWithdrawals = 0;
   }
   public void withdraw(double amt)
   {
      if (getBalance() + amt > 0){
         numWithdrawals++;
         if (numWithdrawals > 3)
            deductPenalty();
         super.withdraw(amt);
      }
      else
      {
         System.out.println("insufficient funds");
      }
   }
   public void deductPenalty(){
      super.changeBalance(-getBalance()/100);
   }
}