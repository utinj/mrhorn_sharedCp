package codingBatForTracing;

public class WithoutLoops
{
    // mystery1("Hello")
    // mystery1("H")
    // mystery1("hi")
    // mystery1("bob")
    public String mystery1(String str)
    {
        String tC = "";

        if (str.length() >= 2)
            tC = str.substring(0, 2);
        else if (str.length() == 1)
            tC = str.substring(0, 1);

        return tC + tC + tC;
    }
    
    // mystery2("java") // drop both, length 4
    // mystery2("away") // drop only second, length 4
    // mystery2("xby") // drop only first, length 3
    // mystery2("a")
    // mystery2("ax")
    // mystery2("xb")
    // mystery2("")
    public String mystery2(String str)
    {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'a')
            result += "a";

        if (str.length() >= 2 && str.charAt(1) == 'b')
            result += "b";

        if (str.length() >= 3)
            result += str.substring(2);

        return result;
    }
    
    // mystery3(5, 1)
    // mystery3(2, 2)
    // mystery3(5, 7)
    // mystery3(5, 8)
    public int mystery3(int you, int date)
    {
        if (you <= 2 || date <= 2)
            return 0;

        if (you >= 8 || date >= 8)
            return 2;

        return 1;
    }
    
    // mystery4(6, 1, 4)
    // mystery4(4, 11, 1)
    // mystery4(8, 4, 1)
    public int mystery4(int a, int b, int c)
    {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10)
            return 10;

        if (ab == bc + 10 || ab == ac + 10)
            return 5;

        return 0;
    }
    
    // mystery5(2, 3, true)
    // mystery5(3, 3, true)
    // mystery5(5, 3, false)
    // mystery5(4, 4, false)
    // mystery5(6, 6, true)
    // mystery5(6, 6, false)
    public int mystery5(int d1, int d2, boolean nD)
    {
        int d1V = d1;
        int d2V = d2;

        if (nD && d1V == d2V)
        {
            d1V++;

            if (d1V == 7)
                d1V = 1;
        }

        return d1V + d2V;
    }
}
