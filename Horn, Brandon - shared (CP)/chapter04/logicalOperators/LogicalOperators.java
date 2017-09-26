package logicalOperators;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        int a = 3;
        int b = 1;
        
        if( !(a >= 3) )
        {
            System.out.println("message 3");
        }
        
        if(a >= 3 || b >= 5)
        {
            System.out.println("message 2");
        }
        
        if(a >= 3 && b >= 5)
        {
            System.out.println("message");
        }
    }
}
