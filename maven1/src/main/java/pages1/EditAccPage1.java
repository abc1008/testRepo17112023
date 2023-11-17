package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccPage1 {
	
	
	// variables
		WebDriver driver;
		
		@FindBy(xpath = "//a[text()='Edit Account']")
		private WebElement btnEditAcc;
		
		@FindBy(xpath = "//input[@id='input-telephone']")
		private WebElement textBoxTelephone;
		
		@FindBy(xpath = "//input[@value='Continue']")
		private WebElement btnContinue;
		
		
		// constructor
		public EditAccPage1(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);  // this : current class non-static variables 
		}
		
		
		// Methods
		public void editAccount() throws InterruptedException
		{
			btnEditAcc.click();
			textBoxTelephone.clear();
			textBoxTelephone.sendKeys("456789");
			btnContinue.click();
		}
	
	
	
	
	
	
	
	
	
	

}
