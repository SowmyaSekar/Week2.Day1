package week2.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("SOWMYA");
		driver.findElement(By.name("UserLastName")).sendKeys("SEKAR");
		driver.findElement(By.name("UserEmail")).sendKeys("sowmyasekar11@gmail.com");
		
		WebElement drop1=driver.findElement(By.name("UserTitle"));
		Select job=new Select(drop1);
		job.selectByValue("Sales_Manager_AP");
		
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		WebElement drop2=driver.findElement(By.name("CompanyEmployees"));
		Select employee=new Select(drop2);
		employee.selectByValue("75");
		
		driver.findElement(By.name("UserPhone")).sendKeys("967200131");
		
		WebElement drop3=driver.findElement(By.name("CompanyCountry"));
		Select country=new Select(drop3);
		country.selectByIndex(5);
		
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
		
	}

}
