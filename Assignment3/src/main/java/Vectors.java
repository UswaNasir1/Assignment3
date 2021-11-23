import java.io.File;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class Vectors extends Thread
{
public void run(String path)
{
	
		Vector<String> vec = new Vector<String>();  
		int index = 0;
		File myfile = new File(path);
		try 
		{
				Scanner scanner = new 	Scanner(myfile);
				while(scanner.hasNext())
				{
					 String input =  scanner.next();
					 vec.add(input);
				}
		}
		catch (FileNotFoundException e) 
		{
	
			e.printStackTrace();
		}
		Enumeration enu = vec.elements();
		  
        System.out.println("The values in vector are:");
  
        
        while (enu.hasMoreElements()) 
        {
            System.out.println(enu.nextElement());
        }
}
}