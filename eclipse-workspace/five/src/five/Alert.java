package five;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/alerts");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
	    
	    
	    //verify alert text
	    System.out.println(driver.switchTo().alert().getText());
	    String expectedresult = "Do you confirm action?";
	   // Assert.assertEquals(driver.switchTo().alert().getText(),expectedresult);
	    
	  //accept the alert
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    System.out.println("accept worked");
	    
	    //dismiss alert
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
	    System.out.println("dismiss");
	    
	    //swich to parent window
	    driver.switchTo().defaultContent();
	    
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='promtButton']")).click();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.alertIsPresent())	;	
	    driver.switchTo().alert().sendKeys("Hello");
	    System.out.println("hello");
	    
	    driver.switchTo().alert().accept();
	    Thread.sleep(3000);
	 
	    
	    
	    
	   
	    
	}

}
