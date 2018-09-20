package rotation;

import processing.core.PApplet;

public class Demo extends PApplet
{
    private House h;
    
    public static void main(String[] args)
    {
        PApplet.main("rotation.Demo");
    }
    
    public void settings()
    {
        size(500, 500);
    }
    
    public void setup()
    {
        h = new House(this, 250, 250);
        h.rotateRight(30);
    }
    
    public void draw()
    {
        background(0);
        h.drawSelf();
    }
    
    public void mousePressed()
    {
        h.rotateRight(15);
    }
}