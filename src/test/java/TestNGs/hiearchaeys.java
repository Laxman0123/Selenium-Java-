package TestNGs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hiearchaeys {
	
	@BeforeTest
	void turnonmatchstick()
	{
		System.out.println("ignited 4 burners with one matchstick");
	}
	@Test
	void cofee()
	{
		System.out.println("hot");
	}
	@Test
	void samber()
	{
		System.out.println("for energy levels");
	}
	@Test
	void idly()
	{
		System.out.println("smooth");
	}
	@Test
	void rice()
	{
		System.out.println("delicious");
	}
	@AfterTest
	void turnoffmatchstick()
	{
		System.out.println("turn of matchstick after 4 stove ignited");
	}


}
