package simpleFourInARow;

import java.awt.Color;

/**
 * Represents a blue or red disc
 *
 */
public class Disc
{
	private Color color;
	
	/**
	 * Constructs a disc with the specified color
	 * @param c the disc's color
	 * Precondition: c.equals(Color.BLUE) || c.equals(Color.RED)
	 */
	public Disc(Color c)
	{
	    if( ! (c.equals(Color.BLUE) || c.equals(Color.RED)) )
	        throw new IllegalArgumentException("color must be BLUE or RED");
	    
		color = c;
	}
	
	/**
	 * Returns the color of this disc
	 * @return the color of this disc
	 */
	public Color getColor()
	{
		return color;
	}
	
	/**
	 * Returns "_blue" or "_red" if this disc is blue or red, respectively
	 * @return the image suffix for this disc
	 */
	public String getImageSuffix()
	{
	    if(color.equals(Color.BLUE))
	        return "_blue";
	    else
	        return "_red";
	}
}