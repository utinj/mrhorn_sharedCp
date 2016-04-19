package locationClassPractice;

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
        
        System.out.println(loc.getRow());
        
        int c = loc.getCol();
        System.out.println(c);
    }
    
    public static void stringy()
    {
        Location loc = new Location(5, 10);
        
        System.out.println(loc.toString());
        System.out.println(loc);
    }
    
    public static void equality()
    {
        Location loc1 = new Location(5, 10);
        Location loc2 = new Location(5, 10);
        Location loc3 = loc1;
        
        System.out.println(loc1 == loc2);
        System.out.println(loc1 == loc3);
        
        System.out.println(loc1.equals(loc2));
        System.out.println(loc1.equals(loc3));
    }

    public static void adjacent()
    {
        Location loc = new Location(5, 10);
        
        Location loc2 = loc.getAdjacentLocation(Location.NORTH);
        System.out.println(loc2);
        
        loc2 = loc.getAdjacentLocation(Location.SOUTH);
        System.out.println(loc2);
        
        System.out.println(loc.getAdjacentLocation(Location.EAST));
        
        System.out.println(loc.getAdjacentLocation(Location.WEST));
        
        Location loc3 = loc.getAdjacentLocation(Location.SOUTHWEST);
        loc3 = loc3.getAdjacentLocation(Location.SOUTHWEST);
        System.out.println(loc3);
    }

    public static void allAdjacent()
    {
        Location loc = new Location(5, 10);
        
        for(int dir = Location.NORTH; dir <= Location.NORTHWEST; dir += Location.HALF_RIGHT)
        {
            Location adj = loc.getAdjacentLocation(dir);
            System.out.println(adj);
        }
    }

    public static void direction()
    {
        Location home = new Location(0, 0);
        Location me = new Location(5, 10);
        Location you = new Location(-5, -12);
        
        int meToHome = me.getDirectionToward(home);
        System.out.println(meToHome);
        
        int homeToMe = home.getDirectionToward(me);
        System.out.println(homeToMe);
        
        System.out.println(you.getDirectionToward(home));
        
        System.out.println(you.getDirectionToward(me));
    }
}
