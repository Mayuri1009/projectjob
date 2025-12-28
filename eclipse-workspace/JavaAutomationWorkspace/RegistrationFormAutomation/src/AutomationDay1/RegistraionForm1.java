package AutomationDay1;

import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import java.awt.Robot;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;

public class RegistraionForm1 {

		     public static void main(String[] args) throws Exception {
				FileWriter logwriter = new FileWriter ("MainLogfile.txt");
				
				if(logwriter!=null){
					logwriter.write("Successfully created MainLogfile.txt\n");
					
				}
				else {
                    System.out.println("Filed to creat MainLogfile.txt\n ");
                	System.exit(1);
				}
			
				logwriter.write("Step 1: Setting browser driver for chrome\n");
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
				logwriter.write("Step 2: Creating chrome driver object");
				WebDriver driver= new ChromeDriver();
				if(driver!=null){
					logwriter.write("Successfully created Chromedriver object\n");
					logwriter.write("Step 2: pass\n");
					
				}
				else {
					logwriter.write("Failed to create Chromedriver object\n");
					logwriter.write("Step 2: Fail\n");
				}
				logwriter.write("Step 3:Opening url: 'https://wwwinvisalign-staging-us.herokuapp.com/get-started/smile-assessment'\n");
			    driver.get("https://wwwinvisalign-staging-us.herokuapp.com/get-started/smile-assessment");
				logwriter.write("Step 4: Maximizing window\n");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			    
				String []xpath_of_persontype= {"//label[@id='teen']","//label[normalize-space()='Parent']","//label[normalize-space()='Adult']"};
			    String []xpath_of_smile = {"//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Overbite']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Underbite']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Crossbite']","//label[@class='teeth-desc gap-desc']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Open Bite']","//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Crooked Teeth']","//label[@class='teeth-desc'][normalize-space()='Generally Straight Teeth']","//label[@class='teeth-first']"};
				String []xpath_of_dropdown= {"//select[@id='status']"};
				  
				logwriter.write("Step 5:creating Robot object for popup handling and key event\n");
				Robot bot = null;
			    bot = new Robot();
				if(bot!=null)
				    {
						logwriter.write("Successfully created Robot object\n");
						logwriter.write("Step 5: pass\n");
						
					}
				else {
						logwriter.write("Failed to create Robot object\n");
						logwriter.write("Step 5: Fail\n");
					}
				  
				logwriter.write("Step 6:Staring 72 test case validation\n");
				FileWriter   logwriterPerTestCase =null;
				int count=0;
				
			    for(int i=0;i<3;i++) {
			       for(int j=0;j<8;j++){
					  for(int k=0;k<3;k++) {
						  
						  logwriterPerTestCase = new FileWriter ("Logfile"+ count++ +".txt");
							
							if(  logwriterPerTestCase !=null){
								  logwriterPerTestCase.write("Successfully created Logfile.txt\n");
								
							}
							else {
			                    System.out.println("Filed to creat Logfile.txt\n ");
			                	System.exit(1);
							}
						
							logwriterPerTestCase.write("Step 1:Clearing stale data with page refresh\n");	  
							driver.navigate().refresh();
						    logwriterPerTestCase.write("Step 2:finding x path for "+(xpath_of_persontype[i])+"and clicking \n");	
							driver.findElement(By.xpath(xpath_of_persontype[i])).click();
							logwriterPerTestCase.write("Step 3:finding x path for "+(xpath_of_smile[j])+"and clicking \n");
							driver.findElement(By.xpath(xpath_of_smile[j])).click();
							Thread.sleep(3000);
	
							
							    if(i==0 && j==0 && k==0) {
							    	logwriterPerTestCase.write("Handling popup for the first time\n");
							    	 int mask = InputEvent.BUTTON1_DOWN_MASK;
									    bot.mouseMove(885, 890);
									    bot.mousePress(mask);
									    bot.mouseRelease(mask);
							    }
							   
							    Thread.sleep(3000);
							    logwriterPerTestCase.write("Step 4:Selecting value from dropdown\n");
							    WebElement se= driver.findElement(By.xpath("//select[@id='status']"));
								Select status= new Select(se);							  
								status.selectByIndex(k+1);
								
								logwriterPerTestCase.write("Step 5:Filling data for all fields \n");
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
								  

								  logwriterPerTestCase.write("Step 6:Clicking on submit button \n");
							      driver.findElement(By.xpath("//a[normalize-space()='Get Your Results']")).click();
							      
							      
							     WebElement finalstatus=driver.findElement(By.xpath("//h2[@class='blue-color']"));
							     if (finalstatus != null) { 
							     logwriterPerTestCase.write("\n\n**********************************************************************\n\n");

								  logwriterPerTestCase.write("Final Result of testcase " +count+ ": Pass \n");
							     
							     logwriterPerTestCase.write("\n\n**********************************************************************\n\n");
								    
							    
							    	 
							     }
							     else {
							    	 logwriterPerTestCase.write("\n\n**********************************************************************\n\n");

									  logwriterPerTestCase.write("Final Result of testcase \" +count+ \": Fail\n");
							    	 logwriterPerTestCase.write("\n\n**********************************************************************\n\n");
									    
							     }
							         
							      logwriterPerTestCase.close();
							     
						  }
					  }
				  }
					 logwriter.write("Closing webdriver after all test cases\n");
				   driver.close();
				   logwriter.close();  
			}
               
		}

	


