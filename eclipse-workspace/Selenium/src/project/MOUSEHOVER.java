package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEHOVER {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement ele= driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//a[text()=\"Gaming\"]")).click();
		
	
	}

}
