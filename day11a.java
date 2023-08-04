package Test3;

public class day11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 //abstract class
		BOAK A=new BOAK();
		A.loan();
		A.save();
		A.DisplayMessage();
		
		
		
		 car1 a=new car1("red");
		 System.out.println(a.color);
		 a.type();
		 
		 
		 DogBk s = new DogBk();
			s.makeSound();
			s.eat();
		
		
	}
}
abstract class WorldBankK{
	abstract void  save();
	abstract void  loan();
 public void DisplayMessage() {
	 System.out.println("welcome to worldBank");
 }
		
}
class BOAK extends WorldBankK{

	
	public void save() {
		System.out.println("save method");
		
	}

	public void loan() {
		System.out.println("save method");
		
		
	}
	}
		
	class chaseK extends WorldBankK{

		
		public void save() {
			System.out.println("save method");
			
		}

		
		public void loan() {
			System.out.println("loan method");
			
			
		}
		} 
	abstract class Vehicle{
		String color;
		public Vehicle(String cl) {
			this.color=cl;
		}
		abstract void type();
	}
	class car1 extends Vehicle{

		public car1(String cl) {
			super(cl);
			
		}
		public void type() {
			System.out.println("i am sedan");
		}
		}
	abstract class AnimalCk {
		abstract void makeSound();
		public void eat() {
			System.out.println("I can eat");
		}
	}

	class DogBk extends  AnimalCk{
		public void makeSound() {
			System.out.println("bark bark");
		}
	}
	
		
		
		