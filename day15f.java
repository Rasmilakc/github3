package Test3; 

public class day15f {
	
	public static void main(String[] args) {
		int pant=Sizees.SMALL.getsize();
		System.out.println(pant);
		
	}
	
}
enum Sizees{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	public int getsize() {
		switch(this) {
		case SMALL:
			return 1;
		case MEDIUM:
			return 2;
		case LARGE:
			return 3;
		case EXTRALARGE:
			return 4;
			
			default:
				return 0;
		}
	}
} 

