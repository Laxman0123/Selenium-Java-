package radiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activeorunactive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		driver.manage().window().maximize();
		List<WebElement>radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		for(int i=0; i<radios.size();i++)
		 {
	    	 String rname = radios.get(i).getAttribute("name");
	    	 if(radios.get(i).isSelected())
	    	 {
	    		 System.out.println(rname+""+ "Active");
	    	 }
	    	 else {
	    		 System.out.println(rname+""+ "unActive");
	    	 }
	       }

	}

}
