package SeleniumConcept;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownwithoutselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//List<WebElement> ele =driver.findElements(By.xpath("//select[@id=\"Form_getForm_Country\"]/option"));
		
		//System.out.println(ele.size());

	}

}
