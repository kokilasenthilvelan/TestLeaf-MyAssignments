package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HACreateLead {

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
				
				//Clicking on the "Leads" tab.
				driver.findElement(By.linkText("Leads")).click();
				
				//Clicking on the "Create Lead" button.
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Entering a FirstName
				WebElement FirstnameField = driver.findElement(By.id("createLeadForm_firstName"));
				FirstnameField.sendKeys("kokila");
				
				//Entering a LastName.
				WebElement LastnameField = driver.findElement(By.id("createLeadForm_lastName"));
				LastnameField.sendKeys("senthil");
				
				//Entering a CompanyName.
				WebElement CompanynameField = driver.findElement(By.id("createLeadForm_companyName"));
				CompanynameField.sendKeys("xxyyzz");
				
				//Entering a Title .
				WebElement TitleField = driver.findElement(By.id("createLeadForm_generalProfTitle"));
				TitleField.sendKeys("selenium java");
				
				//Clicking the "Create Lead" button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Verifying that the lead Title is displayed correctly or not.

				String leadtitle = driver.getTitle();
				System.out.println("Lead Title page is "+leadtitle);
				String expected = "View Lead | opentaps CRM";
				
				if ( leadtitle.equals(expected) ) {
					System.out.println("Expected Lead Title page displayed");
				} else {
					System.out.println("Unexpected Lead Title page displayed");
				}
				
				//Sleep time
				Thread.sleep(2000);
				
				//Closing the browser window.
				driver.close();
				

	}

}
