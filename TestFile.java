//L Kriel
//34317996
//Assignment 5

public class TestFile {
	public static void main(String[] args) {
		//TEST MongoDB
		testDatabase(new MongoDB("mongodb://localhost", "admin", "admin"));
		
		//TEST MYSQL
		testDatabase(new MYSQL("mysql://localhost", "admin", "admin"));
		
		//TEST SQLServer
		testDatabase(new SQLServer("sqlserver://localhost", "admin", "admin"));
	}
	
	
	public static void testDatabase(Database database) {
		try{
			database.createConnection();
			database.executeQuery("SELECT * FROM users");
			database.closeConnection();
		}
		catch (ConnectionException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}