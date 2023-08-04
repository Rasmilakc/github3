package Test3;

interface Nabil{
	public void save(int x);
	public void loan(int y);
}

public class day13b {

	public static void main(String[] args) {
		// one program for interface
		
		capitalone A=new capitalone();
		A.loan(0);
		A.save(0);
		
		
		creditone B=new creditone();
		B.loan(0);
		B.save(0);
	}

} class capitalone implements Nabil{

	
	public void save(int x) {
		System.out.println("i am save method");
		
	}

	
	public void loan(int y) {
		System.out.println("i am loan method");
	}}
 class creditone implements Nabil{

	
	public void save(int x) {
		System.out.println("save method");
		
	}

	
	public void loan(int y) {
		System.out.println("loan method");
		
	}
	 
 }
