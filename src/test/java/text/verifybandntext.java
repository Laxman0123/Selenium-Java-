package text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifybandntext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/newtours/");
	    WebElement text =  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[1]/td/font/b"));
	    String expected = "b";
	    String actual = text.getTagName();
	    if(expected.equals(actual))
	    	
	       {
	    	   System.out.println("BoldText");
	       }

	}

}
