//L Kriel
//34317996
//Assignment 5

import java.util.Random;

public class MongoDB extends Database {
	public MongoDB(String url, String username, String password) {
		super();
		setUrl(url);
		setUsername(username);
		setPassword(password);
	}
	
	@Override
	public void createConnection() throws ConnectionException {
		double randNum = Math.random();
		if (randNum <0.5) {
			throw new ConnectionException("Connection failed for MongoDB.");
		}
		else {
			System.out.println("MongoDB connection successfully created.");
		}
	}
	
	@Override
	public void closeConnection() throws ConnectionException {
		double randNum = Math.random();
		if (randNum <0.5) {
			throw new ConnectionException("Closing connection failed for MongoDB.");
		}
		else {
			System.out.println("MongoDB connection successfully closed.");
		}
	}
}