import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class query {
	synchronized public void run(String paths[], String input)
	{
		boolean main_flag = false;
		boolean[] exists = new boolean[100];
		int index = paths.length;
		int i = 0;
		int inside = 0;
		int word_count=0;
		while(i < index)
		{
			main_flag = false;
			inside = 0;
			System.out.println("\n\n************\n");
			int number_of_matches = 0;
			
			boolean flag = false;
			int frequency = 0;
			File file = new File(paths[i]);
			StringTokenizer word = new StringTokenizer(input);
			StringTokenizer fre = new StringTokenizer(input);
			word_count = word.countTokens();
			String[] fre1 = new String[100];
			for (int c = 0; fre.hasMoreTokens(); c++)
			{
				fre1[c] = fre.nextToken();
			}
			while (word.hasMoreTokens())
			{
				String word_to_check = word.nextToken();
				Scanner scanner;
				try
				{
					scanner = new Scanner(file);
						
					while(scanner.hasNext())
					{
						String input_file =  scanner.next();
						if(input_file.equals(word_to_check))
						{
							flag = true;
							frequency++;
							exists[inside] = true;
						}	
					}
					if(flag == true)
					{
						int count = 0;
						for(int c = 0; c < word_count; c++)
						{
							if(fre1[c].equals(word_to_check))
							{
								count++;
							}
						}
						if(frequency < count)
						{
							main_flag = true;
						}
						System.out.println( word_to_check + " is present in file " + paths[i]);
						System.out.println( "Its frequency is: " + frequency);
						flag = false; frequency = 0;
						number_of_matches++;
					}	
				}
				catch (FileNotFoundException e) 
				{
					
					e.printStackTrace();
				}	
				inside++;
			}
			System.out.println("\nWords matched in file " + paths[i] + " is: " + number_of_matches );
			if(main_flag == false && number_of_matches == word_count)
			{
				System.out.println("Perfect match found in file "+ paths[i]);
			}
			else
			{
				System.out.println("Perfect match not found in file "+ paths[i]);
			}
			i++;
			}
		int check = 0;
		for(int j = 0; j < word_count; j++)
		{
			if(exists[j] == true)
			{ 
				 check++;
			}
		}
		System.out.println("\n\n" + check + " words are found in files!" ) ;

	}	
}
