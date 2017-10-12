package unicodeDemo;

public class UnicodeDemo
{
    public static void main(String[] args)
    {
        char letter = 'A';
        int unicode = letter;
        System.out.println(unicode);
        
        int otherUnicode = 98;
        char otherLetter = (char) otherUnicode;
        System.out.println(otherLetter);
    }
}