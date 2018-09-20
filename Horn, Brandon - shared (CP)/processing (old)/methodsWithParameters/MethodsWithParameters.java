package methodsWithParameters;

import processing.core.PApplet;

public class MethodsWithParameters extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("methodsWithParameters.MethodsWithParameters");
    }
    
    public void settings()
    {
        size(1000, 1000);
    }
    
    public void setup()
    {
        
    }
    
    public void draw()
    {
        background(0);
        
        drawSmileyFace(250, 250);
        drawSmileyFace(750, 250);
        drawSmileyFace(500, 750);
    }
    
    public void drawSmileyFace(int x, int y) // x and y are of the large ellipse
    {
        fill(0, 155, 255);
        ellipse(x, y, 450, 450);
        
        fill(255);
        ellipse(x - 100, y - 100, 50, 50);
        ellipse(x + 100, y - 100, 50, 50);
        
        arc(x, y + 100, 150, 100, radians(0), radians(180));
    }
}
