package variablesForAnimation;

import processing.core.PApplet;

public class VariablesForAnimation2 extends PApplet
{

    private int smileyX;
    
    public static void main(String[] args)
    {
        PApplet.main("variablesForAnimation.VariablesForAnimation2");
    }

    public void settings()
    {
        size(800, 500);
    }
    
    public void setup()
    {
        smileyX = 150;
    }
    
    public void draw()
    {
        background(0, 200, 0);
        
        smileyX += 2;
        
        drawSmileyFace();
    }
    
    public void drawSmileyFace()
    {
        fill(255, 0, 255);
        ellipse(smileyX, 250, 300, 300);
        
        fill(0);
        ellipse(smileyX - 50, 250 - 70, 50, 50);
        ellipse(smileyX + 50, 250 - 70, 50, 50);
        arc(smileyX, 250, 200, 200, radians(0), radians(180));
    }
}
