package Test3;
import java.util.Map;
interface course{
	public void courseOne();
	public void courseTwo();
	public void courseThree();
	public void courseFour();
	public void courseFive();
	public void courseSix();
}
  class zorba implements course{

	@Override
	public void courseOne() {
		System.out.println("zorba one");
		
	}

	@Override
	public void courseTwo() {
		System.out.println("zorba two");
		
	}

	@Override
	public void courseThree() {
		System.out.println("zorba three");
		
	}

	@Override
	public void courseFour() {
		System.out.println("zorba four");
		
		
	}

	@Override
	public void courseFive() {
		System.out.println("zorba five");
		
	}

	@Override
	public void courseSix() {
		System.out.println("zorba six");
		
	}
	
 }
 class Minskole implements course{

	@Override
	public void courseOne() {
		System.out.println("one");
		
	}

	@Override
	public void courseTwo() {
		System.out.println("two");
		
	}

	@Override
	public void courseThree() {
		System.out.println("three");
	}

	@Override
	public void courseFour() {
		System.out.println("four");
		
	}

	@Override
	public void courseFive() {
		System.out.println("five");
		
	}

	@Override
	public void courseSix() {
		System.out.println("six");
		
	}
	
	}

public class day19a {

	public static void main(String[] args) {
		course firm;
		firm=new zorba();
		firm.courseFive();
		
		firm=new Minskole();
		firm.courseThree();
		
		
		
	}

}
