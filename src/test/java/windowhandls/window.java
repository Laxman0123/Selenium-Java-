package windowhandls;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
			System.out.println("the title of mainwindow"+" "+driver.getTitle());
			WebElement tabbedwindow = driver.findElement(By.className("btn btn-info"));
			tabbedwindow.click();
			Thread.sleep(1000);
			Set<String>Windowids = driver.getWindowHandles();
			Iterator<String>iter=Windowids.iterator();
			String mainwindow=iter.next();
			String childwindow=iter.next();
			driver.switchTo().window(childwindow);
			System.out.println("the title of childwindow"+""+driver.getTitle());
			driver.close();
			Thread.sleep(1000);
			driver.switchTo().window(mainwindow);
			System.out.println("the title of mainwindow"+""+driver.getTitle());
		}

	}

}
