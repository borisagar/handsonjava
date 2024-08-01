package abstractClass;

public class Farm{

	public static void main(String arg[]) {
		
		Animal pig = new Pig();
		pig.makeSound();
		pig.eat("loki");
		
		Animal duck = new Duck();
		duck.makeSound();
		duck.eat("fish");
		
	}
	

}
