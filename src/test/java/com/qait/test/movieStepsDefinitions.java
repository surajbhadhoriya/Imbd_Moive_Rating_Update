package com.qait.test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestSessionInitiator;

public class movieStepsDefinitions extends TestSessionInitiator {

	@Given("^matching movie (.*) title suggestions for the entered search team$")
	public void matching_movie_title_suggestions_for_the_entered_search_team(String name) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		SearchPages.clickOnButton();
		SearchPages.selectTitle();
		SearchPages.enterMovieName(name);

	}

	@When("^Selecting a movie from suggestions renders Movie Details page$")
	public void selecting_a_movie_from_suggestions_renders_movie_details_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
		SearchPages.clickOnSuggestion();

	}

	@And("^Movie Details page renders top cast$")
	public void movie_details_page_renders_top_cast() {
		// Write code here that turns the phrase above into concrete actions
		DetailsPages.getCastAndCrew();

	}

	@Then("^Movie Details page renders movie plot$")
	public void movie_details_page_renders_movie_plot() {
		// Write code here that turns the phrase above into concrete actions
		DetailsPages.getPlotSummary();

	}

}
