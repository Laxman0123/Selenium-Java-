package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class perticulardropdownname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		WebElement holiday =driver.findElement(By.id("themes"));
		List<WebElement>dropdown=holiday.findElements(By.tagName("option"));
		for(int i=0; i<dropdown.size(); i++)
		{
			System.out.println(dropdown.get(i).getText());
		}

	}

}
