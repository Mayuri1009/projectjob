package project;

import org.openqa.selenium.chrome.ChromeDriver;

public class setting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chrome.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		

	}

}
