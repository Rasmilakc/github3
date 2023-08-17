package Test3;

public class day23b {

	public static void main(String[] args) {Database1 db2 = Database1.getObject();
	db2.connect();
	Database1.getObject();
}

}


class Database1 {

	private static Database1 obj;
	private Database1() {	
	}

	public static Database1 getObject(){
	
		if(obj == null) {
			obj = new Database1();
		}
		return obj;		
	}
	public void connect() {
		System.out.println("connected");
	}
	
}
		