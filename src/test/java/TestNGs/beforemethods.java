package TestNGs;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforemethods {
	

	@BeforeMethod
	void preparation()
	{
		System.out.println("preparing for exams");
	}
	@Test
	void writingtheexma()
	{
		System.out.println("writing all subject exmas");
	}
	@Test(priority=1)
	void correction()
	{
		System.out.println("verifying the papers");
	}
	@Test(priority=2)
	void rsults()
	{
		System.out.println("results declered");
	}
	@AfterMethod
	void holiday()
	
	{
		System.out.println("vacation");
	}


}
