package fruitMarket;

public class Apple extends Fruit{

	
	public Apple() {
		setCalories(100);
	}
	
	@Override
	public void makeJuice() {
		System.out.println("Remove the seed and make juice of apple");
	}
	
	public void removeSeeds() {
		System.out.println("remove the seeds");
	}
	

}
