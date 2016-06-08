package wordSearch;

import java.util.List;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

public interface Solver
{
    /**
     * Returns a list of locations of the specified words on the specified grid.
     * The locations for each word (including the last word) are followed by null.
     * @param gr the grid containing letters
     * @param words the words to be found
     * @return a list of locations, with each word terminated by null
     */
    public List<Location> solve(BoundedGrid<String> gr, List<String> words);
}