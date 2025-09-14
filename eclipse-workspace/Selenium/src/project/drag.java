package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"targetDiv\"]"));
		WebElement drag=driver.findElement(By.xpath("//img[@id=\"myImage\"]"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
	

	}

}
