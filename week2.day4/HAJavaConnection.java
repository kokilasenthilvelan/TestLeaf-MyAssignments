package week2.day4;

public class HAJavaConnection extends HAMySqlConnection {
	
	public void mainpgm() {
		System.out.println("This method is from main");
	}

	public static void main(String[] args) {
		HAJavaConnection jc = new HAJavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();
		jc.mainpgm();

	}

}
