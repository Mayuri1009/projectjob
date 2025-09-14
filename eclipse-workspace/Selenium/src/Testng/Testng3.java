package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng3 {
	
	WebDriver driver;
	@BeforeTest()
	public void test()
	{
	 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
	}
	
	@DataProvider()
	public Object[][] dataset()

	{
		Object arr[][]=new Object[2][2];
		
		arr[0][0]="Mayuri";
				arr[0][1]="mayuri";
						arr[1][0]="Bute";
								arr[1][1]="bute";
								
								return arr;
	}
	
	
	@Test(dataProvider="dataset")
	public void login(String username,String password) throws Exception
	{
		Thread.sleep(5000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@DataProvider()
//	public Object[][] dataset()
//	{
//		
//		Object arr[][]=new Object [2][2];
//		
//		arr[0][0]="Test Data2";
//		arr[0][1]="Test Data2";
//		
//				arr[1][0]="Test Data1";
//						arr[1][1]="Test Data1";
//		
//		return arr ;
//	}
//	
//	@Test(dataProvider="dataset")
//	public void enterData(String username,String password) throws Exception
//	{
//		Thread.sleep(5000);
//		driver.findElement(By.id("email")).clear();
//		Thread.sleep(5000);
//		driver.findElement(By.id("pass")).clear();
//		Thread.sleep(5000);
//		driver.findElement(By.id("email")).sendKeys(username);
//		Thread.sleep(5000);
//		driver.findElement(By.id("pass")).sendKeys(password);
//	}

}
