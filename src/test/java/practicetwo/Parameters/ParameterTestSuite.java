package practicetwo.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.Browser;
import common.BrowserType;

public class ParameterTestSuite {
	
	protected static Browser browser = new Browser(BrowserType.Firefox);
	
	ParseProperties pp = null;
	
	@Parameters({"testParameters"})
	@BeforeClass
	public void bbb(@Optional("aaaaaa") String testdata){
		pp = new ParseProperties(System.getProperty("user.dir")+testdata);
	}
	
	@Test
	public void searchKeyWord(){
		browser.webdriver.get("http://m.yintai.com");
		browser.webdriver.findElement(By.xpath("//input[@id='txtKeywordHead']")).clear();
		browser.webdriver.findElement(By.xpath("//input[@id='txtKeywordHead']")).sendKeys(pp.getValue("Keyword"), Keys.ENTER);
		browser.webdriver.findElement(By.xpath("//input[@id='btnSearchHead']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void aaa(){
		browser.webdriver.quit();
	}
}