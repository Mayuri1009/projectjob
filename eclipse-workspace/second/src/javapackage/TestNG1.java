package javapackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void a() {
		System.out.println("a");
	}
	
	@BeforeTest
	public void b() {
		System.out.println("b");
	}
	
	@BeforeSuite
	public void c() {
		System.out.println("c");
	}
	
	@BeforeMethod
	public void d() {
		System.out.println("d");
	}
	
	@BeforeClass
	public void e() {
		System.out.println("e");
	}
	
	
	
	
	
}


