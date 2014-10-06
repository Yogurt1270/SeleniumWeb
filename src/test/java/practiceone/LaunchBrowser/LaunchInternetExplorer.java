package practiceone.LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchInternetExplorer {
	private WebDriver iedriver = null;
	private DesiredCapabilities capabilities = null;
	private String projectpath = System.getProperty("user.dir");

	@BeforeClass
	public void startInternetExplorer() {
		System.setProperty("webdriver.ie.driver",projectpath +
				"/src/main/resources/plugin/IEDriverServer32.exe");
		capabilities = DesiredCapabilities.internetExplorer();
		capabilities
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES,
				"-private");
		capabilities.setCapability("ignoreZoomSetting", "true");
		iedriver = new InternetExplorerDriver(capabilities);
	}

	@Test
	public void openMailDotQQ() {
		iedriver.get("http://mail.qq.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void stopInternetExplorer() {
		iedriver.quit();
	}
}