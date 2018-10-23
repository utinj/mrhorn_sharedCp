package inputValidation;

import java.util.Scanner;

public class InputValidation
{

    public static void main(String[] args)
    {
        Scanner fromKeyboard = new Scanner(System.in);
        
        System.out.print("Enter a number (-50 to 150): ");
        int number = fromKeyboard.nextInt();
        fromKeyboard.nextLine();
        
        while(number < -50 || number > 150)
        {
            System.out.println("\n" + number + " is not within range.");
            
            System.out.print("Enter a number (-50 to 150): ");
            number = fromKeyboard.nextInt();
            fromKeyboard.nextLine();
        }
        
        fromKeyboard.close();
        
        System.out.println(number + " is valid");
    }
}