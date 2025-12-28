package five;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("total companies"+allcompanies.size());
		
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("total current price"+currentprice.size());
		
		String expectedcompanyname ="Super Fine Knitters";
		
		for(int i=0;i<allcompanies.size();i++) {
			if(allcompanies.get(i).getText().equalsIgnoreCase(expectedcompanyname)) {
			System.out.println(allcompanies.get(i).getText()+"=="+currentprice.get(i).getText());
			allcompanies.get(i).click();
			break;
		}
	
		}
	driver.quit();
	
	
	
	
	
	
	}
}
