package rangeChecking;

import java.util.Scanner;

public class RangeChecking
{
    public static void main(String[] args)
    {
        Scanner fromKeyboard = new Scanner(System.in);
        
        System.out.print("Enter integer in range 1 - 1,000,000 (inclusive): ");
        int input = fromKeyboard.nextInt();
        
        fromKeyboard.close();
        
        // out of range
        if(input > 1000000 || input < 1)
            System.out.println("That's not an integer in the range of ...");
        
        // in range
        if(input >= 1 && input <= 1000000)
            System.out.println("We're good");
    }
}
