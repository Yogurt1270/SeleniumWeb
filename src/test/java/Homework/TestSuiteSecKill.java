package Homework;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSuiteSecKill extends DataPrepare{
	
	
	
	@Test
	public void testcaseSecKill(){
		waitforprepare.waitForElementIsdisplay("//a[@href='/Promotion/SecKill?promotionType=3']");
		browser.webdriver.findElement(By.xpath("/Promotion/SecKill?promotionType=3")).click();
		boolean seckilltag = browser.webdriver.findElement(By.xpath("//a[@id='lnkNow']")).isDisplayed();
		Assert.assertEquals("error", true, seckilltag);
	}
}