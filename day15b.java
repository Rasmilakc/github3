package Test3;
enum Sizee{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	
	public int getSize() {
		switch (this) {
		case SMALL:
			return 3 ;
		case MEDIUM:
			return  4;
		case LARGE:
			return 5;
		case EXTRALARGE:
			return 5;
		default:
			return 0;
		
	}
	}
}

public class day15b {

	public static void main(String[] args) {
		int order = Sizee.SMALL.getSize();
		System.out.println(order);
	}

}

