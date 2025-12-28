package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		
		driver.findElement(By.name("input4[]")).sendKeys("C:\\Users\\Mayuri\\Downloads\\IRF.pdf");
	}

}
