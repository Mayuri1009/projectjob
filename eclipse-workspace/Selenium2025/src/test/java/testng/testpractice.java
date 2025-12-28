package testng;

import org.testng.annotations.Test;

public class testpractice {

	@Test(priority=-1)
	public void a()
	{
		System.out.println("a");
	}
	
	
	
	@Test
	public void a1()
	{
		System.out.println("a1");
	}
	
	
	@Test(priority=1)
	public void A()
	{
		System.out.println("A");
	}
}
