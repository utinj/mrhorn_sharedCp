package simpleFourInARow;

import java.awt.Color;

import info.gridworld.grid.Location;
import junit.framework.TestCase;

public class TestGetDropLocation extends TestCase
{
    private FourInARow fiar;
    
    public void setUp()
    {
        fiar = new FourInARow();
    }
    
    public void testEmptyColumn()
    {
        assertTrue(fiar.getDropLocation(3).equals(new Location(5, 3)));
    }
    
    public void testPartiallyFullColumn()
    {
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        fiar.add(new Location(4, 3), new Disc(Color.BLUE));
        fiar.add(new Location(3, 3), new Disc(Color.BLUE));
        
        assertTrue(fiar.getDropLocation(3).equals(new Location(2, 3)));
    }
    
    public void testFullColumn()
    {
        fiar.add(new Location(5, 3), new Disc(Color.BLUE));
        fiar.add(new Location(4, 3), new Disc(Color.BLUE));
        fiar.add(new Location(3, 3), new Disc(Color.BLUE));
        fiar.add(new Location(2, 3), new Disc(Color.BLUE));
        fiar.add(new Location(1, 3), new Disc(Color.BLUE));
        fiar.add(new Location(0, 3), new Disc(Color.BLUE));
        
        assertTrue(fiar.getDropLocation(3) == null);
    }
}
