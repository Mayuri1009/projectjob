package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ga {
	
	static WebDriver driver;

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.google.com/");
	    
	   driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys("selenium");
	    
	   
	    @SuppressWarnings("deprecation")
		String ele=driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).getAttribute("value");

	    
	    System.out.println(ele);
	    System.out.println("Hi");
		
//		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		
//		
//		
//		driver.findElement(By.id("input-email")).sendKeys("victor@gmail.com");
//		
//		@SuppressWarnings("deprecation")
//		String emailid = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(emailid);
		
//	
	}

}
