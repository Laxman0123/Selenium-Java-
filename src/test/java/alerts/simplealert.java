package alerts;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simplealert {
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
	public void simple() throws InterruptedException
//	{
//		  driver.findElement(By.id("simpleAlert")).click();
//		  Alert alert=driver.switchTo().alert();
//		  String alertText=alert.getText();
//		  System.out.println("Alert Text is: "+alertText);
//		  alert.accept();
//		  driver.close();
//	}
	{
	   
	   
	    driver.findElement(By.id("simpleAlert")).click();
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(text);
		Thread.sleep(1000);
	
	}

//	@AfterTest
//	public void close()
//	{
//		driver.close();
//	}
//	
	

}
