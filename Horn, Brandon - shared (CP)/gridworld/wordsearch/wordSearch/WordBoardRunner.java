package wordSearch;

import java.util.List;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class WordBoardRunner
{
    public static void main(String[] args)
    {
        WordBoard wb = new WordBoard(20, 20);
        wb.addWord("MOUNTAIN");
        wb.addWord("LAKES");
        wb.addWord("HERD");
        wb.addWord("TRACK");
        wb.addWord("DOGS");
        wb.addWord("SKI");
        wb.addWord("PARCC");
        wb.fillEmptySpaces();
        wb.show();
        
//        runSolver(wb, new SimpleSolver());
    }
    
    public static void runSolver(WordBoard wb, Solver solver)
    {
        BoundedGrid<String> strGr = getStringGrid(wb.getGrid());
        List<Location> wordLocs = solver.solve(strGr, wb.getWordsToFind());
        
        for(Location loc : wordLocs)
        {
            if(loc != null)
                wb.locationClicked(loc);
            else
                wb.step();
        }
    }
    
    public static BoundedGrid<String> getStringGrid(Grid<Letter> gr)
    {
        BoundedGrid<String> strGr = new BoundedGrid<String>(gr.getNumRows(), gr.getNumCols());
        
        for(int row = 0; row < gr.getNumRows(); row++)
        {
            for(int col = 0; col < gr.getNumCols(); col++)
            {
                Location loc = new Location(row, col);
                strGr.put(loc, gr.get(loc).getText());
            }
        }
        
        return strGr;
    }
}