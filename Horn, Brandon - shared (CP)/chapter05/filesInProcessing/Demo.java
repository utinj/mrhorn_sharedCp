package filesInProcessing;

import processing.core.PApplet;

public class Demo extends PApplet
{
    private DataStorage ds;
    
    public static void main(String[] args)
    {
        PApplet.main("filesInProcessing.Demo");
    }
    
    public void settings()
    {
        size(500, 500);
    }
    
    public void setup()
    {
        ds = new DataStorage("documents/clicks.txt");
    }
    
    public void draw()
    {
        
    }
    
    public void mouseClicked()
    {
        ds.addValue("(" + mouseX + ", " + mouseY + ")");
    }
    
    public void keyPressed()
    {
        if(key == 'r')
            ds.loadValues();
        else if(key == 'w')
            ds.saveValues();
        else if(key == 'd')
        {
            for(String s : ds.getValues())
                println(s);
        }
    }
}