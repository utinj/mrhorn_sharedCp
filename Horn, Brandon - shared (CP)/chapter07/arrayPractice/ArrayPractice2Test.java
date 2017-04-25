package arrayPractice;

import junit.framework.TestCase;

public class ArrayPractice2Test extends TestCase
{
    public void testAreSameEmpty()
    {
        int[] vals1 = {};
        int[] vals2 = {};
        
        boolean expectedResult = true;
        
        boolean actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
    }
    
    public void testAreSameOneEmpty()
    {
        int[] vals1 = {3};
        int[] vals2 = {};
        
        boolean expectedResult = false;
        
        boolean actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
        
        
        vals1 = new int[]{};
        vals2 = new int[]{3};
        
        expectedResult = false;
        
        actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
    }

    public void testAreSameShort()
    {
        int[] vals1 = {3};
        int[] vals2 = {3};
        
        boolean expectedResult = true;
        
        boolean actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
        
        
        vals1 = new int[]{2};
        vals2 = new int[]{3};
        
        expectedResult = false;
        
        actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
    }

    public void testAreSameNormal()
    {
        int[] vals1 = {3, 7, 8, 2};
        int[] vals2 = {3, 7, 8, 2};
        
        boolean expectedResult = true;
        
        boolean actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
    }
    
    public void testAreSameDifferentValues()
    {
        int[] vals1 = {3, 6, 7, 2};
        int[] vals2 = {3, 7, 6, 2};
        
        boolean expectedResult = false;
        
        boolean actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
        
        
        vals1 = new int[]{4, 7, 8, 2};
        vals2 = new int[]{3, 7, 8, 2};
        
        expectedResult = false;
        
        actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
        
        
        vals1 = new int[]{3, 7, 8, 1};
        vals2 = new int[]{3, 7, 8, 2};
        
        expectedResult = false;
        
        actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
    }
    
    public void testAreSameDifferentLengths()
    {
        int[] vals1 = {3, 6, 8, 2};
        int[] vals2 = {3, 7, 8};
        
        boolean expectedResult = false;
        
        boolean actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
        
        
        vals1 = new int[]{4, 7};
        vals2 = new int[]{3, 7, 8, 2};
        
        expectedResult = false;
        
        actualResult = ArrayPractice2.areSame(vals1, vals2);
        
        assertTrue(expectedResult == actualResult);
    }
}