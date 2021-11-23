import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;


public class input extends Thread {
	synchronized public void run(String path)
	{
		int i = 0;
		word[] newWords = new word[100];
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
					 int flag = 0;
							if(mainClass.bst.search(input) == true)
							{
								for(int j = 0; j < i; j++)
								{
									if(newWords[j].getWord().compareTo( input ) == 0)
									{
										newWords[j].setFrequency(newWords[j].getFrequency()+1);
										flag = 1;
									}
								
								}
								if(flag == 0)
								{
									newWords[i] = new word(input, 1);
									i++;
								}
							}
				}
			
		}
		catch (FileNotFoundException e) 
		{
	
			e.printStackTrace();
		}
		System.out.println("\n\nFor file: " + path);
		for(int k = 0; k < i; k++)
		{
			System.out.println("Word:  " +  newWords[k].getWord() + "\nFrequency: " + newWords[k].getFrequency());
		}
		
	}
}