package com.stepdefinition;

import com.pages.Clickingonphones;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Clickingonphones_steps {
	Clickingonphones cp = new Clickingonphones();
	
	@Given("^user opens the demoblazeApplication site$")
	public void user_opens_the_demoblazeApplication_site()  {
	  cp.demoblaze_homePage();
	}

	@When("^the user clicks the phonesLink under catagories$")
	public void the_user_clicks_the_phonesLink_under_catagories()  {
	   cp.phones();
	}

	@Then("^the user select the particular phone$")
	public void the_user_select_the_particular_phone()  {
	   cp.selectphone();
	}

	@Then("^product will be added to the cart$")
	public void product_will_be_added_to_the_cart() throws InterruptedException  {
	 cp.addtocart();   
	}

	@Then("^place the order$")
	public void place_the_order() throws InterruptedException  {
		cp.placeorder();
	    
	}

}
