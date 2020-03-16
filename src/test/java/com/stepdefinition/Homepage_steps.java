package com.stepdefinition;

import com.pages.Navigatetohomepage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Homepage_steps {
	Navigatetohomepage nh = new Navigatetohomepage();
	@Given("^user opens the demoblazeApplication site in the browser$")
	public void user_opens_the_demoblazeApplication_site_in_the_browser() {
	   nh.url();
	}

	@When("^user clicks on the Aboutus$")
	public void user_clicks_on_the_Aboutus() throws InterruptedException {
	    nh.Scrollby();
	}

	@When("^the user will navigate to homepage$")
	public void the_user_will_navigate_to_homepage()  {
	    nh.home();
	}

}
