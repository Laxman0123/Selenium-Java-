package linkss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headerlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
        WebElement header =driver.findElement(By.id("gb"));
//		WebElement header =driver.findElement(By.id(" "));
		List<WebElement>headerlinks=header.findElements(By.tagName("a"));
		System.out.println("no.of.links"+" "+headerlinks.size());
		for(int i=0; i<headerlinks.size(); i++)
		{
			System.out.println(headerlinks.get(i).getText());
		}
		

	}

}
