package cashRegister;

public class CashRegister
{
    // TODO: add instance fields
    
    /**
     * Constructs a CashRegister with an active transaction.
     */
    public CashRegister()
    {
        // TODO: implement constructor
    }
    
    /**
     * Adds the item with the specified price to the active transaction.
     * 
     * @param price the item's price
     * Precondition: price >= 0
     */
    public void addItem(double price)
    {
        // TODO: implement addItem
    }
    
    /**
     * Returns the total for the active transaction.
     * 
     * @return the total for the active transaction
     */
    public double getTotal()
    {
        return -1; // TODO: implement getTotal
    }
    
    /**
     * Accepts payment for the active transaction.
     * Resets for a new transaction.
     * 
     * @param amount the amount the customer paid
     * Precondition: amount >= getTotal()
     * 
     * @return the amount of change
     */
    public double acceptPayment(double amount)
    {
        return -1; // TODO: implement acceptPayment
    }
}