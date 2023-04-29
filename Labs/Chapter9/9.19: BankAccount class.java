/*Build a class called BankAccount that manages checking and savings accounts. 
The class has three private member fields: a customer name (String), the customer's savings account balance (double), 
and the customer's checking account balance (double).
Implement the following Constructor and instance methods:

    public BankAccount(String newName, double amt1, double amt2) - set the customer name to parameter newName, set the checking account 
    balance to parameter amt1 and set the savings account balance to parameter amt2. (amt stands for amount)
    public void setName(String newName) - set the customer name
    public String getName() - return the customer name
    public void setChecking(double amt) - set the checking account balance to parameter amt
    public double getChecking() - return the checking account balance
    public void setSavings(double amt) - set the savings account balance to parameter amt
    public double getSavings() - return the savings account balance
    public void depositChecking(double amt) - add parameter amt to the checking account balance (only if positive)
    public void depositSavings(double amt) - add parameter amt to the savings account balance (only if positive)
    public void withdrawChecking(double amt) - subtract parameter amt from the checking account balance (only if positive)
    public void withdrawSavings(double amt) - subtract parameter amt from the savings account balance (only if positive)
    public void transferToSavings(double amt) - subtract parameter amt from the checking account balance and 
    add to the savings account balance (only if positive)*/
public class BankAccount {
   // TODO: Build BankAccount class with methods listed above
   
    private String customerName;
   private double savingsBalance;
   private double checkingBalance;
   
   public BankAccount(String newName, double amt1, double amt2){
      this.customerName = newName;
      this.checkingBalance = amt1;
      this.savingsBalance = amt2;
      }
   public String getName(){
      return customerName;
      }
   public void setName(String newName){
      this.customerName = newName;
      }
   public double getChecking(){
      return checkingBalance;
      }
   public void setChecking(double amt){
      this.checkingBalance = amt;
      }
   
   public void setSavings(double amt){
      this.savingsBalance = amt;
      }
   public double getSavings(){
      return savingsBalance;
      }
   public void depositChecking(double amt){
      if(amt > 0){
         this.checkingBalance += amt;
         }
      }
   public void depositSavings(double amt){
      if(amt > 0){
         this.savingsBalance += amt;
         }
      }
   public void withdrawChecking(double amt){
      if(amt > 0){
         this.checkingBalance -= amt;
         }
      }
   public void withdrawSavings(double amt){
      if(amt > 0){
         this.savingsBalance -= amt;
         }
      }
   public void transferToSavings(double amt){
      if(amt > 0){
         this.checkingBalance -= amt;
         this.savingsBalance += amt;
         }
      }
   

   // main
    public static void main(String args[]) {
        BankAccount account = new BankAccount("Mickey", 500.00, 1000.00);
        account.setChecking(500);
        account.setSavings(500);
        account.withdrawSavings(100);
        account.withdrawChecking(100);
        account.transferToSavings(300);

        System.out.println(account.getName()); // Expected Mickey
        System.out.printf("$%.2f\n", account.getChecking()); // Expected 100.0
        System.out.printf("$%.2f\n", account.getSavings()); // Expected 700.0
    } 
}
