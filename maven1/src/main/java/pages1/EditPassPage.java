package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPassPage {
	
	
	// variables
		WebDriver driver;
		
		@FindBy(xpath = "//a[text()='Password']")
		private WebElement btnPassword;
		
		@FindBy(xpath = "//input[@id='input-password']")
		private WebElement textBoxPassword;
		
		@FindBy(xpath = "//input[@id='input-confirm']")
		private WebElement textBoxConfPassword;
		
		@FindBy(xpath = "//input[@value='Continue']")
		private WebElement btnContinue;
		
		
		// constructor
		public EditPassPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);  // this : current class non-static variables 
		}
		
		
		// Methods
		public void editPassword() throws InterruptedException
		{
			btnPassword.click();
			Thread.sleep(1000);
			textBoxPassword.sendKeys("Login@123");
			Thread.sleep(1000);
			textBoxConfPassword.sendKeys("Login@123");
			Thread.sleep(1000);
			btnContinue.click();
			Thread.sleep(1000);
		}
	
	
	
	
	
	
	
	
	
	

}
