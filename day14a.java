package Test3;

public class day14a {

	public static void main(String[] args) {
		//ONE program for overriding
		SB A=new SB("america", "waco");
		A.loan();
		A.save();
		A.displaymessage();
} 
}
class WB{
	String Texas;
	public WB(String tx) {
		this.Texas=tx;
	}public void loan() {
		System.out.println("loan method");
	}public void save() {
		System.out.println("save method");
	}public void displaymessage() {
		System.out.println("I am from america");
	}
}
class NB1 extends WB{
	String chabhil;

	public NB1(String tx,String ch) {
		super(tx);
		this.chabhil=ch;
	}public void loan() {
		System.out.println("loan method");
	}public void save() {
		System.out.println("save method");
	}
}
class SB extends WB{
	String branch;

	public SB(String tx,String bn) {
		super(tx);
		this.branch=bn;
	}
	public void loan() {
		System.out.println("loan method from waco");
	}public void save() {
		System.out.println("save method from waco ");
	}
}
