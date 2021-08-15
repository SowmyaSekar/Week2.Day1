package week2.day1.classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Step 2: Launch the chromebrowser
				ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
				driver.get("http://leaftaps.com/opentaps/control/main");
		// Step 4: Maximise the window
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
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sowmya");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				countryCode.clear();
				countryCode.sendKeys("100");
				driver.findElementByClassName("smallSubmit").click();
				
	}

}
