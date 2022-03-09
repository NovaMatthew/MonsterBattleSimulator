import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Battle {

	public static Monster readMonster(String fileName) 
	{

		File file = new File(fileName);
		System.out.println(fileName);
		Scanner fileInput = null;

		try 
		{

			fileInput = new Scanner(file);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Unable to load file!");
			e.printStackTrace();
			System.exit(1);
		}

		String name = fileInput.nextLine();

		double strength = fileInput.nextDouble();

		double health = fileInput.nextDouble();

		Monster m = new Monster(name, strength, health);

		return m;
	}

	public static void main(Scanner input)

	{

		Battle.battleMode(input);

	}

	public static void battleMode(Scanner input)

	{

		System.out.println("Enter file name:");

		String readFile = input.nextLine();

		Monster m1 = readMonster(readFile);

		System.out.println(m1);

		System.out.println(" ");

		System.out.println("Enter file name:");

		String readFile2 = input.nextLine();

		Monster m2 = readMonster(readFile2);

		System.out.println(m2);

		int roundNumber = 1;

		while(checkIfBattleShouldContinue(m1, m2)) 
		{
			System.out.println("Round: " + roundNumber);
			simulateOneRoundOfBattle(m1, m2);

			System.out.println(" ");
			roundNumber += 1;
		}

		announceWinner(m1, m2);

	}

	public static boolean checkIfBattleShouldContinue(Monster m1, Monster m2) 
	{
		if (m1.isAlive() && m2.isAlive()) 
		{
			return true;
		} 
			return false;
		
	}
		
		
	

	public static void simulateOneRoundOfBattle(Monster a, Monster b) 
	{

		double damageA = a.attack();
		b.takeDamage(damageA);

		System.out.println(
				a.getName() + " attacked " + b.getName() + " for " + String.format("%.2f", damageA) + " damage");

		double damageB = a.attack();
		a.takeDamage(damageB);

		System.out.println(
				b.getName() + " attacked " + a.getName() + " for " + String.format("%.2f", damageB) + " damage");

		System.out.println(a.toString());
		System.out.println(b.toString());
	}

	public static void announceWinner(Monster a, Monster b) 
	{
		if (a.isAlive() && !b.isAlive()) 
		{
			System.out.println(a.getName() + " WINNER!");
		} 
		else if (b.isAlive() && !a.isAlive()) 
		{
			System.out.println(b.getName() + " WINNER!");
		} 
		else 
		{
			System.out.println("DRAW!");
		}
	}

}
	