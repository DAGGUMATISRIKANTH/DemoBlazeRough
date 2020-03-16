package com.stepdefinition;

import com.pages.signupwithvalid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class validsignup_step
{
	signupwithvalid ob1=new signupwithvalid();
	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser()
	{
	    ob1.url();
	}

	@When("^the user open the Demoblaze website$")
	public void the_user_open_the_Demoblaze_website() 
	{
		ob1.demoblaze_homePage();
	}

	@Then("^user clicks on signup link$")
	public void user_clicks_on_signup_link() 
	{
		ob1.signup_click();
	}

	@Then("^the user enters the username and password clicks on signup button$")
	public void the_user_enters_the_username_and_password_clicks_on_signup_button() throws InterruptedException 
	{
	   ob1.signup_details();
	}

}
