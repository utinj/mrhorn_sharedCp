package interactingObjects;

import processing.core.PApplet;

public class HappySadFace
{
    private PApplet parent;
    private int centerX, centerY;
    private int red, green, blue;
    private boolean isSmiling;
    
    public HappySadFace(PApplet p, int cX, int cY, int r, int g, int b)
    {
        parent = p;
        centerX = cX;
        centerY = cY;
        red = r;
        green = g;
        blue = b;
        
        isSmiling = false;
    }
    
    public boolean areSameColor(HappySadFace otherFace)
    {
        return red == otherFace.red && green == otherFace.green && blue == otherFace.blue;
    }
    
    public void makeSmile()
    {
        isSmiling = true;
    }
    
    public void drawSelf()
    {
        parent.fill(red, green, blue);
        parent.ellipse(centerX, centerY, 450, 450);
        
        parent.fill(255);
        parent.ellipse(centerX - 100, centerY - 100, 50, 50);
        parent.ellipse(centerX + 100, centerY - 100, 50, 50);
        
        if(isSmiling)
            parent.arc(centerX, centerY + 100, 150, 100, PApplet.radians(0), PApplet.radians(180));
        else
            parent.arc(centerX, centerY + 100, 150, 100, PApplet.radians(180), PApplet.radians(360));
    }
}
