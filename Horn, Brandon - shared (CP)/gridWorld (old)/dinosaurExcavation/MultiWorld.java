package dinosaurExcavation;

import java.util.ArrayList;
import java.util.List;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import multigrid.map.MultiGrid;

public class MultiWorld extends World<MultiActor>
{
    public MultiWorld(MultiGrid<MultiActor> grid)
    {
        super(grid);
    }
    
    /**
     * Runs act() on the top-most MultiActor at every occupied location.
     */
    public void step()
    {
        Grid<MultiActor> grid = getGrid();
        
        List<MultiActor> actors = new ArrayList<MultiActor>();
        for(Location loc : grid.getOccupiedLocations())
            actors.add(grid.get(loc));
        
        for(MultiActor actor : actors)
            actor.act();
    }
}