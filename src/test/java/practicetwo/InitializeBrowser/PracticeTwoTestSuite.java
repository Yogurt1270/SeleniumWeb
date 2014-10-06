package practicetwo.InitializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Browser;
import common.BrowserType;

public class PracticeTwoTestSuite {
	protected static Browser browser = new Browser(BrowserType.Firefox);

	@BeforeSuite
	public void openBrowser(){
		browser.webdriver.get("http://mail.163.com");
		browser.webdriver.findElement(By.xpath("//input[@id='Input']")).sendKeys("yogurt1270");
		browser.webdriver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Yogurt1270__", Keys.ENTER);
	}
	
	@Test
	public void testcase_001(){
		System.out.println("Testcase_001");
	}
	
	@AfterSuite
	public void closeBrowser(){
		browser.webdriver.findElement(By.xpath("//a[text()='退出']")).click();
		browser.webdriver.quit();
	}
}