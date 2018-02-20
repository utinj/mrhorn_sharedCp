package writingMethods;

import processing.core.PApplet;

public class Methods2 extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("writingMethods.Methods2");
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
        fill(255, 255, 0);
        ellipse(250, 250, 200, 200);
        
        fill(255, 0, 255);
        ellipse(200, 200, 50, 50);
        ellipse(300, 200, 50, 50);
        
        arc(250, 300, 150, 75, radians(180), radians(359));
    }
}
