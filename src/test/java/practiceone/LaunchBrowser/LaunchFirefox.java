package practiceone.LaunchBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchFirefox {
	public WebDriver ffdriver = null;
	private FirefoxProfile ffprofile = null;
	private String projectpath = System.getProperty("user.dir");

	// 理解BeforeClass和BeforeMethod的区别
	@BeforeClass
	public void startBrowser() {

		/*
		 * 如果Firefox不是默认安装需设置浏览器属性
		 */
		System.setProperty("webdriver.firefox.bin",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		File firebug = new File(projectpath
				+ "/src/main/resources/plugin/firebug-2.0.3.xpi");
		File firepath = new File(projectpath
				+ "/src/main/resources/plugin/firepath-0.9.7-fx.xpi");
		ffprofile = new FirefoxProfile();
		try {
			ffprofile.addExtension(firebug);
			ffprofile.addExtension(firepath);
			ffprofile.setPreference("webdriver.accept.untrusted.certs", true);
			ffprofile.setPreference("extensions.firebug.currentVersion",
					"1.12.1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ffdriver = new FirefoxDriver(ffprofile);
	}

	@Test
	public void openMailDot163() {
		ffdriver.manage().window().maximize();
		ffdriver.get("http://mail.163.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void openMailDotQQ() {
		ffdriver.get("http://mail.qq.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void closeBrowser() {
		ffdriver.quit();
	}
}