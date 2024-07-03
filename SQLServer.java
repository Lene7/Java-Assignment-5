//L Kriel
//34317996
//Assignment 5

import java.util.Random;

public class SQLServer extends Database {
	public SQLServer(String url, String username, String password) {
		super();
		setUrl(url);
		setUsername(username);
		setPassword(password);
	}
	
	@Override
	public void createConnection() throws ConnectionException {
		double randNum = Math.random();
		if (randNum <0.7) {
			throw new ConnectionException("Connection failed for SQLServer.");
		}
		else {
			System.out.println("SQLServer connection successfully created.");
		}
	}
	
	@Override
	public void closeConnection() throws ConnectionException {
		double randNum = Math.random();
		if (randNum <0.7) {
			throw new ConnectionException("Closing connection failed for SQLServer.");
		}
		else {
			System.out.println("SQLServer connection successfully closed.");
		}
	}
}