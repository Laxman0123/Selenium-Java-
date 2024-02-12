package headlesbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesschrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
	    System.out.println("title of the page:"+driver.getTitle());

	}

}
