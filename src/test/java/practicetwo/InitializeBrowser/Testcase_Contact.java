package practicetwo.InitializeBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Testcase_Contact extends PracticeTwoTestSuite{

	@Test
	public void clickContact() {
		browser.webdriver.findElement(By.xpath("//div[text()='通讯录']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void returnHomepage() {
		browser.webdriver.findElement(By.xpath("//div[text()='首页']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}