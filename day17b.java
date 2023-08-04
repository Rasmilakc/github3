package Test3;
import java.util.ArrayList;

public class day17b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person13 rasmila = new Person13("rasmila", "Khatri");
		Person13 rasmila1 = new Person13("rasmila1", "Khatri");
		Person13 rasmila3 = new Person13("rasmila3", "Khatri");
		Person13 rasmila4 = new Person13("rasmila4 ", "Khatri");
		Person13 rasmila5 = new Person13("rasmila5", "Khatri");

		ArrayList<Person13> students = new ArrayList<>();
		students.add(rasmila );
		students.add(rasmila1);
		students.add(rasmila3 );
		students.add(rasmila4);
		students.add(rasmila5);

		students.get(0).display();

		// for loop

		for (int i = 0; i < students.size(); i++) {
			// System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();

		}

		// while loop
		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).display();
			t1++;
		}

		// for Each
		
		for(Person13 a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.display();
		}

	}

}

class Person13 {
	String firstName;
	String lastName;

	public Person13(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void display() {
		System.out.println(this.firstName + this.lastName);
	}


		
	}
