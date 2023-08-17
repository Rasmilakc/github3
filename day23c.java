package Test3;
enum Sizeee {
	
	SMALL , MEDIUM , LARGE , EXTRALARGE
	
}


class TestSize {
	
	Sizeee Tshirt;
	public TestSize(Sizeee tshirt) {
		this.Tshirt = tshirt;
	}
	
	public void buyTshirt() {
		switch(Tshirt){
		case SMALL:
			System.out.println("I am buying small size");
			break;
		case MEDIUM:
			System.out.println("I am buying medium size");
			break;
		case LARGE:
			System.out.println("I am buying medium size");
			break;
		case EXTRALARGE:
			System.out.println("I am buying medium size");
			break;
		default:
			System.out.println("I am not aware of size");
		
		}
			
	}
		
}



public class day23c {

	public static void main(String[] args) {
		TestSize a = new TestSize(Sizeee.SMALL);
		a.buyTshirt();
	}

}
