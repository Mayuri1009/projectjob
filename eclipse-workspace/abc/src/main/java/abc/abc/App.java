package abc.abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

 public class App
{

		public static void main(String[] args) {
	// Page Factory :: Object Repository OR Declaration
			WebDriver driver= new ChromeDriver();
		@FindBy(name = "email")
		WebElement username;

		@FindBy(name = "password")
		WebElement password;

		@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
		WebElement loginBtn;

		@FindBy(xpath = "//a[text()='Sign Up']")
		WebElement SignUpBtn;

		
		//Initialization
		
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public String validateloginPage()
		{
			return driver.getTitle();
		}
		
		public HomePage Login(String un,String pwd)
		{
			username.sendKeys(un);
			password.sendKeys(pwd);
			loginBtn.click();
			
			return new HomePage();
		}
		
		
}
}
 }
