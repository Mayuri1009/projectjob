package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveto {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.meesho.com/");
         driver.manage().window().maximize();
         
         driver.findElement(By.xpath("//span[text()=\"Beauty & Health\"]")).click();
         WebElement ele=driver.findElement(By.xpath("//p[text()=\"Mom Care\"]"));
         
         Actions act=new Actions(driver);
         act.moveToElement(ele).build().perform();
         
	}

}
