package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAajio {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		String bagpage = driver.getTitle();
		String expected = "Bags";
		if (expected.equals(bagpage)) {
			System.out.println("Title of the page displayed correctly :"+bagpage);
		} else {
			System.out.println("Title of the page not displayed correctlyly :"+bagpage);
		}
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		String bagcount = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).getText();
		System.out.println(bagcount);
		
		System.out.println("Men's Bag Brands list are:");
		List<WebElement> BagBrandsWE = driver.findElements(By.xpath("//div[@class='brand']"));
		for ( WebElement brandall:BagBrandsWE) {
			String BagBrandAll = brandall.getText();
			System.out.println(BagBrandAll);
		}
		
		System.out.println("Men's Bag Names list are:");
		List<WebElement> BagNamesWE = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for ( WebElement nameall:BagNamesWE) {
			String BagNameAll = nameall.getText();
			
			System.out.println(BagNameAll);
		}
			
			
		Thread.sleep(2000);
		driver.close();

	}

}
