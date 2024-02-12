package mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class movetoelement {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void move() throws InterruptedException
	{
		Actions ac = new Actions(driver);
//		WebElement link =driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[10]/a"));
		WebElement Gmail =driver.findElement(By.linkText("Gmail")); 
//		ac.moveToElement(link).build().perform();
		ac.moveToElement(Gmail).build().perform();
		Thread.sleep(2000);
		
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
