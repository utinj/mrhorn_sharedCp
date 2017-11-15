package timingDemo;

import processing.core.PApplet;

public class Timing extends PApplet
{
    boolean isUPS;
    int timeOfNextChange;
    
    public static void main(String[] args)
    {
        PApplet.main("timingDemo.Timing");
    }
    
    public void settings()
    {
        size(500, 500);
    }
    
    public void setup()
    {
        isUPS = true;
        timeOfNextChange = 1000;
    }
    
    public void draw()
    {
        background(255, 0, 255);
        
        if(millis() >= timeOfNextChange)
        {
            isUPS = ! isUPS;
            timeOfNextChange = millis() + 1000;
        }
        
        if(isUPS)
            fill(100, 65, 23);
        else
            fill(245, 245, 220);
        
        ellipse(250, 250, 300, 300);
    }
}