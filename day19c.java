package Test3;
import java.util.Arrays;
import java.util.List;


public class day19c {

	public static void main(String[] args) {
		
		Employee[] employees= {
				new Employee(2, "rasmila khatri", 5000), new Employee(1, "ronitroy", 10000),
				new Employee(2, "dipesh khadka", 1000)
		} ;
		

//		for(int i = 0 ; i < employees.length;i++) {
//			employees[i].displayFullName();
//		}
		
		List<Employee> emplist = Arrays.asList(employees);

		// forEach()

		emplist.stream().forEach(emp -> emp.incrementSalary(20));

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].salary);
		}

		
	}

} 
class Employee{
	int id;
	String fullName;
	int salary;
	public Employee(int id,String fn,int sy) {
		this.id=id;
		this.fullName = fn;
		this.salary = sy;
		
	}
	public void displayFullName() {
		System.out.println(this.fullName);
	}

	public void incrementSalary(int x) {
		this.salary = this.salary + x;
		// this.salary += x;
}
}