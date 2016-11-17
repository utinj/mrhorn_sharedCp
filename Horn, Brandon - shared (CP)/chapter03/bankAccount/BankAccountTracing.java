package bankAccount;

public class BankAccountTracing
{
    public static void main(String[] args)
    {
        BankAccount checking = new BankAccount(0, 0.0);
        BankAccount savings = new BankAccount(0, 0.002);
        
        checking.deposit(500); // got paid
        
        // always save 10% of what you earn
        checking.withdraw(50);
        savings.deposit(50);
        
        checking.withdraw(150); // rent
        checking.withdraw(50); // food
        
        System.out.println("Balances");
        System.out.println("Checking: " + checking.getBalance()); // statement 1
        System.out.println("Savings : " + savings.getBalance()); // statement 2
        
        checking.deposit(500); // got paid again
        
        // diligently saving 10%
        checking.withdraw(50);
        savings.deposit(50);
        
        checking.withdraw(100); // cell phone and cable
        
        System.out.println("Balances");
        System.out.println("Checking: " + checking.getBalance()); // statement 3
        System.out.println("Savings : " + savings.getBalance()); // statement 4
    }
}