package practicetwo.InitializeBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase_Inbox extends PracticeTwoTestSuite {

	@BeforeClass
	public void openHomepage() {
		boolean isdisplayed = browser.webdriver.findElement(
				By.xpath("//span[@id='spnUid']")).isDisplayed();
		if (!isdisplayed)
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

	@Test
	public void clickInbox() {
		browser.webdriver.findElement(By.xpath("//span[text()='收件箱']")).click();
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