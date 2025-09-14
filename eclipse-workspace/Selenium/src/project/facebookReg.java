package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookReg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Priya");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Shelat");
		
		Thread.sleep(5000);
		
		WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select select=new Select(date);
		select.selectByIndex(10);
		Thread.sleep(5000);
		
		WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month1=new Select(month);
		month1.selectByVisibleText("Sep");
		Thread.sleep(5000);
		
		WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1995");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		driver.findElement(By.xpath("//input[contains(@name,\"reg_email__\")]")).sendKeys("abc5@gmail.com");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123454s");
		
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		
		
 
	}

}
