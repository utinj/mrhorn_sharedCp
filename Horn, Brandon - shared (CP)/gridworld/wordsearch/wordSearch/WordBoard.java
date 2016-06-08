package wordSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class WordBoard extends World<Letter>
{
    // TODO: choose instance fields
    
    /**
     * Constructs an empty board with the specified number of rows and columns.
     * @param rows the number of rows
     * @param cols the number of columns
     */
    public WordBoard(int rows, int cols)
    {
        // TODO: implement
        
        System.setProperty("info.gridworld.gui.tooltips", "hide");
        System.setProperty("info.gridworld.gui.frametitle", "Word search");
    }
    
    /**
     * Updates the message with the list of words still to be found.
     */
    public void updateMessage()
    {
        // TODO: implement
    }
    
    /**
     * Returns a list of words that have been added, in the order in which they were added.
     * @return a list of words that have been added.
     */
    public List<String> getWords()
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns a list of words left to be found, in no particular order.
     * @return a list of words left to be found
     */
    public List<String> getWordsToFind()
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns true if the specified word can be added, false otherwise.
     * 
     * A word can be added if and only if the word:
     * - has a length of at least 1
     * - consists of only uppercase letters
     * - is not a substring of a word that has already been added
     * - does not contain a word that has already been added as a substring
     * 
     * @param word the proposed word
     * @return true if the word can be added, false otherwise
     */
    public boolean canAddWord(String word)
    {
        return false; // TODO: implement
    }
    
    /**
     * Returns a list of the locations starting at the specified location, in the specified
     * direction for the specified number of locations. Returns null if the list would include
     * invalid locations.
     * @param startLoc the first location
     * @param direction the direction in which to obtain additional locations
     * @param numLocations the number of locations (including the starting location)
     * @return a list of the requested locations or null if the list would include invalid locations
     */
    private List<Location> getLocationsInDirection(Location startLoc, int direction, int numLocations)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns true if the specified word can be added starting at the specified location
     * and continuing in the specified direction, false otherwise.
     * 
     * A word can be added if and only if:
     * - canAddWord(word)
     * - the word would not exceed the bounds of the board in the proposed placement
     * - adding the word in the proposed placement would not change any letter already on the board
     * 
     * @param word the proposed word
     * @param startLoc the proposed location for the first letter
     * @param direction the proposed direction
     * @return true if the word can be added as specified, false otherwise
     */
    public boolean canAddWord(String word, Location startLoc, int direction)
    {
        return false; // TODO: implement
    }
    
    /**
     * Adds the specified word starting at the specified location and continuing in
     * the specified direction.
     * @param word the word to add
     * @param startLoc the location at which the first letter in the word is to be added
     * @param direction the direction in which the word is to be added
     * @throws IllegalArgumentException if ! canAddWord(word, startLoc, direction)
     */
    public void addWord(String word, Location startLoc, int direction)
    {
        // TODO: implement
    }
    
    /**
     * Returns a shuffled list of all possible compass directions.
     * @return a shuffled list of all possible compass directions
     */
    private List<Integer> getDirections()
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns a shuffled list of all valid locations.
     * @return returns a shuffled list of all valid locations.
     */
    private List<Location> getLocations()
    {
        return null; // TODO: implement
    }
    
    /**
     * Attempts to add the specified word to a random location in a random direction.
     * Returns true if it was possible to add the word, false otherwise.
     * @param word the word to add
     * @return true if the word was successfully added, false otherwise.
     * @throws IllegalArgumentException if ! canAddWord(word)
     */
    public boolean addWord(String word)
    {
        return false; // TODO: implement
    }
    
    /**
     * Fills all empty spaces on the board with random letters.
     */
    public void fillEmptySpaces()
    {
        // TODO: implement
    }
    
    /**
     * Toggles the selection status of the clicked letter.
     */
    public boolean locationClicked(Location loc)
    {
        // TODO: implement
        
        return true; // do not change this
    }
    
    /**
     * Returns a list of all selected locations on the board in row-major order
     * @return a list of all selected locations on the board in row-major order
     */
    private List<Location> getSelectedLocations()
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns a string consisting of all selected letters or null if selection
     * is not continuous.
     * @return a string consisting of all selected letters or null
     */
    private String getLettersIfContinuous(List<Location> locations)
    {
        return null; // TODO: implement
    }
    
    /**
     * Returns the reverse of the specified string
     * @param str the string to reverse
     * @return the reverse of the specified string
     */
    private static String reverse(String str)
    {
        return null; // TODO: implement
    }
    
    /**
     * If the selected letters make up one of the words to be found and nothing
     * else, marks the selected letters as correct, deselects them and removes
     * the word from the list of words to be found. Otherwise, does nothing.
     * 
     * @return true if the selected letters matched a word, false otherwise
     */
    public boolean finalizeWordSelection()
    {
        return false; // TODO: implement
    }
    
    /**
     * Runs finalizeWordSelection when the step button is pressed.
     */
    public void step()
    {
        // TODO: implement
    }
}