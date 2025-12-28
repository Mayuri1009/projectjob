package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  WebDriver driver=new ChromeDriver();
		  driver.get("https://practice.expandtesting.com/dropdown");
		  
		WebElement ele=  driver.findElement(By.xpath("//select[@id=\"country\"]"));
		  
		//System.out.println(ele.getSize());
		
		Select select=new Select(ele);
		
		List<WebElement>ele1= select.getOptions();
		
		System.out.println(ele1.size());
		
		for(WebElement e:ele1)
		{
			String text=e.getText();
			if(text.equals("India"))
			{
				//System.out.println(text);
				e.click();
				break;
			}
		}
	}

}
