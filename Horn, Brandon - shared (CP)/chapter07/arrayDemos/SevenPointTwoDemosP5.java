package arrayDemos;

import java.util.Arrays;
import java.util.Scanner;

public class SevenPointTwoDemosP5
{

    public static void main(String[] args)
    {
        // enhanced for loop (aka: for each loop)
//        int[] nums = {7, 3, 1};
//        
//        for(int value : nums)
//        {
//            System.out.print(value + " ");
//            
//            value = -1; // careful
//        }
//        System.out.println();
//
//        System.out.println(Arrays.toString(nums));
        
        // user input as array length
//        Scanner fromKeyboard = new Scanner(System.in);
//        
//        System.out.print("How long should my array be?: ");
//        int desiredLength = fromKeyboard.nextInt();
//        fromKeyboard.nextLine();
//        
//        int[] nums = new int[desiredLength];
//        System.out.println(nums.length);
        
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
        int[] arr3 = {7, 8, 9};
        int[] arr4 = new int[arr3.length];
        
        for(int i = 0; i < arr3.length; i++)
            arr4[i] = arr3[i];
        
        arr3[0] = 2;
        arr4[1] = 15;
        
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

}
