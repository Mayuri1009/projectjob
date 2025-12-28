package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
    Thread.sleep(5000);
    driver.findElement(By.name("q")).sendKeys("selenium");
   List<WebElement> options= driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']/span"));
   System.out.println(options.size());
	}

}
