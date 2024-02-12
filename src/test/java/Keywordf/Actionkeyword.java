package Keywordf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actionkeyword {
	
	WebDriver driver;
	public void launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void navigate() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	public void enterusername()
	{
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	public void enterpassword()
	{
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	public void clicklogin() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	public void logout() throws InterruptedException
	{
		driver.findElement(By.className("oxd-icon bi-caret-down-fill oxd-userdropdown-icon")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("oxd-userdropdown-link")).click();
		Thread.sleep(1000);
		
	}
	 public void close()
		
		{
			driver.close();
		}
	

}
