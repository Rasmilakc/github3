package Test3;

public class day23a {

	public static void main(String[] args) {
         Dog1 d1 = new Dog1();
		
		System.out.println(d1 instanceof Dog1);
		System.out.println(d1 instanceof Animal1);
		
		Invoice inv = new Invoice("456","rasmila","khatri","4692354451","Mckinney");
		System.out.println(inv instanceof Invoice);
	}

}

class Animal1 {
	
}

class Dog1 extends Animal1 {
	
	
	
}
class Invoice {
	
	String billNO ;
	String firstName;
	String lastName;
	String phoneNo ;
	String address;
	
	
	public Invoice(String bn , String fn ,String ln ,String phoneNo,String adress) {
		this.billNO = "456";
		this.firstName = "rasmila";
		this.lastName = "khatri";
		this.phoneNo = "469";
		this.address = "234";
	}
	
	
	
	
	


	}


