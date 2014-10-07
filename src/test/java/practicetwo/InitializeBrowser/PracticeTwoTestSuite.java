package practicetwo.InitializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.Browser;
import common.BrowserType;

public class PracticeTwoTestSuite {
	protected static Browser browser = new Browser(BrowserType.Firefox);

	@BeforeTest
	public void openBrowser(){
		browser.webdriver.get("http://mail.163.com");
		browser.webdriver.findElement(By.xpath("//input[@id='idInput']")).sendKeys("yogurt1270");
		browser.webdriver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Yogurt1270__", Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void closeBrowser(){
		browser.webdriver.findElement(By.xpath("//a[text()='退出']")).click();
		browser.webdriver.quit();
	}
}