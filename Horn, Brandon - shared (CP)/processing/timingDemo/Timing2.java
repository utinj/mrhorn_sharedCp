package timingDemo;

import processing.core.PApplet;

public class Timing2 extends PApplet
{
    int nextTimeToDraw;
    
    public void setup()
    {
        size(1100, 900);
        
        nextTimeToDraw = 3000;
    }
    
    public void draw()
    {
        if(millis() >= nextTimeToDraw)
        {
            int x = (int) random(100f, 1000f); // 100 <= x < 1000
            int y = (int) random(100f, 800f);
            drawSmileyFace(x, y);
            
            nextTimeToDraw = millis() + 1000;
        }
    }
    
    public void drawSmileyFace(int x, int y) // x and y are center of large ellipse
    {
        fill(255, 255, 0);
        ellipse(x, y, 200, 200);
        
        fill(255, 0, 255);
        ellipse(x - 50, y - 50, 50, 50);
        ellipse(x + 50, y - 50, 50, 50);
        
        arc(x, y + 50, 150, 75, radians(180), radians(359));
    }
}