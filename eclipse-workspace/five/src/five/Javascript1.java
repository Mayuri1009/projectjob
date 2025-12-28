package five;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		//locate web element 
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    jse.executeScript("document.getElementById('email'). value='bute.mayuri@gmail.com'");
	    jse.executeScript("document.getElementById('pass'). value='2states'");
	    		    				
	    
		
	}

}
