package multigrid.map;

import java.util.ArrayList;

import info.gridworld.grid.AbstractGrid;
import info.gridworld.grid.Location;
import java.util.*;

/**
 * A bounded or unbounded multigrid
 * 
 */
public class MultiGrid<E> extends AbstractGrid<E>
{
    private Map<Location, Stack<E>> occupiedLocationsToOccupants;
    private int rows;
    private int cols;
    
    /**
     * Constructs an unbounded MultiGrid
     */
    public MultiGrid()
    {
        this.occupiedLocationsToOccupants = new TreeMap<Location, Stack<E>>();
        this.rows = -1;
        this.cols = -1;
    }
    
    /**
     * Constructs a bounded MultiGrid with the specified number of rows and columns
     */
    public MultiGrid(int rows, int cols)
    {
        if( ! (rows > 0 && cols > 0) )
            throw new IllegalArgumentException("both rows and cols must be > 0");
        
        this.occupiedLocationsToOccupants = new TreeMap<Location, Stack<E>>();
        this.rows = rows;
        this.cols = cols;
    }
    
    public E get(Location loc)
    {
        if( ! isValid(loc) )
            throw new IllegalArgumentException("loc is not valid in this grid");
        
        // unlike in UnboundedGrid, this check is required to avoid a NullPointerException 
        if(this.occupiedLocationsToOccupants.keySet().contains(loc))
            return this.occupiedLocationsToOccupants.get(loc).peek();
        else
            return null;
    }

    public int getNumCols()
    {
        return this.cols;
    }

    public int getNumRows()
    {
        return this.rows;
    }

    public ArrayList<Location> getOccupiedLocations()
    {
        return new ArrayList<Location>(this.occupiedLocationsToOccupants.keySet());
    }

    public boolean isValid(Location loc)
    {
        return this.rows == -1
            || (0 <= loc.getRow() && loc.getRow() < this.rows
                    && 0 <= loc.getCol() && loc.getCol() < this.cols);
    }

    public E put(Location loc, E obj)
    {
        if( ! isValid(loc) )
            throw new IllegalArgumentException("loc is not valid in this grid");
        
        if(obj == null)
            throw new IllegalArgumentException("obj cannot be null");
        
        // TODO: can code below be reduced?
        
        E previous = null;
        
        if(this.occupiedLocationsToOccupants.keySet().contains(loc))
        {
            Stack<E> occupantsAtLoc = this.occupiedLocationsToOccupants.get(loc);
            previous = occupantsAtLoc.peek();
            occupantsAtLoc.push(obj);
        }
        else
        {
            Stack<E> occupantsAtLoc = new Stack<E>();
            occupantsAtLoc.push(obj);
            this.occupiedLocationsToOccupants.put(loc, occupantsAtLoc);
        }
        
        return previous;
    }

    public E remove(Location loc)
    {
        if( ! isValid(loc) )
            throw new IllegalArgumentException("loc is not valid in this grid");
        
        E previous = null;
        
        if(this.occupiedLocationsToOccupants.keySet().contains(loc))
        {
            Stack<E> occupantsAtLoc = this.occupiedLocationsToOccupants.get(loc);
            previous = occupantsAtLoc.pop();
            
            if(occupantsAtLoc.isEmpty())
                this.occupiedLocationsToOccupants.remove(loc);
        }
        
        return previous;
    }
}
