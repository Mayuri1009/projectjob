package five;

public class a {
	package five;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import java.io.FileWriter;

	public class Open {

		public static void main(String[] args) throws Exception {
			FileWriter logwriter = new FileWriter ("Logfile.txt");
			logwriter.write("this is my file");
			logwriter.close();

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		    driver.get("https://wwwinvisalign-staging-us.herokuapp.com/get-started/smile-assessment");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			  String [] xpath_of_persontype= {"//label[@id='teen",};
			  String [] xpath_of_smile = {"//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Overbite']"};
			  String [] xpath_of_dropdown= {"//select[@id='status']"};
			  WebElement se= driver.findElement(By.xpath("//select[@id='status']"));
			  
			  for(int i=0;i<1;i++) {
				  for(int j=0;j<1;j++){
					  for(int k=0;j<1;j++) {

						    
						    driver.findElement(By.xpath("//label[@id='teen']")).click();
						    
						    driver.findElement(By.xpath("//div[@class='before_info']//label[@class='teeth-desc'][normalize-space()='Overbite']")).click();
						    
						  
							//will use select class constructor
							Select status= new Select(se);
							//select by visible text
							//status.selectByIndex(1);
							//status.selectByIndex(2);
							status.selectByIndex(k+1);
							
							  driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("john");
							  driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("xyz");
							  driver.findElement(By.xpath("//input[@id='txtZip']")).sendKeys("431605");
							  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
							  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7087505973");
						      Thread.sleep(3000);
							  
						      driver.findElement(By.xpath("//a[normalize-space()='Get Your Results']")).click();;
						 
						  
					  }
				  }
			  }
			
		}

	}


}
