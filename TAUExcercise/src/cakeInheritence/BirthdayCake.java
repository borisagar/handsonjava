package cakeInheritence;

public class BirthdayCake extends CakeSuperclass{

	private int candles;
	
	
	
	public BirthdayCake(String flavor) {
		super(flavor);
	}

	
	public int getCandles()
	{
		return candles;
	}
	public void setCandles(int candles) 
	{
		this.candles = candles;
	}

}
