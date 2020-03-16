package com.stepdefinition;

import com.pages.Aboutus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Aboutus_steps {
	Aboutus  au = new Aboutus();
	@Given("^user opens the demoblazeApplication in  chromebrowser$")
	public void user_opens_the_demoblazeApplication_in_chromebrowser()  {
	    au.url();
	}

	@When("^the user clicks on the Aboutus link$")
	public void the_user_clicks_on_the_Aboutus_link()  {
	   au.about();
	}

	@Then("^the user clicks on any link$")
	public void the_user_clicks_on_any_link()  {
	    au.link();
	}

	@Then("^user takes the screenshot closes that window$")
	public void user_takes_the_screenshot_closes_that_window()  {
	    au.close();
}
}