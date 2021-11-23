import java.util.Scanner;
public class mainClass {
	static BSTree bst = new BSTree();
	
	public static void main(String Args[])
	{
		int index = 0;
		System.out.println("The given files are:");
		while(index < Args.length)
		{
			System.out.println(Args[index]);
			index++;
		}
		System.out.println("Number of files: " + index);
		System.out.println("****Options: ****");
		System.out.println("1. Build BSTree from vocabulary file");
		System.out.println("2. Build vectors from input files");
		System.out.println("3. Display matched words and frequency");
		System.out.println("4. Searching a query");
		System.out.println("5. Exit");
		System.out.println("Choose between 1 - 5 : ");
		Scanner sc= new Scanner(System.in);   
		int choice = sc.nextInt(); 
		while(choice != 5)
		{
			if(choice == 1)
			{
				Vocabulary thread1 = new Vocabulary();
				thread1.run(Args[0]);
				thread1.print();
			}
			else if(choice == 2)
			{
				for(int i = 1; i < index; i ++)
				{
					Vectors thread2 = new Vectors();
					thread2.run(Args[i]);
				}
			}
			else if(choice == 3)
			{
				Vocabulary thread3 = new Vocabulary();
				thread3.run(Args[0]);
				for(int i = 1; i < index; i ++)
				{
					input thread4 = new input();
					thread4.run(Args[i]);
				}
	    	}
			else if(choice == 4)
			{
				System.out.println("Input query : ");
				sc = new Scanner(System.in);  
				query thread4 = new query();
				String input = sc.nextLine(); 
				thread4.run(Args, input);
			}
			System.out.println("\n\nPress 5 to exit and 1 to continue : ");
			choice = sc.nextInt(); 
			if(choice == 1)
			{
				System.out.println("****Options: ****");
				System.out.println("1. Build BSTree from vocabulary file");
				System.out.println("2. Build vectors from input files");
				System.out.println("3. Display matched words and frequency");
				System.out.println("4. Searching a query");
				System.out.println("5. Exit");
				System.out.println("Choose between 1 - 5 : ");
				choice = sc.nextInt();
			}

		}
	}
	
}
