package week2.day3;

public class HAPolyLoginPage extends HAPolyBasePage{
	
	public void performCommonTasks() {
		System.out.println("This is performCommonTasks() method from class HAPolyLoginPage");
	}

	public static void main(String[] args) {
		HAPolyLoginPage login = new HAPolyLoginPage();
		login.clickElement();
		login.findElement();
		login.enterText();
		login.performCommonTasks();

	}

}
