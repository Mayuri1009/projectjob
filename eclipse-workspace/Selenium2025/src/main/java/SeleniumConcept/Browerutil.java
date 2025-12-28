package SeleniumConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browerutil {
    
	WebDriver driver;
	  public WebDriver launchBrowser(String browserName)
       {
    	   System.out.println("browser name:"+browserName);
    	   driver=new ChromeDriver();
    	   return driver;
       }
	  
	  public WebDriver launchUrl(String url)
	  {
		   driver.get(url);
		   return driver;
	  }
	  
//	  public void launchurl(String url)
//	  {
//		  if(url==null)
//		  {
//			  throw new BrowserException("url is null");
//		  }
//		  if(url.indexOf("https")==0)
//		  {
//			  driver.get(url);
//		  }
//		  else
//		  {
//			  throw new BrowserException("https is missing in url");
//		  }
//	  }
//	  
	  public String getPageURL()
	  {
		 return driver.getCurrentUrl();
		  
	  }
	  public String getTitle()
	  {
		 return driver.getTitle();
		  
	  }
	  public void closebrowser()
	  {
		  driver.close();
	  }
	  
	  
	}


