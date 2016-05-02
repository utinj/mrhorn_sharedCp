package simpleFourInARow;

import java.awt.Color;

import info.gridworld.grid.Location;
import junit.framework.TestCase;

public class TestCountDiscs extends TestCase
{
    private FourInARow fiar;
    
    public void setUp()
    {
        fiar = new FourInARow();
    }
    
    public void testEastToOtherColor()
    {
        fiar.add(new Location(5, 1), new Disc(Color.BLUE));
        fiar.add(new Location(5, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 1), Location.EAST) == 0);
        
        fiar.add(new Location(5, 2), new Disc(Color.BLUE));
        fiar.add(new Location(5, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 1), Location.EAST) == 1);
        
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        fiar.add(new Location(5, 4), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 1), Location.EAST) == 2);
        
        fiar.add(new Location(5, 4), new Disc(Color.BLUE));
        fiar.add(new Location(5, 5), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 1), Location.EAST) == 3);
    }
    
    public void testWestToEmptySpot()
    {
        fiar.add(new Location(5, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 2), Location.WEST) == 0);
        
        fiar.add(new Location(5, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 3), Location.WEST) == 1);
        
        fiar.add(new Location(5, 4), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 4), Location.WEST) == 2);
        
        fiar.add(new Location(5, 5), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 5), Location.WEST) == 3);
    }

    public void testWestToLeftOfGrid()
    {
        fiar.add(new Location(5, 0), new Disc(Color.BLUE));
        assertTrue(fiar.countDiscs(new Location(5, 0), Location.WEST) == 0);
        
        fiar.add(new Location(5, 1), new Disc(Color.BLUE));
        assertTrue(fiar.countDiscs(new Location(5, 1), Location.WEST) == 1);
        
        fiar.add(new Location(5, 2), new Disc(Color.BLUE));
        assertTrue(fiar.countDiscs(new Location(5, 2), Location.WEST) == 2);
        
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        assertTrue(fiar.countDiscs(new Location(5, 3), Location.WEST) == 3);
    }

    public void testSouthToOtherColor()
    {
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        fiar.add(new Location(4, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 3), Location.SOUTH) == 0);
        
        fiar.add(new Location(3, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 3), Location.SOUTH) == 1);
        
        fiar.add(new Location(2, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 3), Location.SOUTH) == 2);
        
        fiar.add(new Location(1, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(1, 3), Location.SOUTH) == 3);
    }

    public void testSouthToBottomOfGrid()
    {
        fiar.add(new Location(5, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 2), Location.SOUTH) == 0);
        
        fiar.add(new Location(4, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 2), Location.SOUTH) == 1);
        
        fiar.add(new Location(3, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 2), Location.SOUTH) == 2);
        
        fiar.add(new Location(2, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 2), Location.SOUTH) == 3);
    }

    public void testSoutheastToOtherColor()
    {
        fiar.add(new Location(5, 4), new Disc(Color.BLUE));
        fiar.add(new Location(4, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 3), Location.SOUTHEAST) == 0);
        
        fiar.add(new Location(3, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 2), Location.SOUTHEAST) == 1);
        
        fiar.add(new Location(2, 1), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 1), Location.SOUTHEAST) == 2);
        
        fiar.add(new Location(1, 0), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(1, 0), Location.SOUTHEAST) == 3);
    }

    public void testSouthwestToBottomOfGrid()
    {
        fiar.add(new Location(5, 1), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 1), Location.SOUTHWEST) == 0);
        
        fiar.add(new Location(4, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 2), Location.SOUTHWEST) == 1);
        
        fiar.add(new Location(3, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 3), Location.SOUTHWEST) == 2);
        
        fiar.add(new Location(2, 4), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 4), Location.SOUTHWEST) == 3);
    }

    public void testSouthwestToEmptySpot()
    {
        fiar.add(new Location(4, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 2), Location.SOUTHWEST) == 0);
        
        fiar.add(new Location(3, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 3), Location.SOUTHWEST) == 1);
        
        fiar.add(new Location(2, 4), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 4), Location.SOUTHWEST) == 2);
        
        fiar.add(new Location(1, 5), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(1, 5), Location.SOUTHWEST) == 3);
    }

    public void testNortheastToTopOfGrid()
    {
        fiar.add(new Location(0, 4), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(0, 4), Location.NORTHEAST) == 0);
        
        fiar.add(new Location(1, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(1, 3), Location.NORTHEAST) == 1);
        
        fiar.add(new Location(2, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 2), Location.NORTHEAST) == 2);
        
        fiar.add(new Location(3, 1), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 1), Location.NORTHEAST) == 3);
    }
    
    public void testNortheastToRightOfGrid()
    {
        fiar.add(new Location(2, 6), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 6), Location.NORTHEAST) == 0);
        
        fiar.add(new Location(3, 5), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 5), Location.NORTHEAST) == 1);
        
        fiar.add(new Location(4, 4), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 4), Location.NORTHEAST) == 2);
        
        fiar.add(new Location(5, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(5, 3), Location.NORTHEAST) == 3);
    }
    
    public void testNorthwestToLeftOfGrid()
    {
        fiar.add(new Location(1, 0), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(1, 0), Location.NORTHWEST) == 0);
        
        fiar.add(new Location(2, 1), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(2, 1), Location.NORTHWEST) == 1);
        
        fiar.add(new Location(3, 2), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(3, 2), Location.NORTHWEST) == 2);
        
        fiar.add(new Location(4, 3), new Disc(Color.RED));
        assertTrue(fiar.countDiscs(new Location(4, 3), Location.NORTHWEST) == 3);
    }
}
