package bankAccount;

import java.text.NumberFormat;

public class BankAccountTester
{
    public static void main(String[] args)
    {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        System.out.println("You opened an account no money and a terrible interest rate.");
        System.out.println("I opened an account much money and an ok interest rate.");
        BankAccount yours = new BankAccount(0.002);
        BankAccount mine = new BankAccount(150000, 0.004);
        
        System.out.println("Your initial balance: " + nf.format(yours.getBalance()));
        System.out.println("My initial balance: " + nf.format(mine.getBalance()));
        
        
        System.out.println("\nYou got paid $500!");
        yours.deposit(500);
        
        System.out.println("Your balance after you got paid: " + nf.format(yours.getBalance()));
        System.out.println("My balance after you got paid: " + nf.format(mine.getBalance()));
        
        
        System.out.println("\nYou paid me $100 for tutoring");
        yours.withdraw(100);
        mine.deposit(100);
        
        System.out.println("Your balance after paying me: " + nf.format(yours.getBalance()));
        System.out.println("My balance after you paid me: " + nf.format(mine.getBalance()));
        
        
        System.out.println("\nWe both earned interset at the end of the month.");
        System.out.println("You earned: " + nf.format(yours.addInterest()) + " in interest");
        mine.addInterest();
        
        System.out.println("Your balance after earning interest: " + nf.format(yours.getBalance()));
        System.out.println("My balance after earning interest: " + nf.format(mine.getBalance()));
    }
}
