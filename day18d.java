package Test3;
import java.util.ArrayList;

public class day18d {

	public static void main(String[] args) {
	   Person2 rasmilaa=new Person2("rasmilaa", "khatri");
		Person2 rasmilab=new Person2("rasmilab", "khatri");
		Person2 rasmilac= new Person2("rasmilac", "khatri");
		Person2 rasmilad =new Person2("rasmilad", "khatri");
		
		
	    ArrayList<Person2> Student=new ArrayList<>();
	    Student.add(rasmilaa);
	    Student.add(rasmilab);
	    Student.add(rasmilac);
	    Student.add(rasmilad);
//	    Student.get(0).Display();
//	    
//	    
//	    //for loop
//	    for(int i=0;i<Student.size();i++) {
//	    	System.out.println(Student.get(i).FirstName);
//	    	System.out.println(Student.get(i).LastName);
//	    	Student.get(i).Display();
//	    }
//	    
//	    int t1=0;
//	    while(t1<Student.size()) {
//	    	System.out.println(Student.get(t1).FirstName);
//	    	System.out.println(Student.get(t1).LastName);
//	    	Student.get(t1).Display();
//	    }
//	    
	    
	    
	    ///for each
	    for(Person2 a:Student) {
	    	System.out.println(a.FirstName);
	    	System.out.println(a.LastName);
	    	a.Display();
	    }
	    
		
	}

}
class Person2{
	String FirstName;
	String LastName;
	public Person2(String fn,String ln) {
		this.FirstName=fn;
		this.LastName=ln;
	}
	public void Display() {
		System.out.println(this.FirstName+this.LastName);
	}
}
