package mouseClicks;

import processing.core.PApplet;

public class MouseClicking extends PApplet
{
    public void setup()
    {
        size(500, 500);
    }
    
    public void draw()
    {
        
    }
    
    public void mouseClicked()
    {
        println(mouseX);
        println(mouseY);
    }
}
