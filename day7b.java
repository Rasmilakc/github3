package test2;

public class day7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogB s = new DogB();
		s.makeSound();
		s.eat();
	}

}

abstract class AnimalC {
	abstract void makeSound();
	public void eat() {
		System.out.println("I can eat");
	}
}

class DogB extends  AnimalC{
	public void makeSound() {
		System.out.println("bark bark");
	}


	}
