//L Kriel
//34317996
//Assignment 5

public abstract class Database implements DatabaseIO {
	private String url;
	private String username;
	private String password;
	
	//mutators
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//accessors
	public String getUrl() {
		return url;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	//toString
	@Override
	public String toString() {
		return "Database [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	
	@Override
	public abstract void createConnection() throws ConnectionException;
	
	
	@Override
	public void executeQuery(String query) throws ExecutionException {
		if (!"admin".equals(username) || !"admin".equals(password)) {
			throw new ExecutionException("Invalid username or password.");
		}
		else {
			System.out.println("Executing query: " + query);
		}
	}
	
	@Override
	public abstract void closeConnection() throws ConnectionException;
}