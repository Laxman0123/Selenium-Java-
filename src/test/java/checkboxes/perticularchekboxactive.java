package checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class perticularchekboxactive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		  driver.get("https://www.spicejet.com/");
	       WebElement student = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
	       student.click();
	       if(student.isSelected())
	       {
	    	  System.out.println("Working success");  
	       }
	       else 
	       {
	    	  System.out.println("Working unsuccess");
	       }

	}

}
