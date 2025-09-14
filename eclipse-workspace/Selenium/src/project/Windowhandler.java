package project;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       
       String pwId=driver.getWindowHandle();
       
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://www.tpointtech.com/java-tutorial");
       
       System.out.println(driver.getTitle());
       
       
       driver.switchTo().window(pwId);
       System.out.println(driver.getTitle());
       
       
      	}
}
