package timing;

import processing.core.PApplet;

public class Timing extends PApplet
{

	public static void main(String[] args)
	{
		PApplet.main("timing.Timing");
	}

	private int bunnyColor;
	private int timeOfNextChange;
	
	private final int CHANGE_DELAY = 2000;
	
	public void settings()
	{
		size(500, 500);
	}
	
	public void setup()
	{
		bunnyColor = color(70, 39, 89);
		timeOfNextChange = CHANGE_DELAY;
	}
	
	public void draw()
	{
		background(255);
		
		updateColor();
		drawBunny();
	}

	private void updateColor()
	{
		if(millis() >= timeOfNextChange)
		{
			if(bunnyColor == color(70, 39, 89)) // purple
				bunnyColor = color(64, 244, 78);
			else
				bunnyColor = color(70, 39, 89);
			
			timeOfNextChange = millis() + CHANGE_DELAY;
		}
	}

	private void drawBunny()
	{
		fill(bunnyColor);
		ellipse(250, 250, 200, 200);
		ellipse(200, 150, 25, 100);
		ellipse(300, 150, 25, 100);
	}
}
