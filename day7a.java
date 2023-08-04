package test2;

public class day7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarK audi = new CarK(1);
		System.out.println(audi.wheel);
		audi.brake();
	}

}

abstract class VehicleK {

	int wheel;

	public VehicleK(int w) {
		this.wheel = w;
	}

	abstract public void brake();

}

class CarK extends VehicleK {

	public CarK(int w) {
		super(w);
		
	}

	public void brake() {
		System.out.println("I am brake for cark");
	}
	
	


	}


