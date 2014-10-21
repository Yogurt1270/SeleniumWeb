package practivetwo.Assert;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Browser;
import common.BrowserType;
import common.WaitFor;

public class TestSuiteAssert {
	protected static Browser browser = new Browser(BrowserType.InternetExplorer);
	WebDriver driverassert = browser.webdriver;
	WaitFor waitforassert = new WaitFor(driverassert);

	@BeforeClass
	public void openBrowser() {
		browser.webdriver.get("http://www.yintai.com");
	}

	@Test
	public void testcase_Assert() {
		System.out.println("Loading homepage...");
		// Set wait time
		waitforassert.waitForElementIsable("//a[@id='menu-cate-title']");
		boolean we = browser.webdriver.findElement(
				By.xpath("//a[@id='menu-cate-title']")).isDisplayed();
		Assert.assertEquals(we, true);
	}

	@Test
	public void testcase_Waitfor() {
		waitforassert.waitForElementIsdisplay("//a[@class='reg']");
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