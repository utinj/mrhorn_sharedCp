package gridPractice;

import info.gridworld.grid.*;

public class BasicGridPractice
{
    public static void main(String[] args)
    {
//        creation();
//        validity();
//        getPutRemove();
    }
    
    public static void creation()
    {
        Grid<Letter> grid = new BoundedGrid<Letter>(8, 15);
        
        System.out.println(grid.getNumRows());
        System.out.println(grid.getNumCols());
    }
    
    public static void validity()
    {
        Grid<Letter> grid = new BoundedGrid<Letter>(8, 15);
        
        Location loc1 = new Location(3, 4);
        boolean valid = grid.isValid(loc1);
        System.out.println(valid);
        
        valid = grid.isValid(new Location(11, 2));
        System.out.println(valid);
        
        System.out.println(grid.isValid(new Location(-3, 5)));
        
        System.out.println(grid.isValid(new Location(8, 15)));
        
//        System.out.println(grid.isValid(null));
        
        
        grid = new UnboundedGrid<Letter>();
        
        System.out.println(grid.isValid(new Location(-400, 12)));
    }

    public static void getPutRemove()
    {
        Grid<Letter> grid = new BoundedGrid<Letter>(8, 15);
        
        Location loc = new Location(3, 4);
        Letter let1 = new Letter("B");
        grid.put(loc, let1);
        
        Letter let2 = grid.get(loc);
        System.out.println(let2.toString());
        
        grid.put(new Location(3, 4), new Letter("R"));
        System.out.println(grid.get(new Location(3, 4)));
        
        System.out.println(grid.put(loc, new Letter("H")));
        
        System.out.println(grid.get(loc));
        
        System.out.println(grid.remove(loc));
        
        System.out.println(grid.get(loc));
        
        System.out.println(grid.get(new Location(5, 7)));
        
        System.out.println(grid.get(new Location(11, 2)));
    }
}
