package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassroomFrames {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		String verify = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
		String expected = "You pressed OK!";
		
		if ( verify.equals(expected))
		{
			System.out.println("Action is performed correctly");
		} else {
			System.out.println("Action not performed correctly");
		}
		
		
		driver.close();

	}

}
