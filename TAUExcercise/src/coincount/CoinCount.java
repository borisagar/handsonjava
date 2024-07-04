package coincount;

import java.util.Scanner;

public class CoinCount 
{

	public static void main(String arg[])
	{
		System.out.println("Welcome to the Change for Hundred game"
				+ "Enter the number of coins for Rs.1 , 5, 10, 20 to make Rs. 100");
		
		int expectedSum = 100;
		int rsOne = 1;
		int rsFive = 5;
		int rsTen = 10;
		int rsTwenty = 20;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of coin for Rs.1");
		int rsOneCoin = scanner.nextInt();
		
		System.out.println("Enter the number of coin for Rs.5");
		int rsFiveCoin = scanner.nextInt();
		
		System.out.println("Enter the number of coin for Rs.10");
		int rsTenCoin = scanner.nextInt();
		
		System.out.println("Enter the number of coin for Rs.20");
		int rsTwentyCoin = scanner.nextInt();
		
		int sum = (rsOneCoin*rsOne)+(rsFiveCoin*rsFive)+(rsTenCoin*rsTen)+(rsTwentyCoin*rsTwenty);
		
		
			
		if(expectedSum > sum )
		{
			System.out.println("You lose ! You enterd less amount of coin combination");
		}
		else if(expectedSum < sum)
		{
			System.out.println("You lose ! You enterd higher amount of coin combination");
		}
		else
		{
			System.out.println("You won the game");
		}	
						
					
		
	}
}
