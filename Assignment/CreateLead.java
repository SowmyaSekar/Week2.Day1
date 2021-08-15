package week2.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);

//Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//Step 6: Locate the password and type "crmsfa"
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
//Step 7: Locate the Login button and click it
		driver.findElementByClassName("decorativeSubmit").click();
//Step 9: Click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		String compareTitle="My Home | opentaps CRM";
		String homePage = driver.getTitle();
		if (compareTitle.equals(homePage))
		{
			System.out.println("You are in Home Page");
		}
		else
		{
			System.out.println("You are not in hoome page");
		}
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmya");
		//driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("11-02-1992");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("TEST");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("LastNameLocal");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/11/92");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title01");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("108990.324");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("!#1323");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$$$");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Running Automation using my script");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("SUPERB My code runs!!!");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("13214");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9677200134");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44444#");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("TEST#");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sowmyasekar11@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("TestLEaf");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SOWMYA");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("ATTENTIONNAME");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Plot No:5, SF1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kalyani Nagar Madhura Avenue");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TamilNadu");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600128");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("123");

		WebElement drop1= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select (drop1);
		drop.selectByIndex(1);
		
		WebElement drop2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown2=new Select(drop2);
		dropDown2.selectByValue("CATRQ_AUTOMOBILE");
		
		WebElement drop3=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown3=new Select(drop3);
		dropDown3.selectByVisibleText("Finance");
		
		WebElement drop4=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown4=new Select(drop4);
		dropDown4.selectByIndex(3);
		
		String firstname=driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("My First Name is:" + firstname );
		dropDown3.getOptions().size();
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("100");
		
		driver.findElementByClassName("smallSubmit").click();
		String title1=driver.getTitle();
		System.out.println("Current Web Page is:"+title1);
	}

}
