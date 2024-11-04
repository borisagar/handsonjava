package coinTossGame;

import java.util.Scanner;

public class CoinTossGame 
{

	public CoinTossGame() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[]) {
	
	Player player1 = new Player("Player1");
	Player player2 = new Player("Player2");
	boolean check = true;
	String guess = null;
	
	System.out.println("Guess the side from Heads or Tails ");
	while(check)
	{
		Scanner scanner = new Scanner(System.in);
		guess = scanner.next();
		
		if (guess.equals("Heads") || guess.equals("Tails")) 
		 {
			 player1.setGuess(guess);
			 scanner.close();
			 check = false;
	
         } else {
             System.out.println("Invalid input. Please enter 'Heads' or 'Tails'.");
             check = true;
             
         }
		
	}
	
	Coin coin = new Coin();
	
	 if(player1.getGuess().equalsIgnoreCase(Coin.HEADS)){
        player2.setGuess(Coin.TAILS);
    }else{
        player2.setGuess(Coin.HEADS);
    }
	
	coin.flip();
	
	System.out.println("Player 1 has choose: " + player1.getGuess());
	System.out.println("Player 2 has choose: " + player2.getGuess());
	System.out.println("Result of coin flip is: " +coin.getSide());
	
	//Result
	if(coin.getSide().equalsIgnoreCase(player1.getGuess()))
	{
		System.out.println("Player 1 is winner");
	}
	else
	{
		System.out.println("Player 2 is winner");
	}
	
	
	}
	
}
	
	
