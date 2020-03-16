package com.stepdefinition;

import com.pages.loginonlyusername;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginwithusername_step {
	loginonlyusername  ob5= new loginonlyusername ();
	
	@Given("^the user launches chromebrowser$")
	public void the_user_launches_chromebrowser() 
	{
		ob5.url();
	    
	}

	@When("^the user opens  Demoblaze website$")
	public void the_user_opens_Demoblaze_website() 
	{
	   ob5.demoblaze_homePage();
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() 
	{
	   ob5.userclick();
	}

	@Then("^the user enters only username and clicks on login$")
	public void the_user_enters_only_username_and_clicks_on_login() throws InterruptedException
	{
	    ob5.usernamepassword("Ramya", "");
	}

}
