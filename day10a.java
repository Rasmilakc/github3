package Test3;

public class day10a {

	public static void main(String[] args) {
		// one parent two child
		Daughter rasmila=new Daughter("Suresh", "khatri", "rasmila");
		Son rosan= new Son("Suresh", "khatri", "rosan");
		rasmila.DisplayDname();
		rasmila.DisplayName();
	    rosan.DisplaySname();
	   rosan.DisplayName();
	}

}
class Father{
	String firstname;
	String lastname;
	public Father(String fn,String ln) {
		this.firstname=fn;
		this.lastname=ln;
		
	}
	public void DisplayName() {
		System.out.println(this.firstname+this.lastname);
		
	}
	
}
class Son extends Father{
	String Sname;

	public Son(String fn, String ln,String sn) {
		super(fn, ln);
		this.Sname=sn;
		
	}
	public void DisplaySname() {
		System.out.println(this.Sname+this.lastname);
	}
	
	
}
class Daughter extends Father{
	String Dname;

	public Daughter(String fn, String ln,String Dn) {
		super(fn, ln);
		this.Dname=Dn;
	}
	public void DisplayDname() {
		System.out.println(this.Dname+this.lastname); 
	}
	
}
