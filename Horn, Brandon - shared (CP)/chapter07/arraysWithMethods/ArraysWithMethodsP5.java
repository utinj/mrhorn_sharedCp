package arraysWithMethods;

import java.util.Arrays;

public class ArraysWithMethodsP5
{
    public static void main(String[] args)
    {
        // test addTwoToEach
//        int[] values = {1, 2, 3};
//        addTwoToEach(values);
//        System.out.println(Arrays.toString(values));
        
        // test doubleLengthBroken
//        int[] values = {1, 2, 3};
//        doubleLengthBroken(values);
//        System.out.println(Arrays.toString(values));

        //     test doubleLengthBroken
//        int[] values = {1, 2, 3};
//        values = doubleLengthFixed(values);
//        System.out.println(Arrays.toString(values));
    }
    
    public static void addTwoToEach(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = nums[i] + 2;
        }
    }

    /*
     * ex:
     *  nums -> {1, 3, 5}
     *  nums should end up as -> {1, 3, 5, 0, 0, 0}
     */
    public static void doubleLengthBroken(int[] nums)
    {
        int[] newNums = new int[nums.length * 2];
        
        for(int i = 0; i < nums.length; i++)
        {
            newNums[i] = nums[i];
        }
        
        nums = newNums;
    }
    
    /*
     * ex:
     *  nums -> {1, 3, 5}
     *  method should return -> {1, 3, 5, 0, 0, 0}
     */
    public static int[] doubleLengthFixed(int[] nums)
    {
        int[] newNums = new int[nums.length * 2];
        
        for(int i = 0; i < nums.length; i++)
        {
            newNums[i] = nums[i];
        }
        
        return newNums;
    }
}