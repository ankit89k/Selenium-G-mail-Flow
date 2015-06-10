package automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGmailComposeMailRun {
	
	WebDriver driver;
	SeleniumGmailComposeMailAction composeMailAction = new SeleniumGmailComposeMailAction();
	
	@BeforeTest
	public void launchBrowser(){
		driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
	}

	@Test
	public void runComposeGmailTest(){
		composeMailAction.loginGmailEmail(driver);
		composeMailAction.composeGmailMail(driver);
	}
	
	@AfterTest
	public void closeBrowser(){
		System.out.println("Closing browser");	
		driver.close();
	}
}
