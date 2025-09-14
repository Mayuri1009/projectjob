package project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriver driver=new ChromeDriver();
//		driver.get("https://demoqa.com/browser-windows");
//		
//driver.findElement(By.xpath("//button[text()=\"New Tab\"]")).click();
//String ele=driver.getWindowHandle();
//System.out.println(ele);
//		
//Set<String> all=driver.getWindowHandles();
//System.out.println(all);
//
//driver.switchTo().window(ele);
//System.out.println(driver.getTitle());
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();

		Alert alert=driver.switchTo().alert();
		alert.accept();
		
        System.out.println(alert.getText());
        
        
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOf(""))
	}

}
