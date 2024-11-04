package coinTossGame;

public class Player {

	private String guess;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

}
