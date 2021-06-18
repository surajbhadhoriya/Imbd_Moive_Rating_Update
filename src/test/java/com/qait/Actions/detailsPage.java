package com.qait.Actions;

import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class detailsPage extends GetPage {

	public detailsPage(WebDriver driver) {
		super(driver, "moviePage");
	}

	public void getCastAndCrew() {
		element("cast").click();
	}

	public void getPlotSummary() {
		element("showMore").click();

		element("plotSummary").click();
	}

}
