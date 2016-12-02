package simpleFourInARow;

import java.awt.Color;

import info.gridworld.grid.Location;
import junit.framework.TestCase;

public class TestIsWin extends TestCase
{
    private FourInARow fiar;
    
    public void setUp()
    {
        fiar = new FourInARow();
    }
    
    public void testHorizontalWin()
    {
        fiar.add(new Location(5, 1), new Disc(Color.BLUE));
        fiar.add(new Location(5, 2), new Disc(Color.BLUE));
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        fiar.add(new Location(5, 4), new Disc(Color.BLUE));
        
        assertTrue(fiar.isWin(new Location(5, 1)));
        assertTrue(fiar.isWin(new Location(5, 2)));
        assertTrue(fiar.isWin(new Location(5, 3)));
        assertTrue(fiar.isWin(new Location(5, 4)));
    }
    
    public void testHorizontalNotWin()
    {
        fiar.add(new Location(5, 1), new Disc(Color.BLUE));
        fiar.add(new Location(5, 2), new Disc(Color.RED));
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        fiar.add(new Location(5, 4), new Disc(Color.BLUE));
        
        assertTrue( ! fiar.isWin(new Location(5, 1)) );
        assertTrue( ! fiar.isWin(new Location(5, 2)) );
        assertTrue( ! fiar.isWin(new Location(5, 3)) );
        assertTrue( ! fiar.isWin(new Location(5, 4)) );
    }

    public void testVerticalWin()
    {
        fiar.add(new Location(5, 1), new Disc(Color.BLUE));
        fiar.add(new Location(4, 1), new Disc(Color.BLUE));
        fiar.add(new Location(3, 1), new Disc(Color.BLUE));
        fiar.add(new Location(2, 1), new Disc(Color.BLUE));
        
        assertTrue(fiar.isWin(new Location(2, 1)));
    }
    
    public void testVerticalNotWin()
    {
        fiar.add(new Location(5, 1), new Disc(Color.BLUE));
        fiar.add(new Location(4, 1), new Disc(Color.RED));
        fiar.add(new Location(3, 1), new Disc(Color.BLUE));
        fiar.add(new Location(2, 1), new Disc(Color.BLUE));
        
        assertTrue( ! fiar.isWin(new Location(2, 1)) );
    }

    public void testDiagonalWin()
    {
        fiar.add(new Location(5, 5), new Disc(Color.BLUE));
        fiar.add(new Location(4, 4), new Disc(Color.BLUE));
        fiar.add(new Location(3, 3), new Disc(Color.BLUE));
        fiar.add(new Location(2, 2), new Disc(Color.BLUE));
        
        assertTrue(fiar.isWin(new Location(5, 5)));
        assertTrue(fiar.isWin(new Location(4, 4)));
        assertTrue(fiar.isWin(new Location(3, 3)));
        assertTrue(fiar.isWin(new Location(2, 2)));
    }
    
    public void testDiagonalNotWin()
    {
        fiar.add(new Location(5, 5), new Disc(Color.BLUE));
        fiar.add(new Location(4, 4), new Disc(Color.RED));
        fiar.add(new Location(3, 3), new Disc(Color.BLUE));
        fiar.add(new Location(2, 2), new Disc(Color.BLUE));
        
        assertTrue( ! fiar.isWin(new Location(5, 5)) );
        assertTrue( ! fiar.isWin(new Location(4, 4)) );
        assertTrue( ! fiar.isWin(new Location(3, 3)) );
        assertTrue( ! fiar.isWin(new Location(2, 2)) );
    }
}