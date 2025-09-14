package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
		WebElement ele1=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		
		
		
		Actions act=new Actions(driver);
//		act.contextClick(ele).build().perform();
//		
//		Thread.sleep(2000);
//		
		act.doubleClick(ele1).build().perform();
		

	}

}
