package arrayDemos;

import java.util.Arrays;
import java.util.Scanner;

public class SevenPointTwoDemos
{

    public static void main(String[] args)
    {
        // enhanced for loop (aka: for each loop)
//        boolean[] flags = new boolean[3];
//        flags[1] = true;
//        
//        for(boolean flag : flags)
//        {
//            System.out.print(flag + " ");
//            
//            flag = true; // careful
//        }
//        System.out.println();
//        
//        System.out.println(Arrays.toString(flags));

        // user input as array length
//        Scanner fromKeyboard = new Scanner(System.in);
//        
//        System.out.print("How long should be array be?: ");
//        int desiredLength = fromKeyboard.nextInt();
//        fromKeyboard.nextLine();
//        
//        int[] values = new int[desiredLength];
//        System.out.println(values.length);
        
        // array of random length
//        int desiredLength = (int) (Math.random() * 420) + 1; // have: 1 <= desiredLength <= 420
//        // want: 1 <= desiredLength <= 420
//        
//        int[] values = new int[desiredLength];
//        System.out.println(values.length);
        
        // array variables are references
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = arr1;
//        
//        arr1[0] = 5;
//        arr2[1] = 6;
//        
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
        
        // copying an array
//        int[] arr3 = {7, 8, 9};
//        int[] arr4 = new int[arr3.length];
//        
//        for(int i = 0; i < arr3.length; i++)
//            arr4[i] = arr3[i];
//        
//        arr3[0] = 2;
//        arr4[1] = 15;
//        
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr4));
    }

}
