package collisioonDetection;

import processing.core.PApplet;

public class CollidingCircles extends PApplet
{
    public void setup()
    {
        size(500, 500);
    }
    
    public void draw()
    {
        background(0);
        
        float distance = dist(250, 250, mouseX, mouseY);
        if(distance <= 85)
            fill(255, 0, 0);
        else
            fill(255);
        
        ellipse(250, 250, 100, 100);
        
        ellipse(mouseX, mouseY, 70, 70);
    }
}
