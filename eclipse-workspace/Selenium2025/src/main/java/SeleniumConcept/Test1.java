package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.espncricinfo.com/series/women-s-premier-league-2023-24-1411373/delhi-capitals-women-vs-up-warriorz-women-4th-match-1417719/full-scorecard");
       driver.manage().window().maximize();
       
      // driver.findElement(By.xpath("//table[@id=\"customers\"]//child::tr//following-sibling::tr//span[text()=\"Meta\"]")).getText();
	}

}
