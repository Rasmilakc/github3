package Test3;

public class day12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// one program on inheritance multilevel
		SonAB rosan=new SonAB("narayan","khatri","suresh","rosan");
		System.out.println(rosan.firstName);
		System.out.println(rosan.lastName);
		System.out.println(rosan.FfirstName);
		System.out.println(rosan.Sname);
		rosan.displayGName();
		rosan.displayFName();
		rosan.displaySName();
		

	}

}
class GrandfatherA{
	String firstName;
	String lastName;
	public GrandfatherA(String fn,String ln) {
		this.firstName=fn;
		this.lastName=ln;
	}
	public void displayGName() {
		System.out.println(this.firstName+this.lastName);
	}
} 
class FatherAB extends GrandfatherA{
	String FfirstName;
	public FatherAB(String fn,String ln,String ffn) {
		super(fn,ln);
		this.FfirstName=ffn;
	}
	public void displayFName() {
		System.out.println(this.FfirstName+this.lastName);
	}
}
class SonAB extends FatherAB{
	String Sname;
	public SonAB(String fn,String ln,String ffn,String ssn) {
		super(fn,ln,ffn);
		this.Sname=ssn;
	}
	public void displaySName() {
		System.out.println(this.Sname+this.lastName);
	}
	


	}
