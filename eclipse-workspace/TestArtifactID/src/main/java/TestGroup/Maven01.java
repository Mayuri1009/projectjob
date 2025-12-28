package TestGroup;

import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import java.awt.Robot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;

public class Maven01 {


		

		

			public static void main(String[] args) throws Exception {
				FileWriter logwriter = new FileWriter ("Logfile.txt");
				logwriter.write("open url");
				logwriter.close();
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32\\chromedriver.exe");

				// Start browser
				WebDriver driver = new FirefoxDriver();

			    driver.get("https://wwwinvisalign-staging-us.herokuapp.com/get-started/smile-assessment");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				  String []xpath_of_persontype= {"//label[@id='teen']","//label[normalize-space()='Parent']","//label[normalize-space()='Adult']"};
				  String []xpath_of_smile = {"//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Overbite']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Underbite']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Crossbite']","//label[@class='teeth-desc gap-desc']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Open Bite']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Crooked Teeth']","//label[@class='teeth-desc'][normalize-space()='Generally Straight Teeth']","//label[@class='teeth-first']"};
				  String []xpath_of_dropdown= {"//select[@id='status']"};
				  
				  Robot bot = null;
				  bot = new Robot();
				  
				  
				  for(int i=0;i<3;i++) {
					  for(int j=0;j<8;j++){
						  for(int k=0;k<3;k++) {
							
							  
							    driver.navigate().refresh();
							    driver.findElement(By.xpath(xpath_of_persontype[i])).click();
							    driver.findElement(By.xpath(xpath_of_smile[j])).click();
							    Thread.sleep(3000);
							    //WebDriverWait wait = new WebDriverWait(driver, 10);
							   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='epdsubmit']")));
							   // WebElement toast1 = driver.findElement(By.xpath("//input[@name='epdsubmit']"));
							   // toast1.click();
							    int mask = InputEvent.BUTTON1_DOWN_MASK;
							    bot.mouseMove(950, 1000);
							    bot.mousePress(mask);
							    bot.mouseRelease(mask);
							    
							// WebElement elementpopup=driver.findElement(By.xpath("//input[@id='epdsubmit']"));
							 //elementpopup.click();
							   // driver.findElement(By.xpath("//input[@name='epdsubmit']")).click();
							  // driver.switchTo().alert().accept();
							    
							    Thread.sleep(3000);
							    WebElement se= driver.findElement(By.xpath("//select[@id='status']"));
								Select status= new Select(se);							  
								status.selectByIndex(k+1);
								
								driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
								driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("john");
								driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
								driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("xyz");
								driver.findElement(By.xpath("//input[@id='txtDOB']")).sendKeys("10/08/1998");
							
								 driver.findElement(By.xpath("//input[@id='txtZip']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
								 driver.findElement(By.xpath("//input[@id='txtZip']")).sendKeys("431605");
								  driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
								  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
								  
								  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7087505973");
								 
							      Thread.sleep(3000);
								  
							      driver.findElement(By.xpath("//a[normalize-space()='Get Your Results']")).click();;
			
									  
						  }
					  }
				  }
					 
				   driver.close();
			}

		

	}



