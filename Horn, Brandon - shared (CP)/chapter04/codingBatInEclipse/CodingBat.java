package codingBatInEclipse;

public class CodingBat
{

    public static void main(String[] args)
    {
        System.out.println(cigarParty(40, false));

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend)
        {
          if(cigars >= 40)
            return true;
        }
        else
        {
          if(cigars >= 40 && cigars <= 60)
            return true;
        }
        
        return false;
    }
}