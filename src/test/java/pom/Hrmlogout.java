package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrmlogout {
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")
	WebElement drop;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")
	WebElement logout;
	
	public Hrmlogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout() throws InterruptedException
	{
		drop.click();
		Thread.sleep(1000);
		logout.click();
		Thread.sleep(1000);
	}

}
