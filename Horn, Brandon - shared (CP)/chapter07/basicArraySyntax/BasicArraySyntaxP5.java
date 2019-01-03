package basicArraySyntax;

import java.util.Arrays;

public class BasicArraySyntaxP5
{

	public static void main(String[] args)
	{
		int[] grades = new int[5];
		grades[0] = 95;
		grades[1] = 74;
		
		System.out.println(Arrays.toString(grades));
		System.out.println(grades.length);
		
		System.out.println(grades[0]);
	}

}
