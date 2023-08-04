package Test3;
import java.util.HashMap;


public class day18g {

	public static void main(String[] args) {
       HashMap<String ,Integer> students = new HashMap<>();
         students.put("rasmila", 29);
         students.put("rosan",30);
         students.put("rani", 28);
         students.put("rasmi", 22);
         students.put("rasmita", 23);
         
        //Accessing the value from HashMap()
        int a=students.get("rasmila");
         System.out.println(a);
                  //check particular key exists
        boolean b=students.containsKey("rosan");
        System.out.println(b);
        
         //total number of key value in HashMap()
        int c=students.size();
        System.out.println(c);
        
        
         //remove the value
          students.remove("rasmila");
          System.out.println(students);
          
          //update the value
          students.put("roja", 33);
          System.out.println(students);
        
        // looping through HashMap
  		
  		 System.out.println(students.values());
  		 System.out.println(students.keySet());
        
  		 
  		 
  		System.out.println(students.values());
  		for (int value:students.values()) {
  			System.out.println(value);
  			
  			System.out.println(students.keySet());
  			for (String student : students.keySet()) {
  			  System.out.println(student);
  			}

  		}
   
		
	}
}

