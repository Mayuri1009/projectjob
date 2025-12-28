package SeleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
  // driver.get("https://www.google.co.in");
   
   driver.navigate().to("https://www.google.co.in");
   
  driver.get("https://naveenautomationlabs.com/opencart/");
  
  System.out.println(driver.getTitle());
  
	driver.navigate().to("https://www.google.com/");

	 System.out.println(driver.getTitle());
   
	 driver.navigate().back();
	 
	 System.out.println(driver.getTitle());
	 
	 driver.navigate().forward();
	 
	 System.out.println(driver.getTitle());
	 
	 driver.navigate().refresh();
	 
	 
	}

}
