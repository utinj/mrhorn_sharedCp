package loopsForAnalysis;

public class OtherPeoplesLoops
{

    public static void main(String[] args)
    {
        // Assume these declarations appear before each loop.
        final int MIN = 10;
        final int MAX = 20;
        int num = 15;

        // Predict the result of each loop
        // (exact output or pattern of output before infinite loop).
        // Don't run the code until you have predicted the output.

        // 1
        while (num < MAX)
        {
            System.out.println(num);
            num = num + 1;
        }

        // 2
        while (num < MAX)
        {
            num = num + 1;
            System.out.println(num);
        }

        // 3
        while (num < MAX)
        {
            System.out.println(num);
            num = num - 1;
        }

        // 4
        while (num > MIN)
        {
            System.out.println(num);
            num = num - 1;
        }

        // 5
        while (num < MAX)
        {
            System.out.println(num);
            num += 2;
        }

        // 6
        while (num < MAX)
        {
            if (num % 2 == 0)
                System.out.println(num);
            
            num++;
        }

        // 7
        for (int value = 0; value <= 7; value++)
            System.out.println(value);

        // 8
        for (int value = 7; value > 0; value--)
            System.out.println(value);

        // 9
        for (int value = 1; value <= 20; value += 4)
            System.out.println(value);

        // 10
        for (int value = num; value <= MAX; value++)
            System.out.println(value);

        // 11
        for (int value = num; value <= MAX; value++)
            if (value % 4 != 0)
                System.out.println(value);

        // 12
        for (int count1 = 1; count1 <= 7; count1++)
        {
            for (int count2 = 1; count2 <= 5; count2++)
                System.out.print("#");
            
            System.out.println();
        }

        // 13
        for (int count1 = 1; count1 <= 5; count1++)
        {
            for (int count2 = 1; count2 <= 5; count2++)
                System.out.print(count1 * count2 + " ");

            System.out.println();
        }
    }
}