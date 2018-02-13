package interactingObjects;

import processing.core.PApplet;

public class HappyOrSad extends PApplet
{
    private HappySadFace f1, f2;
    
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
        f1 = new HappySadFace(this, 300, 300, 255, 0, 0);
        f2 = new HappySadFace(this, 750, 250, 255, 0, 0);
    }
    
    public void draw()
    {
        f1.drawSelf();
        f2.drawSelf();
    }

    public void mouseClicked()
    {
        if(f1.areSameColor(f2))
        {
            f1.makeSmile();
            f2.makeSmile();
        }
    }
}