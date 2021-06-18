package com.qait.test;

import org.testng.annotations.Test;

import utils.TestSessionInitiator;

public class basicTest extends TestSessionInitiator {

	@Test(priority = 1)
	public void selectTitleOption() throws InterruptedException {

		Thread.sleep(10);
		SearchPages.clickOnButton();
		SearchPages.selectTitle();
	}

	@Test(priority = 2)
	public void searchMovieByName() throws InterruptedException {
		SearchPages.enterMovieName("Radhe");
		Thread.sleep(8000);
		SearchPages.clickOnSuggestion();
	}

	@Test(priority = 3)
	public void getCastOfMovie() {
		DetailsPages.getCastAndCrew();

	}

	@Test(priority = 4)
	public void getMoviePlot() {
		DetailsPages.getPlotSummary();
	}

}
