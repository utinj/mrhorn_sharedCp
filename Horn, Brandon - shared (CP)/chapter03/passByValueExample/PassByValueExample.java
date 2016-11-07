package passByValueExample;

public class PassByValueExample
{

    public static void main(String[] args)
    {
        int val = 7;
        System.out.println("val (before method call): " + val);
        
        mystery(val);
        System.out.println("val (after method call): " + val);
    }

    public static void mystery(int num)
    {
        System.out.println("num (before set): " + num);
        num = 11;
        System.out.println("num (after set): " + num);
    }
}
