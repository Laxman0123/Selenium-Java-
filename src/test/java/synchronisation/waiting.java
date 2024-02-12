package synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waiting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //insted of Thread.sleep(0) you can use this imlicitywait()
		driver.manage().window().maximize();
		driver.findElement(By.className("dropbtn")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("Flipkart")).click();
//		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Facebook")).click();

	}

}
