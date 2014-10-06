package common;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import common.BrowserType;

public class Browser {
	public WebDriver webdriver = null;
	private FirefoxProfile firefoxprofile = null;
	private static DesiredCapabilities capabilities = null;
	private String projectpath = System.getProperty("user.dir");
	public String nodeurl = "";

	public Browser(BrowserType browsertype) {
		switch (browsertype) {
		case Firefox:
			capabilities = DesiredCapabilities.firefox();
			File firebug = new File(projectpath
					+ "/src/main/resources/plugin/firebug-2.0.3.xpi");
			File firepath = new File(projectpath
					+ "/src/main/resources/plugin/firepath-0.9.7-fx.xpi");
			try {
				firefoxprofile.addExtension(firebug);
				firefoxprofile.addExtension(firepath);
				firefoxprofile.setPreference(
						"webdriver.accept.untrusted.certs", "true");
				firefoxprofile.setPreference(
						"extensions.firebug.currentVersion", "1.12.1");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			capabilities.setCapability(FirefoxDriver.PROFILE, firefoxprofile);
			if (nodeurl.equals(""))
				webdriver = new FirefoxDriver(firefoxprofile);
			else
				try {
					webdriver = new RemoteWebDriver(new URL(nodeurl),
							capabilities);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			webdriver.manage().window().maximize();
			break;

		case Chrome:
			System.getProperty("webdriver.chrome.exe", projectpath
					+ "/src/main/resources/plugin/chromedriver.exe");
			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("chrome.switches",
					Arrays.asList("--start-maximized"));
			capabilities.setCapability("chrome.switches", Arrays
					.asList("--proxy-server=http://your-proxy-domain:4443"));
			webdriver = new ChromeDriver(capabilities);
			if (nodeurl.equals(""))
				webdriver = new ChromeDriver(capabilities);
			else
				try {
					webdriver = new RemoteWebDriver(new URL(nodeurl),
							capabilities);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		case InternetExplorer:
			System.setProperty("webdriver.ie.driver", projectpath
					+ "/src/main/resources/plugin/IEDriverServer32.exe");
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities
					.setCapability(
							InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
							true);
			capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES,
					"-private"); // 清除浏览器Cookies
			capabilities.setCapability("ignoreZoomSetting", "true");
			if (nodeurl.equals(""))
				webdriver = new InternetExplorerDriver(capabilities);
			else
				try {
					webdriver = new RemoteWebDriver(new URL(nodeurl),
							capabilities);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		default:
			break;
		}
	}
}