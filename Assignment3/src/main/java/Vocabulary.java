import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vocabulary extends Thread {
	synchronized public void run(String path)
	{
		
	    File myfile = new File("vocabulary.TXT");
	
		try 
		{
			Scanner scanner = new 	Scanner(myfile);
			while(scanner.hasNextLine())
			{
				mainClass.bst.insert(scanner.next());
			}
		} 
		catch (FileNotFoundException e) {
	
			e.printStackTrace();
		}
		
	}
	public static void print()
	{
		System.out.println("The binary tree is: ");
		mainClass.bst.inorder();
	}
	
}
