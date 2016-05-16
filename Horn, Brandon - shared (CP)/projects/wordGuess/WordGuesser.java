package wordGuess;

/**
 * Implements the mechanics for a game in which the player
 * guesses letters in a hidden word.
 */
public class WordGuesser
{
	// TODO: choose instance fields
	
	/**
	 * Constructs a game with the specified word and number of guesses
	 * @param word the word to be guessed
	 * Precondition: word.length() > 0 && word contains only lowercase letters
	 * @param wrongGuessesAllowed the number of guesses allowed 
	 */
	public WordGuesser(String word, int wrongGuessesAllowed)
	{
	    if(word.length() == 0)
	        throw new IllegalArgumentException("word.length() is 0");
	    
	    if( ! containsOnlyLowerCaseLetters(word) )
	            throw new IllegalArgumentException("word contains something other than a lowercase letter");
	    
		// TODO: implement
	}
	
	/**
	 * Returns true if str contains only lowercase letters, false otherwise
	 * Note: an empty string contains only lowercase letters.
	 * @param str the string to check
	 * @return true if str contains only lowercase letters, false otherwise
	 */
	static boolean containsOnlyLowerCaseLetters(String str)
	{
	    return false; // TODO: implement
	}
	
	/**
	 * Returns the number of wrong guesses remaining
	 * @return the number of wrong guesses remaining
	 */
	public int wrongGuessesRemaining()
	{
	    return -1; // TODO: implement
	}
	
	/**
	 * Returns a string containing all of the letters that have been guessed
	 * @return a string containing all of the letters that have been guessed
	 */
	public String guessedLetters()
	{
	    return null; // TODO: implement
	}
	
	/**
	 * Returns a string containing all incorrect guesses
	 * @return a string containing all incorrect guesses
	 */
	public String incorrectGuesses()
	{
        return null; // TODO: implement
	}
	
	/**
	 * Guesses the specified letter
	 * 
	 * Precondition: guessesRemaining() > 0
	 * 
	 * @param letter the letter to guess
	 * 
	 * Precondition:   Character.isLetter(letter) &&
	 *                 Character.isLowerCase(letter) &&
	 *                 guessedLetters().indexOf(letter) == -1 
	 * 
	 * @return true if the specified letter is in the word, false otherwise
	 */
	public boolean guessLetter(char letter)
	{
		if( ! Character.isLetter(letter) || ! Character.isLowerCase(letter) )
		    throw new IllegalArgumentException("letter is not a lowercase letter");
		
		if(guessedLetters().indexOf(letter) != -1)
		    throw new IllegalArgumentException("letter has already been guessed");
	    
        return false; // TODO: implement
	}
	
	/**
	 * Returns the word with underscores for unguessed letters
	 * @return the word with underscores for unguessed letters
	 */
	public String getWordWithGuesses()
	{
	    return null; // TODO: implement
	}
	
	/**
	 * Returns the original word
	 * @return the original word
	 */
	public String getWord()
	{
        return null; // TODO: implement
	}
}