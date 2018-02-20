package cashRegister;

import java.util.Scanner;

public class CashRegisterUI
{
    // TODO: add instance fields
    
    /**
     * Constructs a CashRegisterUI ready to start a transaction.
     */
    public CashRegisterUI()
    {
        // TODO: implement constructor
    }
    
    /**
     * Accepts a valid price from the user
     * or a blank line for no more items.
     * @return a valid price or -1 if no more items
     */
    double acceptValidPrice() // package access for testing
    {
        return -2; // TODO: implement acceptValidPrice
    }
    
    /**
     * Accepts all items from the user.
     * Displays total when finished accepting items
     */
    void acceptAllItemsAndDisplayTotal() // package access for testing
    {
        // TODO: implement acceptAllItemsAndDisplayTotal
    }
    
    void acceptValidPaymentAndDisplayChange() // package access for testing
    {
        // TODO: implement acceptValidPaymentAndDisplayChange
    }
    
    /**
     * Conducts a single transaction including accepting
     * items, accepting payment and making change.
     */
    public void conductTransaction()
    {
        // TODO: implement conductTransaction
    }
    
    /**
     * Returns true if value can be parsed to a double, false otherwise.
     * @param value the value to check
     * @return true if value can be parsed to a double, false otherwise.
     */
    private static boolean isDouble(String value)
    {
        try
        {
            Double.parseDouble(value);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
        return true;
    }
}