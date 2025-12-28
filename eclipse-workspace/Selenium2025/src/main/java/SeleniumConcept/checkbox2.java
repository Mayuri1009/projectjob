package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(5000);
	
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		driver.manage().window().maximize();
//		
	//	WebElement ele=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
//		for(int i=0;i<ele.size();i++) {
//           
//			if(ele.get(i).getText().equalsIgnoreCase("march"))
//			{
//				ele.get(i).click();
//			}
//	}

//		Select select=new Select(ele);
//		select.selectByIndex(8);
//	    System.out.println(select.getFirstSelectedOption().getText());
		
	List<WebElement> radio= driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
    System.out.println(radio.size());
    String exp="Male";
	for(int i=0;i<radio.size();i++)
	{
		if(radio.get(i).getText().equalsIgnoreCase(exp))
		{
			radio.get(i).click();
		}
			
	}
		System.out.println(exp+"="+"clicked");
		
}
}
