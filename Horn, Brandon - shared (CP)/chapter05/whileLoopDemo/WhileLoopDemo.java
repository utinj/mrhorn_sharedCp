package whileLoopDemo;

public class WhileLoopDemo
{

    public static void main(String[] args)
    {
        int x = 6;
        
        while(x >= 0)
        {
            System.out.println("hi " + x);
            x--; // x = x - 1;
        }
        
        System.out.println("Final value: " + x);
    }
}
