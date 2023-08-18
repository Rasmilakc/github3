package Test3;

public class day24a {

	public static void main(String[] args) {
		
		System.out.println("hello");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("caught");
			
		}
		System.out.println("bye");
		}

	}
