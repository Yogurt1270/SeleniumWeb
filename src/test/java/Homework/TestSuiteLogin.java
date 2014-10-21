package Homework;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import common.WaitFor;


public class TestSuiteLogin extends DataPrepare{
	
	@Test
	public void testcaseLogin(){
		waitforprepare.waitForElementIsdisplay("//a[@href='/UserCenter']");
		if(browser.webdriver.findElement(By.xpath("//a[@href='/UserCenter']")).isDisplayed()){
			browser.webdriver.findElement(By.xpath("//a[@href='/UserCenter']")).click();
		}
		else{
			System.out.println("error");
		}
	}
	
	@AfterClass
	public void backHomepage(){
		browser.webdriver.findElement(By.xpath("//a[@class='higher']")).click();
	}
}