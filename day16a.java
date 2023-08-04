package Test3;

public class day16a {

	public static void main(String[] args) {
		//Exceptional handling
//		System.out.println("hello");
//		System.out.println(5/0);
//		System.out.println("bye");
		
		
		// program 2
//		
//		System.out.println("hello");
//		try {	
//			int divideByZero = 5/0;
//			System.out.println("Rest of code in try block");
//			System.out.println("Rest of code in try block2");
//			System.out.println("Rest of code in try block3");
//			System.out.println("Rest of code in try block4");
//			
//		}
//		catch(ArithmeticException e) {
//				
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("bye");
		
		// program 3
		
//		System.out.println("Define a array with values");
//		int [] numbers = {11,22,33,44};
//		try {
//			System.out.println(numbers[0]);
//			System.out.println(numbers[5]);
//			
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
//		
//		System.out.println("Moving ahead after managing the exception");
		
		
		
		
		// program 4
//		
//		System.out.println("Define a array with values");
//		int [] numbers = {11,22,33,44};
//		
//		
//		try {
//			
//			System.out.println(numbers[0]);
//			System.out.println(numbers[5]);
//			//System.out.println(5/0);
//			
//		}
//		catch(ArithmeticException e) {
//			System.out.println("please enter a valid input");
//			System.out.println(e.getMessage());
//			
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("please enter a valid index for array");
//			System.out.println(e.getMessage());
//		}
//		catch(Exception e) {
//			System.out.println("Exception handled successfully");
//		}
//		
//		System.out.println("Moving ahead after managing the exception");
//		
		
		// Program  5
		
		System.out.println("hello");
		
		try {
			System.out.println(5/5);
		}
		catch(Exception e) {
			System.out.println("Exception managed successully");
			String msg = e.getMessage();
			System.out.println(msg);
		}
		finally {
			System.out.println("I will be executed anyhow");
		}
		
		
		
		
		
		
	}
}
	
