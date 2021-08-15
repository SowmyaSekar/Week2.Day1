package week2.day1.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByLinkText("Create New Account").click();
		driver.findElement(By.name("firstname")).sendKeys("Sowmya");
		driver.findElement(By.name("lastname")).sendKeys("Sekar");
		driver.findElement(By.name("reg_email__")).sendKeys("sowmyasekar01@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Facebook@11");
		
		WebElement drop1=driver.findElement(By.id("day"));
		Select date= new Select (drop1);
		date.selectByIndex(11);
		
		WebElement drop2=driver.findElement(By.id("month"));
		Select month= new Select (drop2);
		month.selectByValue("2");
		
		WebElement drop3=driver.findElement(By.id("year"));
		Select year= new Select (drop3);
		year.selectByValue("1992");
		
		driver.findElement(By.name("sex")).click();
		
	}

}
