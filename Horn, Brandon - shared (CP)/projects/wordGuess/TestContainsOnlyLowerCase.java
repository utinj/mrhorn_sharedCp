package wordGuess;

import junit.framework.TestCase;

public class TestContainsOnlyLowerCase extends TestCase
{
    public void testPositiveCases()
    {
        assertTrue(WordGuesser.containsOnlyLowerCaseLetters(""));
        assertTrue(WordGuesser.containsOnlyLowerCaseLetters("gzhqr"));
        assertTrue(WordGuesser.containsOnlyLowerCaseLetters("b"));
        assertTrue(WordGuesser.containsOnlyLowerCaseLetters("abz"));
        assertTrue(WordGuesser.containsOnlyLowerCaseLetters("zba"));
    }
    
    public void testNegativeCases()
    {
        assertTrue( ! WordGuesser.containsOnlyLowerCaseLetters(" "));
        assertTrue( ! WordGuesser.containsOnlyLowerCaseLetters("apple jacks"));
        assertTrue( ! WordGuesser.containsOnlyLowerCaseLetters("Z"));
        assertTrue( ! WordGuesser.containsOnlyLowerCaseLetters("Apple"));
        assertTrue( ! WordGuesser.containsOnlyLowerCaseLetters("appLe"));
        assertTrue( ! WordGuesser.containsOnlyLowerCaseLetters("zer0"));
    }
}
