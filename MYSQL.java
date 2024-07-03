//L Kriel
//34317996
//Assignment 5

import java.util.Random;

public class MYSQL extends Database {
	public MYSQL(String url, String username, String password) {
		super();
		setUrl(url);
		setUsername(username);
		setPassword(password);
	}
	
	@Override
	public void createConnection() throws ConnectionException {
		double randNum = Math.random();
		if (randNum <0.2) {
			throw new ConnectionException("Connection failed for MYSQL.");
		}
		else {
			System.out.println("MYSQL connection successfully created.");
		}
	}
	
	@Override
	public void closeConnection() throws ConnectionException {
		double randNum = Math.random();
		if (randNum <0.2) {
			throw new ConnectionException("Closing connection failed for MYSQL.");
		}
		else {
			System.out.println("MYSQL connection successfully closed.");
		}
	}
}