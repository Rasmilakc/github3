package Test3;

public class day12d {

	public static void main(String[] args) {
		//one program on singleton
		cark1 B=cark1.getinstance();
		B.getSUV();
		

	}

}
class cark1{
	private static cark1 SUV;
	private  cark1() {
		
	}
	public static cark1 getinstance() {
		if(SUV==null) {
			SUV=new cark1();
		}
		return SUV;
	}
	public void getSUV() {
		System.out.println("congrate on new car");
	}
}
