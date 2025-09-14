package project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class Screenshot {

		
		WebDriver driver;
		
		public void captureScreenshot(ITestResult result) throws IOException {
			driver=new ChromeDriver();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		File destfile=new File("./screenshot/"+result.getName()+".png");
		FileHandler.copy(sourcefile,destfile);

	}

}
