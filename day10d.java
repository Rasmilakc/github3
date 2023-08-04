package Test3;

public class day10d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	addA(12,4);
	addA(12,4,2);
	addA(12,4,2,1);

	}
	public static void addA(int x,int y) {
		System.out.println(x+y);
	}
	public static void addA(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public static void addA(int x,int y,int z,int a) {
		System.out.println(x+y+z+a);
		
		
		Calculator a2=new Calculator();
		a2.substracation(10, 2);
		a2.substracation(10, 2, 3);
		a2.substracation(10, 2, 3, 1);
		
		chase bank=new chase("Irving", "waco");
		bank.loan();
		bank.save();
		bank.displayMessage();
	}

} 
class Calculator{
	public void substracation(int a,int b) {
		System.out.println(a-b);
	}
	public void substracation(int a,int b,int c) {
		System.out.println(a-b-c);
	}
	public void substracation(int a,int b,int c,int d) {
		System.out.println(a-b-c-d);
}
}

class WorldBank{
	String Irving;
	public WorldBank( String irv) {
		this.Irving=irv;
	}
	public void save() {
		System.out.println("save method from worldBank");
	}
	public void loan() {
		System.out.println("loan method from worldBank");
	}
	public void displayMessage() {
		System.out.println("Welcome to Worldbank");
	}
}
class BOA extends WorldBank{
	String branchname;
	public BOA(String irv,String bnm) {
		super(irv);
		this.branchname=bnm;
	}
	public void save() {
		System.out.println("save method ");
	}
	public void loan() {
		System.out.println("loan method");
	}
}	

class chase extends WorldBank{
	String branch;

	public chase(String irv,String bn) {
		super(irv);
		this.branch=bn;
	}
	public void save() {
		System.out.println("save method from waco ");
	}
	public void loan() {
		System.out.println("loan method from waco");
	}
	
	}
	