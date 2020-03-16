package com.stepdefinition;

import com.pages.loginwithinvalid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logininvalid_step
{
	loginwithinvalid ob4=new loginwithinvalid();
	@Given("^the user launched chromebrowser$")
	public void the_user_launched_chromebrowser()  
	{
	    ob4.url();
	}

	@When("^the user open  Demoblaze website$")
	public void the_user_open_Demoblaze_website() 
	{
	 ob4.demoblaze_homePage();
	}

	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() 
	{
		ob4.userclick();
	    
	}

	@Then("^the user enters invalid  username and password clicks on login button$")
	public void the_user_enters_invalid_username_and_password_clicks_on_login_button() throws InterruptedException 
	{
		ob4.usernamepassword("Ramya", "anjali");
	    
	}
}
