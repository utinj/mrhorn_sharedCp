package methodsWithParameters;

import processing.core.PApplet;

public class MethodsWithParametersP1 extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("methodsWithParameters.MethodsWithParametersP1");
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
        drawSmileyFace(500, 750);
    }
    
    public void drawSmileyFace(int centerX, int centerY)
    {
        fill(0, 155, 255);
        ellipse(centerX, centerY, 450, 450);
        
        fill(0);
        ellipse(centerX - 100, centerY - 100, 50, 50);
        
        fill(255);
        ellipse(centerX + 100, centerY - 100, 50, 50);
        
        arc(centerX, centerY + 100, 150, 100, radians(0), radians(180));
    }
}
