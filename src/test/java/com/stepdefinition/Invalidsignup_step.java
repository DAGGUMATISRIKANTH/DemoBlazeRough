package com.stepdefinition;

import com.pages.signupwithinvalid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invalidsignup_step 
{
	signupwithinvalid ob2=new signupwithinvalid();
	@Given("^the user launches the chromebrowser$")
	public void the_user_launches_the_chromebrowser()
	{
		ob2.url();
	}

	@When("^the user opens the Demoblaze application$")
	public void the_user_opens_the_Demoblaze_application() 
	{
	   ob2.demoblaze_homePage();
	}

	@Then("^user clicks on the signup link$")
	public void user_clicks_on_the_signup_link()
	{
	    ob2.signup_click();
	}

	@Then("^the user clicks on signup button with out entering any details$")
	public void the_user_clicks_on_signup_button_with_out_entering_any_details() throws InterruptedException 
	 {
	    ob2.signup_details();
	}

}
