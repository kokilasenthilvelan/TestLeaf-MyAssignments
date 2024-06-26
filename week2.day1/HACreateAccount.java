package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HACreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		// maximize the window 
		driver.manage().window().maximize();
		
		//Login to the leaftaps
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Clicking on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
				
		//Clicking on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering an account name
		driver.findElement(By.id("accountName")).sendKeys("tester200kokila");
				
		//Entering a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Select "ComputerSoftware" as the industry
		WebElement IndustryWE = driver.findElement(By.name("industryEnumId"));
		Select IndustryDD = new Select(IndustryWE);
		IndustryDD.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement OwnershipWE = driver.findElement(By.name("ownershipEnumId"));
		Select OwnershipDD = new Select(OwnershipWE);
		OwnershipDD.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement SourceWE = driver.findElement(By.id("dataSourceId"));
		Select SourceDD = new Select(SourceWE);
		SourceDD.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement MarketingCampaignWE = driver.findElement(By.id("marketingCampaignId"));
		Select MarketingCampaignDD = new Select(MarketingCampaignWE);
		MarketingCampaignDD.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue.
		WebElement StateProvinceWE = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select StateProvinceDD = new Select(StateProvinceWE);
		StateProvinceDD.selectByValue("TX");
		
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
