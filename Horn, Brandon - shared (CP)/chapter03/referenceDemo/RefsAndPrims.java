package referenceDemo;

public class RefsAndPrims
{
	public static void main(String[] args)
	{
		primitiveExample1();
//		referenceExample1();
//		referenceExample2();
//		referenceExample3();
//		referenceExample4();
//		referenceExample5();
	}

	public static void primitiveExample1()
	{
		System.out.println("Start primitiveExample1()");
		int x = 5;
		int y = 6;
		x = y;
		y = 7;
		System.out.println(x);
		System.out.println(y);
		System.out.println("End primitiveExample1()");
	}

	public static void referenceExample1()
	{
		System.out.println("Start referenceExample1()");
		Coordinate2D referenceOne = new Coordinate2D(1, 1);
		Coordinate2D referenceTwo = new Coordinate2D(2, 2);
		System.out.println(referenceOne);
		System.out.println(referenceTwo);
		System.out.println("End referenceExample1()");
	}

	public static void referenceExample2()
	{
		System.out.println("Start referenceExample2()");
		Coordinate2D referenceOne = new Coordinate2D(1, 1);
		Coordinate2D referenceTwo = referenceOne;
		System.out.println(referenceOne);
		System.out.println(referenceTwo);
		System.out.println("End referenceExample2()");
	}

	public static void referenceExample3()
	{
		System.out.println("Start referenceExample3()");
		Coordinate2D referenceOne = new Coordinate2D(1, 1);
		Coordinate2D referenceTwo = referenceOne;
		referenceOne.setX(3);
		referenceTwo.setY(4);
		System.out.println(referenceOne);
		System.out.println(referenceTwo);
		System.out.println("End referenceExample3()");
	}

	public static void referenceExample4()
	{
		System.out.println("Start referenceExample4()");
		Coordinate2D referenceOne = new Coordinate2D(1, 1);
		Coordinate2D referenceTwo = referenceOne;

		System.out.println(referenceOne);
		System.out.println(referenceTwo);

		referenceTwo = new Coordinate2D(2, 2);

		System.out.println(referenceOne);
		System.out.println(referenceTwo);
		System.out.println("End referenceExample4()");
	}

	public static void referenceExample5()
	{
		System.out.println("Start referenceExample5()");
		Coordinate2D referenceOne = new Coordinate2D(1, 1);
		System.out.println(referenceOne);
		referenceOne = new Coordinate2D(2, 2);
		System.out.println(referenceOne);
		System.out.println("End referenceExample5()");
	}
}
