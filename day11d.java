package Test3;

public class day11d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cark B= cark.getinstance();
		B.getSUV();
	}
}class cark{
	private static cark SUV;
	public static cark getinstance() {
		if(SUV==null) {
			SUV=new cark();
		}
		return SUV;
	}
	public void getSUV() {
		System.out.println("CONRATE ON NEW CAR");
	}
}