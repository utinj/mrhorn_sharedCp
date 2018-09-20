package mouseClicks;

import processing.core.PApplet;

public class MouseClicking extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("mouseClicks.MouseClicking");
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
        
    }
    
    public void mouseClicked()
    {
        println(mouseX);
        println(mouseY);
    }
}
