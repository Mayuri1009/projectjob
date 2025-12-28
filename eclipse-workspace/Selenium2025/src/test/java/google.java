import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class google {
	
	WebDriver driver;
	
	@BeforeTest()
	public void before()
	{
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test()
	public void test()
	{
		
		System.out.println(driver.getTitle());
		//driver.getTitle();
	    driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).click();
	    
	}
	
	
	@AfterTest()
	public void after()
	{
		driver.close();
	}

}
