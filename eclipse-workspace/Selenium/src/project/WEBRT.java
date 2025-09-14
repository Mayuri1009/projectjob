package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WEBRT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		WebElement ele=driver.findElement(By.xpath("//button[@id=\"dblClkBtn\"]"));
//		
//		act.doubleClick(ele).build().perform();
//		
		driver.findElement(By.xpath("//input[@class=\"Automation\"]")).click();
		
		WebElement src=driver.findElement(By.xpath("//div[@id=\"targetDiv\"]"));
	
        WebElement dest=driver.findElement(By.xpath("//img[@draggable=\"true\"]"));
        Thread.sleep(5000);
        
        Actions act=new Actions(driver);
        act.dragAndDrop(src,dest).build().perform();
        
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(null))
        
        
	}

}
