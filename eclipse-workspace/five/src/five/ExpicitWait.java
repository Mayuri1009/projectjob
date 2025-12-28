package five;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicitWait {
	
	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();

		//Add chrome switch to disable notification - "*--disable-notifications*"
		options.addArguments("--disable-notifications");

		//Set path for driver exe 
		//System.setProperty("webdriver.chrome.driver","path/to/driver/exe");
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		//Pass ChromeOptions instance to ChromeDriver Constructor
		WebDriver driver =new ChromeDriver(options);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bute.mayuri@gmail.com");
		//explicit wait
		WebDriverWait wt = new WebDriverWait(driver,10);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']"))).sendKeys("2states");
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@aria-label='Account']")).click();
		//Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		Thread.sleep(500);
		//WebElement logOut = wt.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
		//driver.findElement(By.xpath("//*[@class=\"d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m\"]")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]")).click();
		//Thread.sleep(500);
		//WebElement logOut = driver.findElement(By.id("userNavigationLabel"));
		//logOut.click();
		//driver.findElement(By.xpath("//*[@class='qzhwtbm6 knvmm38d'][contains(.,'Log Out')]")).click();
driver.findElement(By.xpath("//div[@data-nocookies='true']//div[@class='gs1a9yip ow4ym5g4 auili1gw rq0escxv j83agx80 cbu4d94t buofh1pr g5gj957u i1fnvgqd oygrvhab cxmmr5t8 hcukyx3x kvgmc6g5 tgvbjcpo hpfvmrgz rz4wbd8a a8nywdso l9j0dhe7 du4w35lb rj1gh0hx pybr56ya f10w8fjw']")).click();;
		Thread.sleep(5000);
		/*
		 * driver.findElement(By.
		 * xpath("//*[@class=\"rq0escxv pmk7jnqg du4w35lb pedkr2u6 oqq733wu ms05siws pnx7fd3z b7h9ocf4 j9ispegn kr520xx4 k4urcfbm\"]"
		 * )).sendKeys(Keys.TAB); Thread.sleep(500);
		 * 
		 * driver.findElement(By.
		 * xpath("//*[@class=\"rq0escxv pmk7jnqg du4w35lb pedkr2u6 oqq733wu ms05siws pnx7fd3z b7h9ocf4 j9ispegn kr520xx4 k4urcfbm\"]"
		 * )).sendKeys(Keys.TAB); Thread.sleep(500);
		 * 
		 * driver.findElement(By.
		 * xpath("//*[@class=\"rq0escxv pmk7jnqg du4w35lb pedkr2u6 oqq733wu ms05siws pnx7fd3z b7h9ocf4 j9ispegn kr520xx4 k4urcfbm\"]"
		 * )).sendKeys(Keys.TAB); Thread.sleep(500);
		 * 
		 * driver.findElement(By.
		 * xpath("//*[@class=\"rq0escxv pmk7jnqg du4w35lb pedkr2u6 oqq733wu ms05siws pnx7fd3z b7h9ocf4 j9ispegn kr520xx4 k4urcfbm\"]"
		 * )).sendKeys(Keys.TAB); Thread.sleep(500);
		 * 
		 * driver.findElement(By.
		 * xpath("//*[@class=\"rq0escxv pmk7jnqg du4w35lb pedkr2u6 oqq733wu ms05siws pnx7fd3z b7h9ocf4 j9ispegn kr520xx4 k4urcfbm\"]"
		 * )).sendKeys(Keys.ENTER); Thread.sleep(500);
		 */
		//driver.close();
		driver.quit();
		
	
		
	}

}
