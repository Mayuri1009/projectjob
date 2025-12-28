package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
	WebElement ele=driver.findElement(By.xpath("//select[@id=\"country\"]"));
	Select select=new Select(ele);
//		select.selectByIndex(2);
//		
//		ele.getText();
//		
	//	System.out.println();
		
		List<WebElement> ele1=select.getOptions();
		System.out.println(ele1.size());
				
		
		for(WebElement e:ele1)
		{
			String text=e.getText();
			System.out.println(text);
			if(text.equals("India"))
			{
			e.click();
			break;
			}
		}

	}

}
