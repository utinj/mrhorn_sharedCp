package wordGuess;

import java.util.Scanner;

public class WordGuesserUI
{
    private static final int NUM_GUESSES = 6;
    
    private WordGuesser game;
    private Scanner input;
    
    /**
     * Constructs a WordGuesser with the specified word
     * @param word the word to be guessed
     */
    public WordGuesserUI(String word)
    {
        // TODO: initialize game and input instance fields
    }
    
    /**
     * Prompts for and handles guessing a single letter.
     * 
     * Handles invalid entries:
     * - anything other than a lowercase letter
     * - a letter than has already been guessed
     * 
     * Does not display results.
     */
    public void guessOneLetter()
    {
        // TODO: implement
    }
    
    /**
     * Returns a copy of the specified string with a space between each character
     * @param str the original string
     * @return a copy of the specified string with a space between each character
     */
    static String addSpaces(String str)
    {
        return null; // TODO: implement
    }
    
    /**
     * Displays the state of the game.
     * - incorrect guesses
     * - wrong guesses remaining
     * - word with guesses filled in
     */
    public void displayGameState()
    {
        // TODO: implement
    }
    
    /**
     * Plays a single round with the player guessing until all letters
     * have been guessed or the number of wrong guesses has been exhausted.
     */
    public void playOneRound()
    {
        // TODO: implement
    }
}
