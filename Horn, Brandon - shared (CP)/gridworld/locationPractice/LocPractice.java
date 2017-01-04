package locationPractice;

import info.gridworld.grid.Location;

public class LocPractice
{

    public static void main(String[] args)
    {
//        basicOps();
//        stringy();
//        equality();
//        adjacent();
//        allAdjacent();
//        direction();
    }

    public static void basicOps()
    {
        Location loc = new Location(5, 10);
        
        // TODO: print out the row and column (separately)
    }
    
    public static void stringy()
    {
        Location loc = new Location(5, 10);
        
        // TODO: use the toString method
    }
    
    public static void equality()
    {
        Location loc1 = new Location(5, 10);
        Location loc2 = new Location(5, 10);
        Location loc3 = loc1;
        
        // TODO: predict the output of each line below before you run the code
        
        System.out.println(loc1 == loc2);
        System.out.println(loc1 == loc3);
        
        System.out.println(loc1.equals(loc2));
        System.out.println(loc1.equals(loc3));
    }

    public static void adjacent()
    {
        Location loc = new Location(5, 10);
        
        // TODO: calculate and print the location north of loc
        
        // TODO: calculate and print the location south of the location you calculated above
        
        // TODO: calculate and print the location east of loc
        
        // TODO: calculate and print the location west of loc
        
        // TODO: calculate and print the location southwest of loc
        
        // TODO: calculate and print the location southwest of the location you calculated above
    }

    public static void direction()
    {
        Location home = new Location(0, 0);
        Location me = new Location(5, 10);
        Location you = new Location(-5, -12);
        
        // TODO: calculate and print the direction from me to home
        
        // TODO: calculate and print the direction from home to me

        // TODO: calculate and print the direction from you to home
        
        // TODO: calculate and print the direction from you to me
    }
}
