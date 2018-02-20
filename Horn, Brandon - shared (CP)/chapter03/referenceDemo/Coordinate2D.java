package referenceDemo;

public class Coordinate2D
{
	private int x, y;

	public Coordinate2D()
	{
		x = 0;
		y = 0;
	}

	public Coordinate2D(int initX, int initY)
	{
		x = initX;
		y = initY;
	}
	
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void setX(int newX)
	{
		x = newX;
	}

	public void setY(int newY)
	{
		y = newY;
	}

	public String toString()
	{
		return "(" + getX() + ", " + getY() + ")";
	}
}
