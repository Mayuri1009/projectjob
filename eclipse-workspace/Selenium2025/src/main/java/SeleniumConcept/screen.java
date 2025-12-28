package SeleniumConcept;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screen {

	
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub

			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/r.php?entry_point=login");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		
			WebElement ele=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
			WebElement ele2=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
			
//			File srcfile=ele.getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(srcfile,new File ("./target/screenshot/ele.png"));
			
			
		File scr=ele2.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr,new File("./target/screenshot/ele2.png"));
			
		}

	

	}


