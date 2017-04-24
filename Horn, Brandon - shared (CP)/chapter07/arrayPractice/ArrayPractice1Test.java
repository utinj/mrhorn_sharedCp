package arrayPractice;

import junit.framework.TestCase;

public class ArrayPractice1Test extends TestCase
{
    public void testFindSumEmpty()
    {
        int[] vals = {}; // empty array
        
        int expectedSum = 0;
        
        int actualSum = ArrayPractice1.findSum(vals);
        
        assertTrue(expectedSum == actualSum);
    }
    
    public void testFindSumShort()
    {
        int[] vals = {3};
        
        int expectedSum = 3;
        
        int actualSum = ArrayPractice1.findSum(vals);
        
        assertTrue(expectedSum == actualSum);
    }

    public void testFindSumNormal()
    {
        int[] vals = {3, 7, 2, 8, 1};
        
        int expectedSum = 21;
        
        int actualSum = ArrayPractice1.findSum(vals);
        
        assertTrue(expectedSum == actualSum);
    }
}