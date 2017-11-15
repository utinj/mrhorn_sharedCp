package writingMethods;

import processing.core.PApplet;

public class Methods extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("writingMethods.Methods");
    }
    
    public void settings()
    {
        size(500, 500);
    }
    
    public void setup()
    {
        
    }
    
    public void draw()
    {
        background(0);
        
        drawSmileyFace();
    }

    public void drawSmileyFace()
    {
        fill(0, 155, 255);
        ellipse(250, 250, 450, 450);
        
        fill(255);
        ellipse(150, 150, 50, 50);
        ellipse(350, 150, 50, 50);
        
        arc(250, 350, 150, 100, radians(0), radians(180));
    }
}
