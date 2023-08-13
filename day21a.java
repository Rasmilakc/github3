package Test3;
import java.util.List;
import java.util.stream.Collectors;

public class day21a {

	public static void main(String[] args) {
		List<PersonS> peoples = List.of(

				new PersonS("Rasmila khatri", 30, "Irving"), 
				new PersonS("muna khatri", 29, "chabhil"),
				new PersonS("punam rai", 35, "plano"), 
				new PersonS("rosan khatri", 33, "janakpur"),
				new PersonS("mayuri sorte", 34, "mumbai")

		);

		List<PersonS> above30Age = peoples.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

		System.out.println(above30Age);

		for (int i = 0; i < above30Age.size(); i++) {
			System.out.println(above30Age.get(i).getAge());
			System.out.println(above30Age.get(i).getCity());
			System.out.println(above30Age.get(i).getName());
		}

		
	// program 2
		
	
   	    // Map and collect
    	// ["mayuri sorte","punam rai","Rasmila khatri","rosan khatri", "muna khatri"]
		List<String> names = peoples.stream().map(person -> person.getName()).collect(Collectors.toList());
		
		for(String nm:names) {
			System.out.println(nm);
		}
		
		// Program 3
		// Person and city
		//"mayuri rao:pune"
		List<String> hhh = 
				peoples.stream()
				.map(person -> person.getName()
						.concat(" :")
						.concat(person.getCity()))
				.collect(Collectors.toList());
		
	
		for(String nc:hhh) {
			System.out.println(nc);
		}
		

	}

}

class PersonS {

	private String name;
	private int age;
	private String city;

	public PersonS(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}


		

	}


