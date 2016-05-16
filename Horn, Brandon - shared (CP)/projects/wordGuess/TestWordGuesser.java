package wordGuess;

import junit.framework.TestCase;

public class TestWordGuesser extends TestCase
{
    public void testImmediatelyAfterConstruction()
    {
        WordGuesser wg = new WordGuesser("sophisticated", 7);
        
        assertTrue(wg.wrongGuessesRemaining() == 7);
        assertTrue(wg.guessedLetters().equals(""));
        assertTrue(wg.incorrectGuesses().equals(""));
        assertTrue(wg.getWordWithGuesses().equals("_____________"));
        assertTrue(wg.getWord().equals("sophisticated"));
    }
    
    public void testWithGuesses()
    {
        WordGuesser wg = new WordGuesser("sophisticated", 7);
        
        
        assertTrue( ! wg.guessLetter('r') );
        
        assertTrue(wg.wrongGuessesRemaining() == 6);
        assertTrue(wg.guessedLetters().equals("r"));
        assertTrue(wg.incorrectGuesses().equals("r"));
        assertTrue(wg.getWordWithGuesses().equals("_____________"));
        assertTrue(wg.getWord().equals("sophisticated"));
        
        
        assertTrue(wg.guessLetter('i'));
        
        assertTrue(wg.wrongGuessesRemaining() == 6);
        assertTrue(wg.guessedLetters().equals("ri"));
        assertTrue(wg.incorrectGuesses().equals("r"));
        assertTrue(wg.getWordWithGuesses().equals("____i__i_____"));
        assertTrue(wg.getWord().equals("sophisticated"));
        
        
        assertTrue( ! wg.guessLetter('j') );
        
        assertTrue(wg.wrongGuessesRemaining() == 5);
        assertTrue(wg.guessedLetters().equals("rij"));
        assertTrue(wg.incorrectGuesses().equals("rj"));
        assertTrue(wg.getWordWithGuesses().equals("____i__i_____"));
        assertTrue(wg.getWord().equals("sophisticated"));
        
        
        assertTrue(wg.guessLetter('p'));
        
        assertTrue(wg.wrongGuessesRemaining() == 5);
        assertTrue(wg.guessedLetters().equals("rijp"));
        assertTrue(wg.incorrectGuesses().equals("rj"));
        assertTrue(wg.getWordWithGuesses().equals("__p_i__i_____"));
        assertTrue(wg.getWord().equals("sophisticated"));
    }
}
