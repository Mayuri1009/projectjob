package SeleniumConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 
 
 driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
 
 Thread.sleep(500);
 
 driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
 
Thread.sleep(500);
 
 driver.findElement(By.xpath("//input[@value=\"2\"]")).click();

 
Thread.sleep(500);
 
 driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
 
 
 List<WebElement> radio=driver.findElements(By.xpath("//label[@class=\"_58mt\"]"));
 String exp="Female";
 for(int i=0;i<radio.size();i++)
 {
	 if(radio.get(i).getText().equalsIgnoreCase(exp))
	 {
		 radio.get(i).click();
		 System.out.println(exp+" "+"clicked");
	 }
 }

	}

}
