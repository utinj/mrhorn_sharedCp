package stringManipulationDemo;

public class StringManipulation
{
    public static void main(String[] args)
    {
        String name = "Brandon";
        //             0123456
        
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('n'));
        System.out.println(name.indexOf("and"));
        System.out.println(name.indexOf('j'));
        
        System.out.println(name.substring(2, 3));
        System.out.println(name.substring(2, 5));
        System.out.println(name.substring(4, name.length()));
        System.out.println(name.substring(4));
        
        char letter = name.charAt(3);
        System.out.println(letter);
        
        int len = name.length();
        System.out.println(len);
        
        name = name.toUpperCase();
        System.out.println(name);
    }
}
