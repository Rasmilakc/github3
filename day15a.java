package Test3;
enum Size{
	SMALL,MEDIUM,LARGE,EXTRALARGE
} 
class Order{
	Size pizzaSize;
	public Order(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderConfirmation() {
           switch (pizzaSize) {
		
		  case SMALL:
			System.out.println("you ordered a small size pizza");
			break;
		  case MEDIUM:
			System.out.println("you orderred a medium size pizza");
			break;
		  case LARGE:
			System.out.println("you ordered a  large pizza");
			break;
		  case EXTRALARGE:
			System.out.println("you ordered a  extra large pizza");
			break;
			
		}

	}

		
	}


public class day15a {

	public static void main(String[] args) {
		//ENUM
		
		Order order =new Order(Size.SMALL);
		order.orderConfirmation();

	}

}
