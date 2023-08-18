package Test3;

import java.io.FileWriter;
import java.io.IOException;

public class day24b {

	public static void main(String[] args) {
		try {
			FileWriter write = new FileWriter("MyFile.txt",true);
			System.out.println(10/0);
			write.write("hello world");
			write.write("\n");
			write.write("hello chinmay");
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}


	
	

	}

