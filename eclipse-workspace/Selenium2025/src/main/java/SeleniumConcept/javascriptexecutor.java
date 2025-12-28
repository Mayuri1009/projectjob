package SeleniumConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String a1=js.executeScript("return document.title;").toString();
//		System.out.println(a1);
//		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String map=js.executeScript("return document.URL;").toString();
		System.out.println(map);
		

	}

}
