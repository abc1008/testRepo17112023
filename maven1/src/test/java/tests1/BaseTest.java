package tests1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages1.EditAccPage1;
import pages1.EditAddrPage;
import pages1.EditPassPage;
import pages1.LoginPage;

public class BaseTest {
	
	
	static WebDriver driver;
	LoginPage loginPageObject;
	EditAccPage1 editAccPage;
	EditPassPage editPasswordPage;
	EditAddrPage editAddrPage;
	
	@BeforeSuite
	public void initBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		loginPageObject.login();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		loginPageObject.logout();	
	}
	
	@BeforeClass
	public void initObjects()
	{
		loginPageObject =  new LoginPage(driver);
		editAccPage = new EditAccPage1(driver);
		editPasswordPage = new EditPassPage(driver);
		editAddrPage = new EditAddrPage(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
