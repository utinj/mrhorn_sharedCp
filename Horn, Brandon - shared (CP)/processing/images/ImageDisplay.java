package images;

import processing.core.PApplet;
import processing.core.PImage;

public class ImageDisplay extends PApplet
{
    PImage picture;
    
    public static void main(String[] args)
    {
        PApplet.main("images.ImageDisplay");
    }
    
    public void settings()
    {
        size(315, 315);
    }
    
    public void setup()
    {
        picture = loadImage("images/hamster.jpeg");
    }
    
    public void draw()
    {
        image(picture, 0, 0);
    }
}
