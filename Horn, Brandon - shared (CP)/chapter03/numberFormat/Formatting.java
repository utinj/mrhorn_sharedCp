package numberFormat;

import java.text.NumberFormat;

public class Formatting
{

	public static void main(String[] args)
	{
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(9.4)); // $9.40
		
		NumberFormat nf2 = NumberFormat.getPercentInstance();
		System.out.println(nf2.format(0.9));
	}

}
