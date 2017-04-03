package sortedList;

import java.util.ArrayList;

import junit.framework.TestCase;

public class SortedListTest extends TestCase
{
    public void testInsert()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        SortedList underTest = new SortedList();
        
        // empty
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        // insert into empty list
        correctList.add(new Integer(5));
        underTest.insert(new Integer(5));
        // [5]
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        // insert at end of non-empty list
        correctList.add(new Integer(7));
        underTest.insert(new Integer(7));
        // [5, 7]
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        // insert at beginning of non-empty list
        correctList.add(0, new Integer(4));
        underTest.insert(new Integer(4));
        // [4, 5, 7]
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        // insert in middle of non-empty list
        correctList.add(2, new Integer(6));
        underTest.insert(new Integer(6));
        // [4, 5, 6, 7]
        assertTrue(correctList.toString().equals(underTest.toString()));
    }

    public void testSearch()
    {
        SortedList underTest = new SortedList();
        
        // search in empty list
        int result = underTest.search(new Integer(5));
        assertTrue(result == -1);
        
        underTest.insert(new Integer(4));
        underTest.insert(new Integer(8));
        underTest.insert(new Integer(9));
        underTest.insert(new Integer(12));
        
        // beginning
        result = underTest.search(new Integer(4));
        assertTrue(result == 0);
        
        // middle
        result = underTest.search(new Integer(9));
        assertTrue(result == 2);
        
        // end
        result = underTest.search(new Integer(12));
        assertTrue(result == 3);
        
        // not in list, would be before first element
        result = underTest.search(new Integer(2));
        assertTrue(result == -1);
        
        // not in list, would be in middle
        result = underTest.search(new Integer(7));
        assertTrue(result == -1);
        
        // not in list, would be after last element
        result = underTest.search(new Integer(15));
        assertTrue(result == -1);
    }

    public void testRemoveAll()
    {
        ArrayList<Integer> correctList = new ArrayList<Integer>();
        SortedList underTest = new SortedList();
        
        // remove all from empty list
        int result = underTest.removeAll(5);
        assertTrue(result == 0);
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        underTest.insert(new Integer(4));
        underTest.insert(new Integer(8));
        underTest.insert(new Integer(8));
        underTest.insert(new Integer(8));
        underTest.insert(new Integer(8));
        underTest.insert(new Integer(9));
        underTest.insert(new Integer(12));
        underTest.insert(new Integer(12));
        underTest.insert(new Integer(12));
        
        correctList.add(new Integer(4));
        correctList.add(new Integer(8));
        correctList.add(new Integer(8));
        correctList.add(new Integer(8));
        correctList.add(new Integer(8));
        correctList.add(new Integer(9));
        correctList.add(new Integer(12));
        correctList.add(new Integer(12));
        correctList.add(new Integer(12));
        
        result = underTest.removeAll(new Integer(4));
        correctList.remove(0);
        assertTrue(result == 1);
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        result = underTest.removeAll(new Integer(8));
        correctList.remove(0);
        correctList.remove(0);
        correctList.remove(0);
        correctList.remove(0);
        assertTrue(result == 4);
        assertTrue(correctList.toString().equals(underTest.toString()));
        
        result = underTest.removeAll(new Integer(12));
        correctList.remove(1);
        correctList.remove(1);
        correctList.remove(1);
        assertTrue(result == 3);
        assertTrue(correctList.toString().equals(underTest.toString()));
    }
}