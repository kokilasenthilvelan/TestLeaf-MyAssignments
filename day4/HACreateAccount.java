package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HACreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		//Initializing the Chrome WebDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Loading the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Maximizing the browser window.
		driver.manage().window().maximize()	;
		
		//Entering a username and password
		WebElement UsernameField = driver.findElement(By.id("username"));
		UsernameField.sendKeys("demosalesmanager");
		WebElement PasswordField = driver.findElement(By.id("password"));
		PasswordField.sendKeys("crmsfa");
		
		//Clicking "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on the "CRM/SFA" link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Clicking on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		
		//Clicking on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering an account name
		WebElement AccountnameField = driver.findElement(By.id("accountName"));
		AccountnameField.sendKeys("tester2kokila");
		
		//Entering a description as "Selenium Automation Tester."
		WebElement DescriptionField = driver.findElement(By.name("description"));
		DescriptionField.sendKeys("Selenium Automation Tester.");
		
		//Entering a Number Of Employees.
		WebElement NumberofemployeesField = driver.findElement(By.id("numberEmployees"));
		NumberofemployeesField.sendKeys("6");
		
		//Entering a Site Name as “LeafTaps”
		WebElement EntersiteField = driver.findElement(By.id("officeSiteName"));
		EntersiteField.sendKeys("LeafTaps");
		
		//Clicking the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verifying that the Account Title page is displayed correctly.
		String accounttitle = driver.getTitle();
		System.out.println("Account Title page is: "+accounttitle);
		String expected = "Account Details | opentaps CRM";
		
		if ( accounttitle.equals(expected) ) {
			System.out.println("Expected Account Title page displayed");
		} else {
			System.out.println("Unexpected Account Title page displayed");
		}
		
		//Sleep time
		Thread.sleep(2000);
		
		//Closing the browser window.
		driver.close();
		
	}

}
