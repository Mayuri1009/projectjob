package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		WebElement ele=driver.findElement(By.xpath("//select[@id=\"Form_getForm_Country\"]"));
		
	  Select select=new Select(ele);
	  select.selectByIndex(2);
	  
	  select.selectByValue("Algeria");
	  
	  List<WebElement> ele1=select.getOptions();
	  System.out.println(ele1.size());
	  
	  select.selectByIndex(255);

	}

}
