package readingTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading
{
	// This demo assumes an extra line at end of file
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner fromFile = new Scanner(new File("data/grades.txt"));
		
		while(fromFile.hasNextLine())
		{
			String name = fromFile.next();
			int grade = fromFile.nextInt();
			fromFile.nextLine(); // eat end of line
			
			System.out.println(name + ": " + grade);
		}
		
		fromFile.close();
	}

}
