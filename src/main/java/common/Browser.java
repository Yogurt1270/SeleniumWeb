package common;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import common.BrowserType;

public class Browser {
	public WebDriver wdriver = null;
	private FirefoxProfile ffprofile = null;
	private static DesiredCapabilities capabilities = null;
	private String projectpath = System.getProperty("user.dir");
	public String nodeurl = "";
	
	public Browser(BrowserType browsertype){
		switch(browsertype){
		case Firefox:
			capabilities = DesiredCapabilities.firefox();
			File firebug = new File(projectpath  + "/src/main/resources/plugin/firebug-2.0.3.xpi");
			File firepath = new File(projectpath  + "/src/main/resources/plugin/firepath-0.9.7-fx.xpi");
			try {
				ffprofile.addExtension(firebug);
				ffprofile.addExtension(firepath);
				ffprofile.setPreference(
						"webdriver.accept.untrusted.certs", "true");
				ffprofile.setPreference(
						"extensions.firebug.currentVersion", "1.12.1");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			capabilities.setCapability(FirefoxDriver.PROFILE, ffprofile);
			if (nodeurl.equals(""))
				wdriver = new FirefoxDriver(ffprofile);
			else
				try {
					wdriver = new RemoteWebDriver(new URL(nodeurl), capabilities);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			wdriver.manage().window().maximize();
			break;
			
		default:
			break;
		}
	}
}