package usingExistingClasses;

import java.awt.Rectangle;

public class RectangleDemo
{

	// This uses the Rectangle class from the
	// Java Library, not the one from the textbook.
	
	public static void main(String[] args)
	{
//		Scanner, PApplet, PImage, ArrayList, String
		
		Rectangle rect1 = new Rectangle(17, 38, 25, 50);
		Rectangle rect2 = new Rectangle(20, 30, 20, 20);
		Rectangle rect3 = rect1;
		
		System.out.println(rect1.contains(18, 39));
		System.out.println(rect1.contains(0, 0));
		
		rect1.setLocation(5, 20);
		
		System.out.println(rect1);
		System.out.println(rect2);
		System.out.println(rect3);
	}

}
