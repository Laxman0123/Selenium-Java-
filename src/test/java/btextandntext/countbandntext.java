package btextandntext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countbandntext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement>ntext= driver.findElements(By.tagName("p"));
		System.out.println("count of ntext="+ntext.size());
		
		List<WebElement>btext= driver.findElements(By.tagName("b"));
		System.out.println("count of btext="+btext.size());

	}

}
