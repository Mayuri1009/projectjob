package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);
		
		 driver.manage().window().maximize();
		 
		WebElement ele= driver.findElement(By.xpath("//a[contains(@title,\"Quesnel\")]"));
		
		Thread.sleep(6000);
		
		String ele1=driver.findElement(with(By.tagName("a").toLeftOf(ele)).getText());
		System.out.println(ele1);
		
		
		

	}

}
