package Test3;

public class day9c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//singleton auta matra object
		//Database a=new Database();
		Database db1=Database.getInstance();
		db1.getconnection();
	

	}

}
class Database{
	private static Database dbobject=null;
	Database() {
		
	}
	public static Database getInstance() {
		if(dbobject==null) {
			dbobject=new Database();
		}
		return dbobject;
	}
	public void getconnection() {
		System.out.println("you are connected to database");
	}
}
