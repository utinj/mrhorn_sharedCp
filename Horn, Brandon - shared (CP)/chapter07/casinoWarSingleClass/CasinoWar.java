package casinoWarSingleClass;

import java.util.Scanner;

public class CasinoWar
{
	private static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		
	}
	
	/**
	 * Returns a shoe containing all of the cards from the specified
	 * number of decks, in any order (does not need to be shuffled).
	 * @param numDecks the number of decks
	 * @return an array containing cards from the specified number of decks
	 */
	private static String[] getShoe(int numDecks)
	{
		return null; // TODO: implement
	}
	
	/**
	 * Shuffles the specified shoe such that the cards are arranged in
	 * random order. Does not alter the number of each card.
	 * @param shoe the shoe to be shuffled
	 */
	private static void shuffleShoe(String[] shoe)
	{
		// TODO: implement
	}
	
	/**
	 * Accepts a valid (>= 0) bankroll from the player.
	 * @return the player's bankroll
	 */
	private static int getPlayerBankroll()
	{
		return -1; // TODO: implement
	}
	
	/**
	 * Accepts a valid bet from the player. A valid bet must be no
	 * more than the player's bankroll and between minBet and maxBet, inclusive.
	 * @param minBet the minimum allowed bet
	 * @param maxBet the maximum allowed bet
	 * @param bankroll the player's bankroll
	 * @return the player's valid bet
	 */
	private static int getPlayerBet(int minBet, int maxBet, int bankroll)
	{
		return -1; // TODO: implement
	}

	/**
	 * Returns an array containing the next numCardsToGet cards from shoe.
	 * Does not alter the shoe.
	 * @param numCardsToGet the number of cards to get
	 * @param shoe the shoe containing all cards
	 * @param numUnusedCardsInShoe the number of unused cards remaining in the shoe
	 * @return an array containing the selected cards
	 */
	private static String[] getCards(int numCardsToGet, String[] shoe, int numUnusedCardsInShoe)
	{
		return null; // TODO: implement
	}

	/**
	 * Returns the numeric value of the specified card
	 * @param card the card
	 * @return the numeric value of the card
	 */
	private static int getNumericValue(String card)
	{
		return -1; // TODO: implement
	}
	
	/**
	 * Determines the result of the hand. Returns:
	 * 0 if the hand is a tie
	 * a positive number if the player wins
	 * a negative number of the dealer wins
	 * @param playersCard the player's card
	 * @param dealersCard the dealer's card
	 * @return the result of the hand as described above
	 */
	private static int getResult(String playersCard, String dealersCard)
	{
		return -1; // TODO: implement
	}
	
	/**
	 * Determines whether the player can and wants to go to war.
	 * A player cannot play again if the player's bankroll is less
	 * than their original bet.
	 * @param bankroll the player's bankroll
	 * @param originalBet the player's original bet
	 * @return true if the player can and wants to play again, false otherwise
	 */
	private static boolean getGoToWarDecision(int bankroll, int originalBet)
	{
		return false; // TODO: implement
	}
	
	/**
	 * Plays a single round of casino war. Accepts the player's bet.
	 * Deals the cards. Determines the result. Calculates the player's
	 * new bankroll.
	 * 
	 * Returns an array of length 2 containing:
	 * the player's new bankroll followed by
	 * the number of unused cards remaining in the shoe
	 *  
	 * @param initialBankroll the player's bankroll at the start of the round
	 * @param shoe the shoe
	 * @param initialNumUnusedCardsInShoe the number of unused cards in the shoe at the start of the round
	 * @return an array of length 2 containing the values described above 
	 */
	private static int[] playOneRound(int initialBankroll, String[] shoe, int initialNumUnusedCardsInShoe)
	{
		return null; // TODO: implement
	}
	
	/**
	 * Determines whether the player can and wants to play again.
	 * A player cannot play again if the player's bankroll is less
	 * than the minimum bet.
	 * @param bankroll the player's bankroll
	 * @param minBet the minimum bet
	 * @return true if this player can and wants to play again, false otherwise
	 */
	private static boolean getPlayAgainDecision(int bankroll, int minBet)
	{
		return false; // TODO: implement
	}
	
	/**
	 * Accepts the player's starting bankroll. Creates and shuffles
	 * the shoe. Plays casino war until the player runs out of money
	 * or chooses to quit (shuffling the shoe as needed).
	 */
	private static void playUntilQuit()
	{
		// TODO: implement
	}
}