package sound;

import processing.core.PApplet;
import processing.sound.*;

public class SoundDemo extends PApplet
{
    WhiteNoise noise;
    
    public static void main(String[] args)
    {
        PApplet.main("sound.SoundDemo");
    }
    
    public void settings()
    {
        size(640, 360);
    }
    
    public void setup()
    {
        background(255);
        
        noise = new WhiteNoise(this);
        noise.play();
    }
    
    public void draw()
    {
        
    }
}