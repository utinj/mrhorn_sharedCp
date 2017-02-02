package forLoopDemo;

public class ForLoopDemo
{
    public static void main(String[] args)
    {
        for(int n = 1; n <= 3; n++)
        {
            System.out.println(Math.pow(n, 2));
        }
        
        // same functionality as a while loop:
        
//        int n = 1;
//        while(n <= 3)
//        {
//            System.out.println(Math.pow(n, 2));
//            n++;
//        }
    }
}