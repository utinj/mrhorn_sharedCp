package pc13_broken;

public class CtoF
{
    public static void main(String[] args)
    {
        System.out.println("Centigrade\tFahrenheit");
        for(int centigrade = 0; centigrade < 20; centigrade++)
        {
            double fahrenheit = convertToFahrenheit(centigrade);
            System.out.println(centigrade + fahrenheit);
        }
    }
    
    private static double convertToFahrenheit(double centigrade)
    {
        return (9 / 5) * (centigrade + 32);
    }
}
