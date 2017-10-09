package otherCommonStringMethods;

public class ExtraStringMethods
{
    public static void main(String[] args)
    {
        String name = "Rumplestiltskin";
        //             01234567...
        
        System.out.println(name.substring(6, 11));
        System.out.println(name.substring(11, 15));
        System.out.println(name.substring(11));
        
        System.out.println(name.indexOf("l"));
        System.out.println(name.indexOf("tilt"));
        System.out.println(name.indexOf("ham"));
    }
}