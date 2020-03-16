package com.stepdefinition;

import com.pages.loginwithvalid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginvalid_step 
{
	loginwithvalid ob3=new loginwithvalid();
	@Given("^the user launched Browser$")
	public void the_user_launched_Browser() 
	{
	   ob3.url();
	}

	@When("^the user open the Demoblaze Application in chromebrowser$")
	public void the_user_open_the_Demoblaze_Application_in_chromebrowser()
	{
	   ob3.demoblaze_homePage();
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
	   ob3.userclick();
	}

	@Then("^the user enters the username and password clicks on login button$")
	public void the_user_enters_the_username_and_password_clicks_on_login_button() 
	{
	    ob3.usernamepassword("Ramya", "ramya");
	}
}
