package Testng;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test()
	public void testb() {
		System.out.println("b");
	}
	
	@Test(groups="Regression")
	public void testc() {
		System.out.println("b");
	}

	
	@Test(groups="sanity")
	public void testd() {
		System.out.println("b");
	}


}
