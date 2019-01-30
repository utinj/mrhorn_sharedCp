package arrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names.size());
		
		names.add("Jamie");
		names.add("Conrad");
		
		System.out.println(names);
		System.out.println(names.size());
		
		names.add(1, "Murray");
		
		System.out.println(names);
		System.out.println(names.size());
		
		names.remove(1);
		
		System.out.println(names);
		System.out.println(names.size());
		
//		names.remove(12);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(new Integer(5));
		numbers.add(7); // new Integer(7)
		
		System.out.println(numbers);
	}

}
