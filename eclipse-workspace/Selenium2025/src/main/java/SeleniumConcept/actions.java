package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
		
		WebElement ele1=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		//WebElement ele=driver.findElement(By.xpath("(//div[text()='Visa Services'])[1]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(ele1).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[text()='Visa Services'])[1]")).click();
		
		
	}

}
