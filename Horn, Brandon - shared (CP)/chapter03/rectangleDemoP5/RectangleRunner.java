package rectangleDemoP5;

public class RectangleRunner
{

    public static void main(String[] args)
    {
        Rectangle phil = new Rectangle(5, 10);
        Rectangle vibhat = new Rectangle(7, 11);
        
        System.out.println(phil.getArea());
        System.out.println(vibhat.getArea());
        
        phil.setLength(12);
        System.out.println(phil.getArea());
    }

}
