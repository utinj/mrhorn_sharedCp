package simpleFourInARow;

import java.awt.Color;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

/**
 * A 4-in-a-row game
 *
 */
public class FourInARow extends World<Disc>
{
	private boolean isBluesTurn;
	private boolean gameIsOver;
	
	/**
	 * Constructs a game that is ready to play
	 */
	public FourInARow()
	{
		super(new BoundedGrid<Disc>(6, 7));
		reset();
		System.setProperty("info.gridworld.gui.tooltips", "hide");
	}
	
	/**
	 * Resets the game so it is ready to play
	 */
	private void reset()
	{
		for(Location discLoc : getGrid().getOccupiedLocations())
			getGrid().remove(discLoc);
		
		setMessage("Next move: blue");
		isBluesTurn = true;
		gameIsOver = false;
	}
	
	/**
	 * Returns the location at which a disc dropped into the
	 * specified column would land or null if the column is full.
	 * @param col the column into which a disc is to be dropped
	 * Precondition: 0 <= col && col < getGrid().getNumCols()
	 * @return the drop location or null
	 */
	Location getDropLocation(int col)
	{
	    return null; // TODO: implement
	}
	
	/**
	 * Places a disc for the player whose turn it is
	 * in the specified location
	 * @param loc the location at which to place a disc
	 */
	private void placeDisc(Location dropLoc)
	{
	    Color discColor = Color.BLUE;
        if( ! isBluesTurn )
            discColor = Color.RED;
        
        add(dropLoc, new Disc(discColor));
	}
	
	/**
	 * Counts the number of consecutive discs the same color as
	 * the disc at loc in the specified direction.
	 * @param loc a location containing a disc
	 * @param dir the direction in which to count consecutive discs
	 * @return the number of discs that meet the criteria above
	 */
	int countDiscs(Location loc, int dir)
	{
	    return -1; // TODO: implement
	}
	
	/**
	 * Returns true if the disc just dropped at
	 * loc wins the game, false otherwise
	 * @param loc the location into which a disc was just dropped
	 * Precondition: getGrid().get(loc) != null
	 * @return true if the disc at loc wins the game, false otherwise
	 */
	boolean isWin(Location loc)
	{
	    return false; // TODO: implement
	}
	
	/**
	 * Returns true if the board is full, false otherwise
	 * @return true if the board is full, false otherwise
	 */
	private boolean isFull()
	{
	    Grid<Disc> gr = getGrid();
	    return gr.getOccupiedLocations().size() ==
	            gr.getNumRows() * gr.getNumCols();
	}
	
	/**
	 * Updates the game state (isGameOver and isBluesTurn) and
	 * the message.
	 * @param dropLoc the location into which a disc was just placed
	 */
	void updateGameStateAndMessage(Location dropLoc)
	{
	    // TODO: implement
	}
	
	public boolean locationClicked(Location loc)
	{
	    // TODO: replace this
	    placeDisc(loc);
	    isBluesTurn = ! isBluesTurn;
	    
		return true; // leave this
	}
}