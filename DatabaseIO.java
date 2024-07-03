//L Kriel
//34317996
//Assignment 5

public interface DatabaseIO {
	void createConnection() throws ConnectionException;
	void executeQuery(String query) throws ExecutionException;
	void closeConnection() throws ConnectionException;
}