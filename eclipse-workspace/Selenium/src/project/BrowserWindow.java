package project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent
		
		Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[contains(@href,'twitter')]").click();
		
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();//child
		
	
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		
		String pwd=it.next();
		System.out.println("parentWindowId"+pwd);
		
		String cwd=it.next();
		System.out.println("currentWindowId"+cwd);
		
		
		driver.switchTo().window(cwd);
		System.out.println("child window"+driver.getCurrentUrl());
		
         driver.close();
		driver.switchTo().window(pwd);
		System.out.println("parent window"+driver.getCurrentUrl());
		
		driver.quit();
		
		
		

	
;

		
		
		
		
	}

}
