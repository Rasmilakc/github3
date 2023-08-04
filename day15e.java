package Test3;


public class day15e {

	public static void main(String[] args) {
		int Order=Sizeab.SMALL.getsize();
		System.out.println(Order);

	}

}enum Sizeab{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	public int getsize() {
		switch(this) {
		case SMALL:
			return 3;
		case MEDIUM:
			return 3;
		case LARGE:
			return 3;
		case EXTRALARGE:
			return 3;
			default:
				return 0;
		}
	}
}
