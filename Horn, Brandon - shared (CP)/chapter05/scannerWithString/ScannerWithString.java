package scannerWithString;

import java.util.Scanner;

public class ScannerWithString
{

    public static void main(String[] args)
    {
        String message = "no more monkey code";
        
        Scanner fromMessage = new Scanner(message);
        
        while(fromMessage.hasNext())
        {
            System.out.println(fromMessage.next());
        }
        
        fromMessage.close();

    }

}
