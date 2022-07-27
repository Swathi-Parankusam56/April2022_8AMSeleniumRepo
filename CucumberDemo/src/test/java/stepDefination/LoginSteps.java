package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{

		
	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
	    System.out.println("User is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
	    System.out.println("user enters username and password");
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() 
	{
	    System.out.println("Clicks on login button");
	}

	@Then("User is naviaged to Home Page")
	public void user_is_naviaged_to_home_page() 
	{
	    System.out.println("User is naviaged to Home Page");
	}
	
}
