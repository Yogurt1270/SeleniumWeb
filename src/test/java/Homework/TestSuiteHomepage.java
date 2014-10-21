package Homework;

import junit.framework.Assert;
import common.BrowserType;
import common.Browser;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestSuiteHomepage extends DataPrepare{
	
	//@BeforeClass
	@Test
	public void checkHomepage(){
		waitforprepare.waitForElementIsdisplay("//div[@class='in_con']");
		boolean banner = browser.webdriver.findElement(By.xpath("//div[@class='in_con']")).isDisplayed();
		if(banner){
			System.out.println("The banner is displayed.");
		}
		else{
			System.out.println("The banner isn't displayed.");
		}
	}

	//@Test
	public void testcaseHomepage(){
		//System.out.println("result");
		boolean seckill = browser.webdriver.findElement(By.xpath("//a[@href='/Promotion/SecKill?promotionType=3']")).isDisplayed();
		Assert.assertEquals("Not found SecKill", true, seckill);
	}
}