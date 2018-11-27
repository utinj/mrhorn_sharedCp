package sentinels;

import java.util.Scanner;

public class Sentinels
{
	public static void main(String[] args)
	{
		System.out.println(getSumOfPositiveNumbers());
	}
	
	// accept input of positive numbers and find the sum
	public static int getSumOfPositiveNumbers()
	{
		Scanner fromKeyboard = new Scanner(System.in);
		
		System.out.print("Enter positive number (non-positive to quit): ");
		int input = fromKeyboard.nextInt();
		fromKeyboard.nextLine();
		
		int sum = 0;
		
		while(input > 0)
		{
			sum += input;
			
			System.out.print("Enter positive number (non-positive to quit): ");
			input = fromKeyboard.nextInt();
			fromKeyboard.nextLine();
		}
		
		fromKeyboard.close();
		
		return sum;
	}
}