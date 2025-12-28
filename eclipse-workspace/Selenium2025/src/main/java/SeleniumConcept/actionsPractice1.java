package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsPractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		
		WebElement ele=driver.findElement(By.xpath("(//div[text()=\"SpiceClub\"])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@data-testid='test-id-Our Program']")).click();
		
		
		
		
		
	
	}

}
