package tauex2pkg;

import java.util.Scanner;

public class ExerciseTwo 
{
	
	public static void main(String arg[]) 
	{	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the seseion");
		String Season = scanner.next();
		
		System.out.println("Enter the adjustive");
		String Adjustive = scanner.next();
		
		System.out.println("Enter the Whole number");
		int Wholenumber = scanner.nextInt();
		
		
		scanner.close();
		
		System.out.println("On a " + Adjustive + " " + Season + " day, I drink a minimum of " + Wholenumber + " cups of coffee.");
		
		
	}

}
