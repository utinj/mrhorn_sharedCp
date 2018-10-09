package methodsWithParameters;

import processing.core.PApplet;

public class MethodsWithParametersP7 extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("methodsWithParameters.MethodsWithParametersP7");
    }
    
    public void settings()
    {
        size(1000, 1000);
    }
    
    public void setup()
    {
        
    }
    
    public void draw()
    {
        background(0);
        
        drawSmileyFace(250, 250);
        drawSmileyFace(750, 250);
        drawSmileyFace(750, 500);
    }
    
    public void drawSmileyFace(int smileyX, int smileyY)
    {
        fill(0, 155, 255);
        ellipse(smileyX, smileyY, 450, 450);
        
        fill(255);
        ellipse(smileyX - 100, smileyY - 100, 50, 50);
        ellipse(smileyX + 100, smileyY - 100, 50, 50);
        
        arc(smileyX, smileyY + 100, 150, 100, radians(0), radians(180));
    }
}
