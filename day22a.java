package Test3;
import java.util.HashMap;
import java.util.Map;


public class day19b {

	public static void main(String[] args) {
		Map<String,String> course=new HashMap<String,String>();
		course.put("course", "javascript");
		course.put("courseTwo", "html");
		course.put("courseThree", "css");
		course.put("courseFour", "python");
		course.put("courseFive", "selenium");
		System.out.println(course); 
		
		
				for (Map.Entry<String, String> entry : course.entrySet()) {
					System.out.println(entry.getKey() + entry.getValue());
		}
		
		//program 2
				Map<String, String> students = new HashMap<String, String>();
				students.put("firstName", "rasmila");
				students.put("lastName", "khatri");
				students.put("rollNo", "1");
				students.put("age", "30");
				students.put("skills", "walking");
				
				for(String prop:students.keySet()) {
					System.out.println(prop);
				}
				
				for(String prop:students.values()) {
					System.out.println(prop);
				}
				
				
				
				
		Map<String, String> vehicle = new HashMap<String, String>();
		vehicle.put("color", "red");
		vehicle.put("type", "SUV");
		vehicle.put("company", "tata");
		System.out.println(vehicle);
		
		System.out.println(vehicle.get("color"));
		for(String key :vehicle.keySet()) {
			System.out.println(key);
			System.out.println(vehicle.get(key));
			
		} 
		//iterator
		
		for (Map.Entry<String, String> set : vehicle.entrySet()) {
			System.out.println(set.getKey() + set.getValue());
		
	
		
	
		
		}

		
		

		
		
		

		
	}
}
	

	


