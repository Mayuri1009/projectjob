package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> alllinks=driver.findElements(By.tagName("img"));	
		System.out.println("Total links"+alllinks.size());
		
		for(WebElement e: alllinks)
		{
			
		}

	}

}
