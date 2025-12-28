package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		//driver.findElement(By.xpath("//input[@id=\"male\"]")).click();
		Thread.sleep(5000);
		List<WebElement> ele= driver.findElements(By.xpath("//p[text()=\"Radio button :\"]"));
		
		String exp="Female";
		
		for(int i=0;i<ele.size();i++)
		{
			if(ele.get(i).getText().equalsIgnoreCase(exp))
			{
				ele.get(i).click();
                System.out.println(exp+" "+"clicked");
			}
		}
		
	}

}
