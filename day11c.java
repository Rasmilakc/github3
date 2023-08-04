package Test3;
interface WorldBank2{
	public void save();
	public void loan();
}
class A{
	public void GreetA() {
		System.out.println("hello");
	}
} 
class B{
	public void GreetB() {
		System.out.println("NAMASTE");
	}
}
class c extends A{
	
}

interface WBA{
	public void save();
	public void loan();
}
interface WB1{
	public void displaycountry();
	public void displaycity();
}
		
	


public class day11c {

	public static void main(String[] args) {
		comerica a=new comerica();
		a.loan();
		a.save();
		
		NB B=new NB();
		B.loan();
		B.save();
		
		c a2=new c();
		a2.GreetA();
		
		BankR D=new BankR();
		D.displaycity();
		D.displaycountry();
		D.loan();
		D.save();
		

	}

}
class comerica implements WorldBank2{

	
	public void save() {
		System.out.println("save method");
		
	}

	
	public void loan() {
		System.out.println("loan method");
		
	}
	
}
class NB implements WorldBank2{

	
	public void save() {
		System.out.println("save method");
		
	}

	
	public void loan() {
		System.out.println("loan method");
		
	}
	
}
class BankR implements WBA,WB1{

	
	public void displaycountry() {
		System.out.println("nepal");
		
	}

	
	public void displaycity() {
		System.out.println("irving");
		
	}

	
	public void save() {
		System.out.println("save method");
		
	}

	
	public void loan() {
		System.out.println("loan method");
		
		
	}
	
}
