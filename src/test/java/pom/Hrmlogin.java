package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hrmlogin {
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement user;
	
	//creating POM for password
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	
	
	//creating POM for login button
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement ok;
	
   public Hrmlogin(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void login(String u,String p)
	{
		user.clear();
		user.sendKeys(u);
		password.clear();
		password.sendKeys(p);
		ok.click();

} 

}
