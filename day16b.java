package Test3;

public class day16b {

	public static void main(String[] args) {
//		System.out.println("hello");
//		System.out.println(5/0);
//		System.out.println("bye");
//
//	
		
		//program 2
//		System.out.println("hello");
//		try {
//		int dividedByZero=5/0;
//		System.out.println("rest is for the tye block");
//		}
//		
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("bye");
		
		//program 3
//		System.out.println("Define array by index");
//		int[]number= { 11,12,13,14};
//		try {
//		System.out.println(number[0]);
//		System.out.println(number[5]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//		}
//		System.out.println("moving ahead after exception");
		
		//program 4
//		System.out.println("Define array by index");
//		int[]number= { 11,12,13,14};
//	     try {
//		System.out.println(number[0]);
//		System.out.println(number[5]);
//		System.out.println(5/0);
//		}
//	     catch(ArrayIndexOutOfBoundsException e) {
//	    	 System.out.println("insert the correct array index");
//	    	 System.out.println(e.getMessage());
//	     } catch(ArithmeticException e) {
//	    	 System.out.println("insert the correct input");
//	     }
//	     catch(Exception e) {
//	    	 System.out.println("moving ahead after exception");
//	     }
//	     System.out.println("exception handled successfully");
//		
//		
		//program 5
		System.out.println("hello");
		try {
			System.out.println(5/5);
			
		}
		catch(Exception e) {
			System.out.println("exception handled successfully");
			String msg=e.getMessage();
		System.out.println(msg);
		}
		finally{
			System.out.println("it should be exceuted anyhow");
		}
		
	
	
	
}	
	
}
	