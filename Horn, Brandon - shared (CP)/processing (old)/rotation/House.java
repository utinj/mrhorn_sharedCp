package rotation;

import processing.core.PApplet;

public class House
{
    private PApplet parent;
    private int x, y, rotationDegrees;
    
    public House(PApplet parent, int startX, int startY)
    {
        this.parent = parent;
        x = startX;
        y = startY;
        rotationDegrees = 0;
    }
    
    public void drawSelf()
    {
        parent.fill(255);
        parent.rectMode(PApplet.CENTER);
        
        parent.translate(x, y);
        parent.rotate(PApplet.radians(rotationDegrees));
        
        parent.rect(0, 0, 50, 50);
        parent.triangle(-25, -25, 0, -50, 25, -25);
        
        parent.resetMatrix();
    }
    
    // rotations are cumulative
    public void rotateRight(int degrees)
    {
        rotationDegrees += degrees;
    }
}
