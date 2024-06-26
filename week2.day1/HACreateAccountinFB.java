package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HACreateAccountinFB {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://en-gb.facebook.com/");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Click on the Create new account button.
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Verifying that the Signup page is displayed correctly.
		String accounttitle = driver.getTitle();
		System.out.println("Create Account page is: "+accounttitle);
		String expected = "Facebook – log in or sign up";
						
		if ( accounttitle.equals(expected) ) {
		System.out.println("Expected Account Title page displayed");
		} else {
		System.out.println("Unexpected Account Title page displayed");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mithran");
		
		//Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("raj");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7338954364");
		
		//Enter the New password.
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mithran@2703");
		
		//Handle all three dropdowns in Date of birth
		WebElement DateWE = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select DateDD = new Select(DateWE);
		DateDD.selectByVisibleText("26");
		
		WebElement MonthWE= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select MonthDD = new Select(MonthWE);
		MonthDD.selectByIndex(2);
		
		WebElement YearWE= driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select YearDD = new Select(YearWE);
		YearDD.selectByVisibleText("1994");
		
		//Select the radio button in Gender.
		WebElement Gender = driver.findElement(By.xpath("//label[@class='_58mt']"));
		Gender.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//Closing the browser
		driver.close();
		

	}

}
