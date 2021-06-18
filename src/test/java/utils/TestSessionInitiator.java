package utils;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import com.qait.Actions.detailsPage;
import com.qait.Actions.searchPage;

import WebDriverConfigure.DriverManager;
import WebDriverConfigure.DriverType;

public class TestSessionInitiator {

	
	DriverManager driverManager;
	protected WebDriver driver;
	private WebDriverIntiator wdfactory = new WebDriverIntiator();

	// initialize the webdriver
	public void initialize() {
		driverManager = wdfactory.getDriverManager(DriverType.CHROME);
		driver = driverManager.getWebDriver();

		Goto("https://www.imdb.com/");

	}

	public WebDriver Driver() {
		return driver;
	}

	// create object of action classes
	public searchPage SearchPages;
	public detailsPage DetailsPages;

	private void initPage() {

		SearchPages = new searchPage(driver);
		DetailsPages = new detailsPage(driver);

	}

	public void Goto(String url) {
		driver.get(url);
	}

	@BeforeClass
	public void launchMyAppliction() {

		initialize();
		initPage();
	}

	
	}
