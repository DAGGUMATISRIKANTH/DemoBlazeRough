package com.stepdefinition;

import com.pages.Navigatetopreviouspage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Navigatetooreviouspage_step {
	Navigatetopreviouspage  np = new Navigatetopreviouspage();
	@Given("^user opens the demoblazeApplication site in browser$")
	public void user_opens_the_demoblazeApplication_site_in_browser() {
	   np.url();
	}

	@When("^the user clicks on the nextpage$")
	public void the_user_clicks_on_the_nextpage() throws InterruptedException{
	    np.Scrollby();
	}

	@Then("^the user clicks on previous page$")
	public void the_user_clicks_on_previous_page() {
		np.previous();
	    
	}
}
