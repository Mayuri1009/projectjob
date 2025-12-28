package five;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	public  void main(String[] args) throws Exception  {
		//set path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//get url
		driver.get("https://www.facebook.com/");
			
	//mazimize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	//nevigate	
	    driver.navigate().to("https://www.google.com/");
	    Thread.sleep(3000);
	  
	    //refresh
	    driver.navigate().refresh();
	    
	    //nevigate back
	    Thread.sleep(3000);
	    driver.navigate().back();
	    
	    //nevigate forward
	    driver.navigate().forward();
	    
	    //current ur
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	    
	    //current title
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    
	    //current browser
	    driver.close();
	    
	    //quit means closing all tabs
	    driver.quit();
	    
	}

}
