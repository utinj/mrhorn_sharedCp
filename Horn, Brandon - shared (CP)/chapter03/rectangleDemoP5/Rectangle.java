package rectangleDemoP5;

public class Rectangle
{
    private int length;
    private int width;
    
    public Rectangle(int len, int wid)
    {
        length = len;
        width = wid;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getArea()
    {
        return length * width;
    }
    
    public void setLength(int newLength)
    {
        length = newLength;
    }
    
    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
}
