package text;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countboldandnormaltext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/newtours/");
	    List<WebElement>ntext= driver.findElements(By.tagName("P"));
	    System.out.println("no of total normal text "+""+ntext.size());
	    List<WebElement>btext= driver.findElements(By.tagName("B"));
	    System.out.println("no of total bold text "+""+btext.size());
	      

	}

}
