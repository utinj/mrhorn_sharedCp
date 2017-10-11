package comparingStringsForEquality;

public class ComparingStrings
{
    public static void main(String[] args)
    {
        String s1 = "Hello world";
        
//        String s2 = "Hello " + "world";
        
        String s2 = "Hello worldly people".substring(0, 11);
        
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1 == s2);
    }
}
