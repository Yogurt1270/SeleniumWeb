package Homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Browser;
import common.BrowserType;
import common.WaitFor;

public class DataPrepare{
	
	// Setup launch browser type
	protected static Browser browser = new Browser(BrowserType.Firefox);
	WebDriver webdriverprepare = browser.webdriver;
	public WaitFor waitforprepare = new WaitFor(webdriverprepare);
	
	
	@BeforeTest
	public void openBrowser(){
		browser.webdriver.get("http://m.yintai.pre");
		browser.webdriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBrowser(){
		browser.webdriver.quit();
	}
}