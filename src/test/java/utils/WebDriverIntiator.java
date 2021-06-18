package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import WebDriverConfigure.DriverManager;
import WebDriverConfigure.DriverType;
import WebDriverConfigure.FireFoxDriverManager;
import WebDriverConfigure.chromeDriverManager;

public class WebDriverIntiator {
	
	public static DriverManager getDriverManager(DriverType type) {
		DriverManager driverManager;
		switch (type) {
		case CHROME:
			driverManager = new chromeDriverManager();
			break;

		case FIREFOX:
			driverManager = new FireFoxDriverManager();
			break;

		default:
			driverManager = new FireFoxDriverManager();
			break;

		}

		return driverManager;

	}


}
