package Test3;

public class day12e {

	public static void main(String[] args) {
		//6) one program for overloading
		
		addA(2,4);
		addA(2,4,5);
		addA(2,3,4);

	} public static void addA(int a,int b) {
		System.out.println(a+b);
	}public static void addA(int a,int b,int c) {
		System.out.println(a+b+c);
	}public static void addA(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}

}
