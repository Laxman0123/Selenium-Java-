package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class confirmstionalert {
	
	WebDriver driver;
	@BeforeTest
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
       driver.manage().window().maximize();
       Thread.sleep(1000);
	}
	@Test
	public void confirmation() throws InterruptedException
	{
		driver.findElement(By.id("confirmationAlert")).click();
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(text);
		Thread.sleep(1000);
	}
	

}
