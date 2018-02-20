package template;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import processing.core.PApplet;

public class FinchInProcessingTemplate extends PApplet
{
    Finch myFinch;
    
    public static void main(String[] args)
    {
        PApplet.main("template.FinchInProcessingTemplate");
    }
    
    public void settings()
    {
        
    }
    
    public void setup()
    {
        myFinch = new Finch();
    }
    
    public void draw()
    {
        
    }
}
