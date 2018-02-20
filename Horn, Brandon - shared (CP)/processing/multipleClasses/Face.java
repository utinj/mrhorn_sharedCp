package multipleClasses;

import processing.core.PApplet;

public class Face
{
    private PApplet parent;
    private int centerX, centerY;
    
    public Face(PApplet p, int cX, int cY)
    {
        parent = p;
        centerX = cX;
        centerY = cY;
    }
    
    public void drawSelf()
    {
        parent.fill(0, 155, 255);
        parent.ellipse(centerX, centerY, 450, 450);
        
        parent.fill(255);
        parent.ellipse(centerX - 100, centerY - 100, 50, 50);
        parent.ellipse(centerX + 100, centerY - 100, 50, 50);
        
        parent.arc(centerX, centerY + 100, 150, 100, PApplet.radians(0), PApplet.radians(180));
    }
}
