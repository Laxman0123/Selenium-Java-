package linkss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class everylinksvisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size(); i++)
		{
			 if(links.get(i).isDisplayed())
		
		{
			String lname =links.get(i).getText();
			links.get(i).click();
			String Url =driver.getCurrentUrl();
			System.out.println(lname+" "+Url);
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
	
		}
		}
		
	

	}

}
