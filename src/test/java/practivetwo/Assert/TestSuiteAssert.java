package practivetwo.Assert;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Browser;
import common.BrowserType;
import common.WaitFor;

public class TestSuiteAssert {
	protected static Browser browser = new Browser(BrowserType.Firefox);
	WebDriver driver = browser.webdriver;
	WaitFor waitfor;

	@BeforeClass
	public void openBrowser() {
		browser.webdriver.get("http://www.yintai.com");
		waitfor = new WaitFor(driver);
	}

	// @Test
	public void testcase_Assert() {
		System.out.println("for test");
		// Set wait time
		waitfor.waitForElementIsable("//a[@id='menu-cate-title']");
		boolean we = browser.webdriver.findElement(
				By.xpath("//a[@id='menu-cate-title']")).isDisplayed();
		Assert.assertEquals(we, true);
	}

	@Test
	public void testcase_Waitfor() {
		waitfor.waitForElementIsdisplay("//a[@class='reg']");
		boolean display = browser.webdriver.findElement(
				By.xpath("//a[@class='reg']")).isDisplayed();
		if (!display) {
			System.out.println("The element isdisplayed.");
		} else
			System.out.println("isn't displayed");
	}

	@AfterClass
	public void closeBrowser() {
		browser.webdriver.quit();
	}
}