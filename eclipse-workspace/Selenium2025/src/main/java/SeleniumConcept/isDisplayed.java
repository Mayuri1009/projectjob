package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(5000);
		
	boolean ele=driver.findElement(By.className("//img[@class='img-responsive']")).isDisplayed();
	
	if (ele)
	{
		System.out.println("logo is displyed");
	}
	else
	{
		System.out.println("LOGO IS NOT DISAPLYED");
	}
		
		//driver.close();

	}

}
