package practicetwo.InitializeBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Testcase_Contact extends InitializeBrowserTestSuite{

	@Test
	public void clickContact() {
		browser.webdriver.findElement(By.xpath("//div[text()='ͨѶ¼']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void returnHomepage() {
		browser.webdriver.findElement(By.xpath("//div[text()='��ҳ']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}