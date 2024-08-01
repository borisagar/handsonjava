package fruitMarket;

public class Banana extends Fruit{

	public Banana() {
		setCalories(50);
	}
	
	@Override
	public void makeJuice() {
		System.out.println("peel off the banana and make juice of banana");
	}
	
	public void peelOff() {
		System.out.println("peel off the banana and cut");
	}
}
