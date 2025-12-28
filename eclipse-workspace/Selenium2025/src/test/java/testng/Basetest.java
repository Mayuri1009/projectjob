package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Basetest {
	
	WebDriver driver;
	
	@Parameters({"url"})
	@BeforeTest()
	public void before(String url)
	{
		driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
	}
	
	
	@AfterTest()
	public void teardown()
	{
	driver.close();
	}


}
