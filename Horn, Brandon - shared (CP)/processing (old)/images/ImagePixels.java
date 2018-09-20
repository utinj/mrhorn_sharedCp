package images;

import processing.core.PApplet;
import processing.core.PImage;

public class ImagePixels extends PApplet
{
    private PImage picture;
    
    public static void main(String[] args)
    {
        PApplet.main("images.ImagePixels");
    }
    
    public void settings()
    {
        size(315, 315);
    }
    
    public void setup()
    {
        picture = loadImage("images/hamster.jpeg");
        manipulate();
    }
    
    public void draw()
    {
        image(picture, 0, 0);
    }
    
    public void manipulate()
    {
        picture.loadPixels();
        
        for(int i = 0; i < picture.pixels.length; i++)
        {
            int pixel = picture.pixels[i];
            picture.pixels[i] = color(blue(pixel), red(pixel), green(pixel));
        }
        
        picture.updatePixels();
    }
}
