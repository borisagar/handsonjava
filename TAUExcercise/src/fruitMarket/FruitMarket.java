package fruitMarket;

public class FruitMarket {

	public static void main(String[] args){

	    Apple apple = new Apple();
	    apple.removeSeeds();
	    apple.makeJuice();
	    
	    Banana banana = new Banana();
	    banana.peelOff();
	    banana.makeJuice();
	    
	    Fruit apple2 = new Apple();
	    ((Apple)apple2).removeSeeds();
	    ((Apple)apple2).makeJuice();
	    		
	}
}
