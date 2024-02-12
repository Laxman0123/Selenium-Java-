package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class steps {
	@Test
	public void operation() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 Thread.sleep(1000);
		 driver.manage().window().maximize();
		 Hrmlogin d = new Hrmlogin(driver);
		 d.login("Admin","admin123");
		 Thread.sleep(1000);
		 Hrmlogout p = new Hrmlogout(driver);
		 p.logout();
		 
				
		//To call login POM class File
				


	}

}
