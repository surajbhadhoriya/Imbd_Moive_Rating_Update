package com.qait.Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.GetPage;

public class searchPage extends GetPage {


	public searchPage(WebDriver driver) {

		super(driver, "moviePage");
	}
	
	
	public void clickOnButton() {
		element("dropdown").click();
	}

	public void selectTitle() {
		element("title").click();
	}

	public void enterMovieName(String name) {

		element("search").sendKeys(name);

	}

	public void clickOnSuggestion() {
		element("suggestionClick").click();
	}

}
