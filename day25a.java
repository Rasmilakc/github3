package Test3;

import java.io.FileWriter;
import java.io.IOException;

public class day25a {

	public static void main(String[] args) {
		String fileName="example.txt";
		try {
			FileWriter writer=new FileWriter(fileName);
			
			//write into the file
			writer.write("Hello");
			writer.write("\n");
			writer.write("i am learning javascript");
			writer.close();
			System.out.println("data successfully written and file is closed");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}