package TestNGs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class prioritydependsonmethods {
	@Test(dependsOnMethods= {"slow"},alwaysRun= true)
	public void stop()
	{
		System.out.println("stop the car");
	}
	@Test(dependsOnMethods = {"start"})
	public void drive()
	{
		System.out.println("drive the car");
	}
	@Test
	public void start()
	{
		System.out.println("start the car");
	}
	@Test(dependsOnMethods= {"drive"})
	public void slow()
	{
		Assert.fail("breaks failed");
		System.out.println("slow the car");
	}


}
