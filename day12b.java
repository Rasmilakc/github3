package Test3;

public class day12b {

	public static void main(String[] args) {
		//one program on abstract class
		Dog a=new Dog();
		a.eat();
		a.walk();
		

	}

} abstract class Animal{
	public void eat() {
		System.out.println("i can eat");
	}
	abstract void walk();
}
class Dog extends Animal{
	public void walk() {
		System.out.println("i can walk");
	}
}
