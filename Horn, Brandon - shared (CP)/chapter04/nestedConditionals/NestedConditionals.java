package nestedConditionals;

public class NestedConditionals
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 10;
        
        if(a == 5)
            if(b == 10)
                System.out.println("position 1");
            else
                System.out.println("position 2");
        
        if(a == 5)
        {
            if(b == 10)
                System.out.println("position 3");
        }
        else
            System.out.println("position 4");
        
        // An else statement pairs with the closest if
        // statement unless brackets indicate otherwise.
    }
}