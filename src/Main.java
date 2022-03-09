import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		System.out.println(" Welcome to the Ultimate Monster Battle Simulator! Press enter to continue...");
		input.nextLine();

		
		boolean quit = false;
		
		while (!quit) 
		{
		
			System.out.println("1. Battle or 2. quit? choose one...");
			String battleOrQuit = input.nextLine();
			int converted = Integer.parseInt(battleOrQuit);
		
		

			if (converted == 1) 
			{
				System.out.println("Great!");
				System.out.println(" ");
				Battle.main(input);
				
				
			}
			else 
			{
				
				quit = true;
				System.out.println("Thanks for playing!");
				System.exit(1); 
			}
		}
	}

}


