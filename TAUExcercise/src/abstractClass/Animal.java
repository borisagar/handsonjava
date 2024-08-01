package abstractClass;

public abstract class Animal {

	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void makeSound();
	
	public void eat(String food) {
		System.out.println("I eat " + food);
	}

}
