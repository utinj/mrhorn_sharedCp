package blackjack;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * A text based user interface that allows the user to
 * play a game of blackjack.
 */
public class BlackjackUI
{
	private Blackjack bj; 
	private Scanner fromKeyboard;
	private NumberFormat nf;
	
	/**
	 * Constructs a blackjack game with $1,000 in player bankroll
	 */
	public BlackjackUI()
	{
	    // TODO: implement
	}
	
	/**
     * Returns a valid numerical bet obtained from the player
     * @return a valid numerical bet obtained from the player
     */
    private double getValidBet()
    {
        return -1; // TODO: implement
    }
    
	/**
	 * Plays a single hand of blackjack
	 */
    public void playHand()
    {
        // TODO: implement
    }
    
    /**
     * Plays blackjack hands until the user chooses to quit
     */
    public void playHandsUntilQuit()
    {
        // TODO: implement
    }

    /**
     * Allows the player to hit until it is no longer possible
     * to do so or until the player chooses to stand
     */
	private void playPlayersHand()
	{
	    // TODO: implement
	}

	/**
	 * Displays the result of the hand (push, player win, player blackjack or loss)
	 */
	private void displayResult()
	{
	    // TODO: implement
	}

	/**
	 * Returns the numeric representation of input or -1 if input is not numeric
	 * @param input the value to be converted to a number
	 * @return numeric representation or -1
	 */
	private double stringToNumber(String input)
	{
		try
		{
			return Double.parseDouble(input);
		}
		catch(NumberFormatException e)
		{
			return -1;
		}
	}
}
