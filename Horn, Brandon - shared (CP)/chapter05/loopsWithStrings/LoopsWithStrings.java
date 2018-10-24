package loopsWithStrings;

public class LoopsWithStrings
{

    public static void main(String[] args)
    {
        String str = "some of my students are strange";
        
        // compute a string that is the reverse of str
        String rStr = "";
        for(int index = str.length() - 1; index >= 0; index--)
            rStr += str.substring(index, index + 1);
        
        System.out.println(rStr);
        
        // print each character in a string on its own line
        for(int index = 0; index < str.length(); index++)
            System.out.println(str.substring(index, index + 1));
    }

}
