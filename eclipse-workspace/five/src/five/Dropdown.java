package five;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		//First way
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("total dropdown values are:"+birthMonth.size());
		birthMonth.get(9).click();
		System.out.println(birthMonth.get(1).isEnabled());
		
		//2 way recommended
		WebElement bm= driver.findElement(By.xpath("//select[@id='month']"));
		//will use select class constructor
		Select month= new Select(bm);
		//select by visible text
		month.selectByIndex(1);
		month.selectByValue("5");
		month.selectByVisibleText("april");
		System.out.println(month.getFirstSelectedOption().getText());
		 
		//3rd way
		
		
	}

}