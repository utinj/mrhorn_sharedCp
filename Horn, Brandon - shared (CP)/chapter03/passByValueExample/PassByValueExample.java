package passByValueExample;

public class PassByValueExample
{

    public static void main(String[] args)
    {
        int val = 7;
        
        System.out.println("val (before): " + val);
        
        mystery(val);
        
        System.out.println("val (after): " + val);
    }

    public static void mystery(int num)
    {
        num = 11;
        
        System.out.println("num: " + num);
    }
}
