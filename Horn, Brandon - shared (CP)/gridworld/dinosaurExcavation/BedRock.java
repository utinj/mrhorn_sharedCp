package dinosaurExcavation;

import java.awt.Color;

public class BedRock extends MultiActor
{
    public BedRock()
    {
        setColor(Color.BLACK);
    }
    
    public void removeSelfFromGrid()
    {
        throw new IllegalStateException("BedRock cannot be removed");
    }
    
    public void act()
    {
        
    }
}
