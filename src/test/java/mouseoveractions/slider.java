package mouseoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class slider {
	WebDriver driver;	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	}
	@Test
	public void slide() throws InterruptedException
	{
		Actions ac = new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.id("slider"));
		int loc = slider.getLocation().x;
		ac.dragAndDropBy(slider, loc, 50).perform();
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
