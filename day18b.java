package Test3;
import java.util.ArrayList;

public class day18b {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//collection
		
		ArrayList<String>language=new ArrayList<>();
		language.add("java");
		language.add("python");
		language.add("javascript");
		language.add("selenium");
		System.out.println(language);
		
		
		//Retrive
		String a=language.get(0);
		String b=language.get(1);
		String c=language.get(2);
		String d=language.get(3);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		//for loop
		
		for(int i=0;i<language.size();i++) {
			//System.out.println(i);
			System.out.println(language.get(i));
		}
		
	//	update the value of arraylist
		ArrayList<String>animals=new ArrayList<>();
		animals.add("cow");
		animals.add("dog");
		animals.add("horse");
		animals.add("tiger");
		animals.add("deer");
		System.out.println(animals);
		
		animals.set(2, "leopard");
		System.out.println(animals);
		 
		//delete
		animals.remove(2);
		System.out.println(animals);
		
		

	}

}
