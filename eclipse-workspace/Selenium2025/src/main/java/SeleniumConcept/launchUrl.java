package SeleniumConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/");

		String title=driver.getTitle();
		System.out.println("Page titile:"+title);
		
		if(title.equals("Javatpoint Homepage"))
		{
			System.out.println("correct tile");
		}
		else
		{
			System.out.println("wrong");
		}
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("java")) {
			System.out.println("correct url");
		}
		else
		{
			System.out.println("wrong");
		}
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.close();
	}

}
