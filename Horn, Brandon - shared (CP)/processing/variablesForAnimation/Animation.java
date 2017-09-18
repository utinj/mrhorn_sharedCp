package variablesForAnimation;

import processing.core.PApplet;

public class Animation extends PApplet
{
    int x = 250;
    
    float diameter = 10;
    
    public void setup()
    {
        size(800, 250);
    }
    
    public void draw()
    {
        background(0, 0, 255);
        
        fill(255, 0, 0);
        ellipse(x, 125, diameter, diameter);
        
        fill(255, 150, 0);
        ellipse(x, 125, diameter - 10, diameter - 10);
        
        x = x + 2;
        
        diameter += 1;
    }
}
