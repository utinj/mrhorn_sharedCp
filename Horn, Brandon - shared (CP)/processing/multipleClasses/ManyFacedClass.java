package multipleClasses;

import processing.core.PApplet;

public class ManyFacedClass extends PApplet
{
    private Face f1, f2;
    
    public static void main(String[] args)
    {
        PApplet.main("multipleClasses.ManyFacedClass");
    }
    
    public void settings()
    {
        size(1000, 500);
    }
    
    public void setup()
    {
        f1 = new Face(this, 300, 585);
        f2 = new Face(this, 750, 250);
    }
    
    public void draw()
    {
        f1.drawSelf();
        f2.drawSelf();
    }
}