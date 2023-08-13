ackage Test3;
import java.util.HashMap;
import java.util.Map;

public class day20c {

	public static void main(String[] args) {
		//Define a hashmap and loop over it 
		HashMap<String,String> Subject=new HashMap<String,String>();
		Subject.put("Subject", "math");
		Subject.put("SubjectTwo", "science");
		Subject.put("SubjectThree", "english");
		Subject.put("SubjectFour", "social");
		Subject.put("SubjectFive", "nepali");
		System.out.println(Subject); 
		
		//loop over it
		for(String a:Subject.keySet()) {
			System.out.println(a);
		}
		
		for(String b:Subject.values()) {
			System.out.println(b);
		}	
		
		
	}
}