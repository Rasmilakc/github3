package Test3;
import java.util.ArrayList;

public class day18c {

	public static void main(String[] args) {
		Person134 rasmila=new Person134("Dipesh", "khadka");
		Person134 rasmilab=new Person134("Dipesh2", "khadka");
		Person134 rasmilac=new Person134("Dipesh3", "khadka");
		Person134 rasmilad=new Person134("Dipesh4", "khadka");
		
		
		ArrayList<Person134> Teacher=new	ArrayList<>();
		Teacher.add(rasmila);
		Teacher.add(rasmilab);
		Teacher.add(rasmilac);
		Teacher.add(rasmilad);
		Teacher.get(0).displayName();
		
	
	//for loop
		
		
		for(int i=0;i<Teacher.size();i++) {
			//System.out.println(i);
			System.out.println(Teacher.get(i).FirsName);
			System.out.println(Teacher.get(i).LastName);
			Teacher.get(i).displayName();
		}
		//for while loop
		int t1=0;
		while(t1<Teacher.size()) {
			System.out.println(Teacher.get(t1).FirsName);
		System.out.println(Teacher.get(t1).LastName);
			Teacher.get(t1).displayName();
			t1++;
		}
		
		//for each one
		
		for(Person134 a:Teacher) {
			System.out.println(a.FirsName);
			System.out.println(a.LastName);
			a.displayName();
		}
		
	}
	
}

class Person134{
	String FirsName;
	String LastName;
	public Person134(String fn,String ln) {
		this.FirsName=fn;
		this.LastName=ln;
	}public void displayName() {
		System.out.println(this.FirsName+this.LastName);
	}
}