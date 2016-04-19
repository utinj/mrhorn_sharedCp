package dinosaurExcavation;

import java.awt.Color;

import info.gridworld.grid.Location;
import multigrid.map.MultiGrid;

public class DinosaurExcavationRunner
{

    public static void main(String[] args)
    {
        MultiGrid<MultiActor> grid = getGridWithStuff(10, 10, 3);
        
//        Excavator ex = new Excavator(false);
//        ex.putSelfInGrid(grid, new Location(0, 0));
        
        MultiWorld world = new MultiWorld(grid);
        world.show();
    }

    private static MultiGrid<MultiActor> getGridWithStuff(int rows, int cols, int dirtLayers)
    {
        MultiGrid<MultiActor> grid = new MultiGrid<MultiActor>(rows, cols);
        
        for(int r = 0; r < grid.getNumRows(); r++)
        {
            for(int c = 0; c < grid.getNumCols(); c++)
            {
                Location loc = new Location(r, c);
                BedRock bedRock = new BedRock();
                bedRock.putSelfInGrid(grid, loc);
                
                Color dirtColor = new Color(102, 68, 12);
                for(int dirtLayer = 1; dirtLayer <= dirtLayers; dirtLayer++)
                {
                    if(Math.random() < 0.05)
                    {
                        Fossil fossil = new Fossil();
                        fossil.putSelfInGrid(grid, loc);
                    }
                    
                    Dirt dirt = new Dirt(dirtColor);
                    dirt.putSelfInGrid(grid, loc);
                    
                    dirtColor = dirtColor.brighter();
                }
                
                Grass grass = new Grass();
                grass.putSelfInGrid(grid, loc);
            }
        }
        
        return grid;
    }
}
