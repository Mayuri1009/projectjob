package five;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//implicit function
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how stuff works");
		
		//handling autosuggestion
		WebElement Allsuggestions = driver.findElement(By.xpath("//ul[@role='listbox']"));
		List<WebElement> Allsearch = Allsuggestions.findElements(By.tagName("li"));
		System.out.println("Total auto suggestion :- " + Allsearch.size());
		for(int i=0; i<Allsearch.size(); i++) {
			
			String AllSuggestionList = Allsearch.get(i).getText();
			String FinalResult = "how stuff works book";
			
			if(AllSuggestionList.equalsIgnoreCase(FinalResult)) {
				Allsearch.get(i).click();
				System.out.println("you have selected ="+ FinalResult);
				break;
				
			}
			
		}
	}

}
