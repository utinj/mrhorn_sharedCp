package stringConcatenation;

public class StringDemo
{
    public static void main(String[] args)
    {
        int a = 5;
        double b = 5.2;

        String greeting = "Good morning ";
        String name = "Herman";

        System.out.println(a + b);
        System.out.println("" + a + b);
        System.out.println(greeting + name);
    }
}
