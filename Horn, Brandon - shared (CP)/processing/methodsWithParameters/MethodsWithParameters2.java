package methodsWithParameters;

import processing.core.PApplet;

public class MethodsWithParameters2 extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("methodsWithParameters.MethodsWithParameters2");
    }
    
    public void settings()
    {
        size(1000, 750);
    }
    
    public void setup()
    {
        
    }
    
    public void draw()
    {
        background(0);
        
        drawSmileyFace(250, 250);
        drawSmileyFace(750, 250);
        drawSmileyFace(500, 550);
    }

    public void drawSmileyFace(int x, int y) // x and y are center of large ellipse
    {
        fill(255, 255, 0);
        ellipse(x, y, 200, 200);
        
        fill(255, 0, 255);
        ellipse(x - 50, y - 50, 50, 50);
        ellipse(x + 50, y - 50, 50, 50);
        
        arc(x, y + 50, 150, 75, radians(180), radians(359));
    }
}
