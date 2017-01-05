package gridPractice;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.*;

public class BasicGridPractice
{
    public static void main(String[] args)
    {
        checkForValidity();
        checkForOccupied();
    }
    
    public static void checkForValidity()
    {
        Grid<Actor> grid = new BoundedGrid<Actor>(8, 15);
        
        /*
         * TODO: For each location below, check if it is valid in
         * grid. Print each location followed by "valid" or "not valid".
         * 
         * (5, 7)
         * (0, 0)
         * (-1, 5)
         * (10, 5)
         * (8, 15)
         */
    }
    
    public static void checkForOccupied()
    {
        Grid<Actor> grid = new BoundedGrid<Actor>(8, 15);
        
        Bug b1 = new Bug();
        b1.putSelfInGrid(grid, new Location(5, 7));
        
        Bug b2 = new Bug();
        b2.putSelfInGrid(grid, new Location(6, 8));
        
        /*
         * TODO: For each location below, check if it is valid. If
         * it is valid, check if it is occupied. Print each location
         * followed by one of: "not valid", "valid but empty", "occupied".
         * 
         * (5, 7)
         * (9, 10)
         * (4, 3)
         */
    }
}
