package btextandntext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class perticularbandntext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
   	   driver.get("https://demo.guru99.com/test/newtours/");
   	   WebElement text = driver.findElement(By.xpath("//b[text()='sign-in here'"));
   	   String expectedtagname="b";
   	   String actualtagname=text.getTagName();
   	   if(expectedtagname.equals(actualtagname))
   	   {
   		   System.out.println("bold text");
   	   }
   	   else
   	   {
   		   System.out.println("normal text");
   	   }
   	   

	}

}
