package practiceone.LaunchBrowser;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchChrome {
	public WebDriver chromedriver = null;
	
	private DesiredCapabilities capabilities = null;
	
	private String projectpath = System.getProperty("user.dir");

	@BeforeClass
	public void openChrome() {
		System.getProperty("webdriver.chrome.exe", projectpath
				+ "/src/main/resources/plugin/chromedriver.exe");
		capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches",
				Arrays.asList("--start-maximized"));
		capabilities.setCapability("chrome.switches",
				Arrays.asList("--proxy-server=http://your-proxy-domain:4443"));
		chromedriver = new ChromeDriver(capabilities);
	}
	
	@Test
	public void openMailDot126() {
		chromedriver.manage().window().maximize();
		chromedriver.get("http://www.126.com");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromedriver.findElement(By.xpath("//input[@id='idInput']")).sendKeys("FireflyAutomation");
		chromedriver.findElement(By.xpath("//input[@id='pwdInput']")).sendKeys("Firefly", Keys.ENTER);
	}
	
	@AfterClass
	public void closeChrome() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chromedriver.quit();
	}
}