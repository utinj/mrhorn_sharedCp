package variablesForAnimation;

import processing.core.PApplet;

public class VForAnimation extends PApplet
{
    private int smileyX;
    
    public static void main(String[] args)
    {
        PApplet.main("variablesForAnimation.VForAnimation");
    }
    
    public void settings()
    {
        size(1100, 600);
    }

    public void setup()
    {
        smileyX = 300;
    }
    
    public void draw()
    {
        background(255);
        
        smileyX += 2;
        
        fill(255, 255, 0);
        ellipse(smileyX, 300, 300, 300);
        
        fill(0);
        ellipse(smileyX - 50, 300 - 75, 50, 50);
        ellipse(smileyX + 50, 300 - 75, 50, 50);
        arc(smileyX, 300, 200, 200, radians(0), radians(180));
    }
}
