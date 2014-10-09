package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {
	private WebDriver driverforwait;
	private int timeout;

	public WaitFor(WebDriver driverwait) {
		this.driverforwait = driverwait;
	}

	public void waitForElementIsdisplay(String locator) {
		try {
			(new WebDriverWait(driverforwait, timeout))
					.until(ExpectedConditions.presenceOfElementLocated(By
							.xpath(locator)));
		} catch (Exception e) {
			// To do something.
		}
	}

	public void waitForElementIsable(String locator) {
		try {
			(new WebDriverWait(driverforwait, timeout))
					.until(ExpectedConditions.elementToBeClickable(By
							.xpath(locator)));
		} catch (Exception e) {
			// To do something.
		}
	}
}