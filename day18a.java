package Test3;
import java.util.ArrayList;

public class day18a {

	public static void main(String[] args) {
		ArrayList<String >names=new ArrayList<>();
		// add()
		boolean a = names .add("rasmila");
		System.out.println(a);
		names.add("ram");
		names.add("shyam");
		names.add("sita");
		System.out.println(names);
		
		//add(position,element)
		names.add(2, "rojina");
		System.out.println(names);
		
		//remove
	    //     0     1     2       3     4
		//[rasmila, ram, rojina, shyam, sita]
		names.remove(1);
		System.out.println(names);
		
		
		//clear()
		names.clear();
		System.out.println(names);
		names.add("sona");
		names.add("roja");
		names.add("saru");
		names.add("roni");
		names.add("suja");
		System.out.println(names);
		
		
		//set()
		names.set(2, "anoj");
		System.out.println(names);
		
		
		//contains()
		boolean a1=names.contains("suja");
		System.out.println(names);
		
		//[sona, roja, anoj, roni, suja]
		//get()
		String eleAtIndex2=names.get(2);
		System.out.println(eleAtIndex2);
		
		
		//indexOf()
		int nums=names.indexOf("suja");
		System.out.println(nums);
		
		int numsB = names.indexOf("roni");
		System.out.println(numsB);
	
		
		ArrayList<String> fruits  = new ArrayList<>();
		fruits.add("pomegranate");
		fruits.add("peach");
		fruits.add("mango");
		fruits.add("cherry");
		System.out.println(fruits);
		
		String userInput =" cherry";
		if(fruits.contains(userInput)) {
			System.out.println("Element available");
		}
		else {
			System.out.println("Element not available");
		}
		
		// indexOf()
		
		if(fruits.indexOf("apple") >= 0) {
			System.out.println("Element available");
		}
		else {
			System.out.println("Element not available");
		}
		
		
		 ArrayList<String> cities = new ArrayList<>();
		 cities.add("irving");
		 cities.add("tokyo");
		 cities.add("kathmandu");
		 cities.add("plano");
		 cities.add("austin");
		 
		 System.out.println(cities.size());
		 System.out.println(cities);
		 
		 // [irving, tokyo, kathmandu, plano, austin]
		 
		 System.out.println(cities.indexOf("plano"));
		 System.out.println(cities.lastIndexOf("plano"));
		 
	
		 
		 
		
		
	
	}

}
