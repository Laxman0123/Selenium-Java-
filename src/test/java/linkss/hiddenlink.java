package linkss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int displayedlink = 0;
		for(int i=0; i<links.size(); i++)
		{
			if(links.get(i).isDisplayed())
			{
				displayedlink++;
			}
		}
		System.out.println("no of total links="+links.size());
		System.out.println("no of visible links="+displayedlink);
		System.out.println("no of hidden links="+(links.size()-displayedlink));

	}

}
