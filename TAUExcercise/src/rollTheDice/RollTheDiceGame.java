package rollTheDice;

import java.util.Random;

public class RollTheDiceGame 
{

	//The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
	//After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
	//However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
	//If they are greater than or less than 20 spaces exactly, they lose.
	//Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
	
	public static void main(String arg[]) 
	{
		
		System.out.println("Welcome to the Roll to reach 20 game");
		
		int lastSpace = 20;
		int maxRolls = 5;
		int currentSpace = 0;
		
		Random random = new Random();
		
		for(int i=0; i<maxRolls && currentSpace<lastSpace; i++) 
		{
			int die = random.nextInt(6) + 1;
			currentSpace = currentSpace + die;
			
			if(currentSpace>lastSpace)
			{
				System.out.println(String.format("Roll #%d: You've rolled a %d : You loss the game you have exide above %d blocks", (i+1), die, lastSpace));
				break;
			}
			else
				System.out.println("Roll #" +(i+1)+ ": You've rolled a " +die+". You are now on space " +currentSpace+ " and have " +(lastSpace-currentSpace)+ " more to go.");
		
		}
		
		if(currentSpace<lastSpace)
			System.out.println("You loss the game - after 5 times rolling the dies you have not reach upto "+lastSpace+ " blocks");
		else if(currentSpace == lastSpace)
		{
			System.out.println("Hureey ! You wont the game");
		}
	}
}

	
	        

