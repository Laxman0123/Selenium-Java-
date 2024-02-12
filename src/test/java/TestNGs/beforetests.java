package TestNGs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class beforetests {
	
	@BeforeTest
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
	@AfterTest
	void holiday()
	
	{
		System.out.println("vacation");
	}

}
