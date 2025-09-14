package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		String url=jse.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String title=jse.executeScript("return document.title;").toString();
		System.out.println(title);
		
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0, 500)");
        
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-500)");
	}

}
