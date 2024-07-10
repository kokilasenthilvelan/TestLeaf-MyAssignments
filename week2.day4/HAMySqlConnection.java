package week2.day4;

public class HAMySqlConnection implements HADatabaseConnection {
	
    public void connect() {
	System.out.println("This method is for connect");
    }
	
	public void disconnect() {
		System.out.println("This method is for disconnect");
	}
	
	public void executeUpdate() {
		System.out.println("This method is for executeUpdate");
	}

	public void executeQuery() {
		System.out.println("This method is for executeQuery");
	}

}
