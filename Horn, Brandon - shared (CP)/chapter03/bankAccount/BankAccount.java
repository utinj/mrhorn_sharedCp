package bankAccount;

/**
 * A bank account with a balance and the ability to
 * earn interest monthly
 */
public class BankAccount
{
    private double balance;
    private double interestRate; // monthly interest rate (not annual)
    
    /**
     * Constructs a bank account with the specified monthly
     * interest rate and a $0 balance.
     * @param rate the account's monthly interest rate
     */
    public BankAccount(double rate)
    {
        balance = 0;
        interestRate = rate;
    }

    /**
     * Constructs a bank account with the specified initial balance
     * and interest rate
     * @param initialBalance the account's starting balance
     * @param rate the account's interest rate
     */
    public BankAccount(double initialBalance, double rate)
    {
        balance = initialBalance;
        interestRate = rate;
    }
    
    /**
     * Returns this account's balance.
     * @return this account's balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * Returns this account's interest rate.
     * @return this account's interest rate
     */
    public double getInterestRate()
    {
        return interestRate;
    }
    
    /**
     * Sets this account's interest rate to the specified rate.
     * @param newRate the new interest rate
     */
    public void setInterestRate(double newRate)
    {
        interestRate = newRate;
    }

    /**
     * Deposits the specified amount into this account
     * @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * Withdraws the specified amount from this account
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    /**
     * Adds interest to this account.
     * @return the amount of interest added
     */
    public double addInterest()
    {
        double interest = balance * interestRate;
        balance += interest;
        return interest;
    }
}
