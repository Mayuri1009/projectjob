package SeleniumConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert
//		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
//		Alert alert=driver.switchTo().alert();
//	    System.out.println(alert.getText());
//        alert.accept();
//        
		//confirm
//        driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
//        Alert alert=driver.switchTo().alert();
//        System.out.println(alert.getText());
//        
//        alert.accept();
//        
        
		//prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(5000);
		alert.sendKeys("naveen");		
		alert.accept();//click ok

	}

}
