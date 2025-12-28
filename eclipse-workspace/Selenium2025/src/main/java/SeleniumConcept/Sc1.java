package SeleniumConcept;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class Sc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
//				driver.get("https://www.aqi.in/dashboard/canada");
//				Thread.sleep(9000);
//				
//				 driver.manage().window().maximize();
//				 
//				WebElement ele= driver.findElement(By.linkText("Barrie,Canada"));
//				
//				Thread.sleep(6000);
//				
//				driver.navigate().refresh();
//				
//				String ele1=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//				System.out.println(ele1);
	
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	WebElement header= driver.findElement(By.xpath("//h2[text()=\"New Customer\"]"));
	
	List<WebElement> paralist=driver.findElements(with(By.tagName("p")).below(header));
	
	
	for(WebElement e:paralist)
	{
		System.out.println(e.getText());
	}
	
				
				
				

			}

		


	}


