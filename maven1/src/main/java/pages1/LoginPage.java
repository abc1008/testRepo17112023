package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class LoginPage {
	
	// variables
		WebDriver driver;
		
		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement textBoxUserName;
		
		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement textBoxPassword;
		
		@FindBy(xpath = "//input[@type='submit']")
		private WebElement btnlogin;
		
		@FindBy(xpath = "//span[text()='My Account']")
		private WebElement btnMyAcc;
		
		@FindBy(xpath = "//a[text()='Logout']")
		private WebElement btnLogout;
		
		@FindBy(xpath = "//div[@id='content']//h1")
		private WebElement msgLogout;
		
		@FindBy(xpath = "//a[text()='Login']")
		private WebElement dropdownBtnLogin;
		
		@FindBy(xpath = "//div[@class='well']//h2[text()='Returning Customer']")
		private WebElement titleLoginPage;
		

		// constructor
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);  // this : current class non-static variables 
		}
		
		
		// Methods
		public void login() throws InterruptedException
		{
			
				btnMyAcc.click();
				dropdownBtnLogin.click();
				Reporter.log("Login form displayed.", true);
				textBoxUserName.sendKeys("ag89111@gmail.com");
				textBoxPassword.sendKeys("Login@123");
				btnlogin.click();
			
		}
		
		
		public void logout() throws InterruptedException
		{
			btnMyAcc.click();
			btnLogout.click();
			
			if(msgLogout.isDisplayed())
			{
				Reporter.log("User logged out successfully.", true);
				Reporter.log("Test note for GIT.", true);
				Reporter.log("Test note for GIT2.", true);
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
