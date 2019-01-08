package casinoWarSingleClass;

import java.util.Scanner;

public class CasinoWar
{
	private static Scanner fromKeyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
		// TODO: implement
	}
	
	private static void playUntilQuit()
	{
		// TODO: implement
	}

	private static boolean getPlayAgainDecision(int bankroll, int minBet)
	{
		return false; // TODO: implement
	}
	
	private static String[] getShoe(int numDecks)
	{
		return null; // TODO: implement
	}
	
	private static void shuffleShoe(String[] shoe)
	{
		// TODO: implement
	}
	
	private static int getPlayerBankroll()
	{
		return -1; // TODO: implement
	}
	
	private static int getPlayerBet(int minBet, int maxBet, int bankroll)
	{
		return -1; // TODO: implement
	}

	private static String[] getCards(int numCardsToGet, String[] shoe, int numUnusedCardsInShoe)
	{
		return null; // TODO: implement
	}

	private static int getNumericValue(String card)
	{
		return -1; // TODO: implement
	}
	
	// 0: tie, positive #: player win, negative #: player loss
	private static int getResult(String playersCard, String dealersCard)
	{
		return -1; // TODO: implement
	}
	
	// true for yes, false for no
	// can't go to war if bankroll is less than original bet
	private static boolean getGoToWarDecision(int bankroll, int originalBet)
	{
		return false; // TODO: implement
	}
	
	// returns an array containing {players new bankroll, number of unused cards in shoe}
	private static int[] playOneRound(int initialBankroll, String[] shoe, int initialNumUnusedCardsInShoe)
	{
		return null; // TODO: implement
	}
}