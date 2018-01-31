package rectangleDemoP1;

public class RectangleRunner
{

    public static void main(String[] args)
    {
        Rectangle cubert = new Rectangle(50, 25);
        Rectangle harold = new Rectangle(25, 75);
        
        System.out.println(cubert.getLength());
        System.out.println(harold.getLength());
        
        System.out.println(cubert.getArea());
        
        cubert.setWidth(100);
        
        System.out.println(cubert.getArea());
    }

}
