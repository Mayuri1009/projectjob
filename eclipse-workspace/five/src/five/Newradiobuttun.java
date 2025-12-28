package five;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newradiobuttun {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//1st way radio button
	    driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    Thread.sleep(3000);
	
	    driver.findElement(By.xpath("//input[@value='-1']")).click();
	    Thread.sleep(3000);
	// 2nd way radio button
	    List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("total webelement="+radios.size());
	    
	    System.out.println(radios.get(1).isEnabled());
	    System.out.println(radios.get(0).isDisplayed());
	    Thread.sleep(3000);
	    radios.get(1).click();
	    //3rd way
	    
	    List<WebElement> radios1= driver.findElements(By.xpath("//label[contains@class='mt']"));
	    String expectedresult ="Female";
	    
	    for(int i=0;i<radios.size(); i++) {
	    	if (radios.get(i).getText().equalsIgnoreCase(expectedresult)) {
	    		radios.get(i).click();
	    		System.out.println(expectedresult + "clicked");
	    		break;
	    	}
	    }
	   
	    
	    
	    
	    
		
	}
}