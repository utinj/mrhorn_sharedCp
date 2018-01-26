package arraysWithMethods;

import java.util.Arrays;

public class ArraysWithMethodsP1
{
    public static void main(String[] args)
    {
        // test addOneToEach
//        int[] values = {1, 4, 8};
//        
//        addOneToEach(values);
//        
//        System.out.println(Arrays.toString(values));
        
        // test doubleLengthBroken
//        int[] values = {1, 3, 5};
//        
//        doubleLengthBroken(values);
//        
//        System.out.println(Arrays.toString(values));
        
        // test doubleLengthFixed
//        int[] values = {1, 3, 5};
//        
//        values = doubleLengthFixed(values);
//        
//        System.out.println(Arrays.toString(values));
    }
    
    public static void addOneToEach(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = nums[i] + 1;
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
            newNums[i] = nums[i];
        
        nums = newNums;
    }
    
    /*
     * ex:
     *  nums -> {1, 3, 5}
     *  method returns -> {1, 3, 5, 0, 0, 0}
     */
    public static int[] doubleLengthFixed(int[] nums)
    {
        int[] newNums = new int[nums.length * 2];
        
        for(int i = 0; i < nums.length; i++)
            newNums[i] = nums[i];
        
        return newNums;
    }
}