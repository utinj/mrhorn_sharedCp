package referenceDemo;

public class MethodCalls
{
	public static void main(String[] args)
	{
		primitiveDemoPart1();
//		referenceDemo1Part1();
//		referenceDemo2Part1();
	}
	
	public static void primitiveDemoPart1()
	{
	    int y = 10;
	    primitiveDemoPart2(y);
	    System.out.println(y);
	}
	
	private static void primitiveDemoPart2(int x)
	{
	    x = 15;
	}
	
	public static void referenceDemo1Part1()
	{
	    Coordinate2D a = new Coordinate2D(1,1);
	    referenceDemo1Part2(a);
	    System.out.println(a);
	}
	
	private static void referenceDemo1Part2(Coordinate2D c)
	{
	    c.setX(2);
	}
	
	public static void referenceDemo2Part1()
	{
	    Coordinate2D h = new Coordinate2D(1,1);
	    referenceDemo2Part2(h);
	    System.out.println(h);
	}
	
	private static void referenceDemo2Part2(Coordinate2D g)
	{
	    g = new Coordinate2D(2,2);
	}
}
