package Test3;

import java.util.HashMap;
import java.util.Iterator; 
import java.util.Map; 
public class day22b {

	public static void main(String[] args) {
		// Hashmap  
		// Hashmap stores in the form of key-valu pair 
		   
		  HashMap<String , Integer> hashMapone = new HashMap<>(); 
		  System.out.println(hashMapone); 
		   
		  // add 
		  //            key - value 
		  hashMapone.put("one", 1); 
		  hashMapone.put("two", 2); 
		  hashMapone.put("three", 3); 
		  System.out.println(hashMapone); 
		  
		   
		  // update  
		  hashMapone.put("three",77); 
		  System.out.println(hashMapone); 
		  
		   
		  // getting the value (retrive ) 
		  int a = hashMapone.get("one"); 
		  System.out.println(a); 
		   
		  hashMapone.remove("one"); 
		  System.out.println(hashMapone); 
		  
		   
		  // Allow duplicate keys 
		  
		  hashMapone.put("three", 4); 
		  System.out.println(hashMapone); 
		  
		   
		  // how many key-values are there  
		   
		  System.out.println(hashMapone.size()); 
		   
		  HashMap<String , String> hashMapTwo = new HashMap<>(); 
		   
		  hashMapTwo.put("tx", "irving"); 
		  hashMapTwo.put("ktm", "Nepal"); 
		  hashMapTwo.put("Ny", "Newyork"); 
		  hashMapTwo.put("FL", "MIAMI");
		  
		  
		  // To check whether a key exist or not ?? 
		   
		  if(hashMapTwo.containsKey("tx")) { 
		   System.out.println(hashMapTwo.get("tx")); 
		  } 
		   
		  if(hashMapTwo.containsValue("irving")) { 
		   System.out.println("value is available"); 
		  } 
		   
		  // containskey() and containsvalue -- return boolea values  
		   
		  for(String key:hashMapTwo.keySet()) { 
		    System.out.println(key); 
		    System.out.println(hashMapTwo.get(key)); 
		  } 
		   
		  System.out.println(hashMapTwo.keySet()); 
		  System.out.println(hashMapTwo.values()); 
		   
		  for(Map.Entry<String, String>entry:hashMapTwo.entrySet()) { 
		   System.out.println(entry.getKey()+" "+entry.getValue()); 
		  } 
		   
		   
		  HashMap<String , String> hashMapThree = new HashMap<>(); 
		  hashMapThree.put("rasmila","khatri"); 
		  hashMapThree.put("rosan","khatri"); 
		  hashMapThree.put("dipesh ","khadka"); 
		  hashMapThree.put("rajesh","giri"); 
		  hashMapThree.put("rama","bista"); 
		  System.out.println(hashMapThree); 
		   
		  Iterator<Map.Entry<String, String>> abc = 
		    hashMapThree.entrySet().iterator(); 
		   
		  while(abc.hasNext()) { 
		   Map.Entry<String, String> entry = abc.next(); 
		   System.out.println(entry.getKey()); 
		   System.out.println(entry.getValue()); 
		  } 
		   
		   
		   
		   
	}

}
