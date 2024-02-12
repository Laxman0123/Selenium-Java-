package checkboxes;

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
	       driver.manage().window().maximize();
	       driver.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
	       List<WebElement>checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
	       System.out.println("no of total checks"+""+checkbox.size());
	       for(int i= 0;i<checkbox.size();i++)
	       {
	    	 String rname = checkbox.get(i).getAttribute("name");
	    	 
	    	 if(checkbox.get(i).isSelected())
	    	 {
	    		 System.out.println(rname+""+ "Active");
	    	 }
	    	 else {
	    		 System.out.println(rname+""+ "unActive");
	    	 }
	       }


	}

}
