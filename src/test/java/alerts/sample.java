package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
       driver.manage().window().maximize();
       driver.findElement(By.id("simpleAlert")).click();
       Alert alert=driver.switchTo().alert();
       String alertText=alert.getText();
       System.out.println("Alert Text is: "+alertText);
       alert.accept();
       Thread.sleep(5000);


	}

}
