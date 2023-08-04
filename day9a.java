package Test3;

public class day9a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU i7 = new CPU();
		System.out.println(i7.price);
		int priceD = i7.displayPrice();
		System.out.println(priceD);
		
		CPU.Processor pro = i7.new Processor();
		CPU.Processor pro2 = i7.new Processor();
		
		System.out.println(pro.manufacturer);
		System.out.println(pro.speed());
		

	}

}
class CPU  {
	
	int price = 100;
	
	
	class Processor {		
		String manufacturer = "intel";
		
		public String speed() {
			return "fast";
		}
			
	}
	public int displayPrice() {
		return  this.price;
	}
	

		
	
	
	



	}


