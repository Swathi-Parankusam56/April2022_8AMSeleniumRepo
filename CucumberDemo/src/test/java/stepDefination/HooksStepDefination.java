package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefination 
{
	
	@Before("@s2")
	public void startProcess()
	{
		System.out.println("Open chromeBrowser");
		System.out.println("Navigate to amazon url ");
		System.out.println("Initialize the excel instances...");
		System.out.println("Initialize the reports..");
	}
	
	@After("@s2")
	public void endProcess()
	{
		System.out.println("Kill the excel files");
		System.out.println("Flush the reports");
		System.out.println("Close the browser");
	}
	
	@Before("@s1")
	public void befores()
	{
		System.out.println("befores");
	}
	
	@After("@s1")
	public void afters()
	{
		System.out.println("afters");
	}
	
	@Given("user should ne on login page")
	public void user_should_ne_on_login_page() {
	    System.out.println("Given : User should ne on login page");
	}

	@When("user fills username  and password")
	public void user_fills_username_and_password() {
	    System.out.println("When : User fills username  and password");
	}

	@When("clicks on SignIn button")
	public void clicks_on_SignIn_button() {
	    System.out.println("When :  Clicks on SignIn button");
	}

	@Then("user is navigated to the main page")
	public void user_is_navigated_to_the_main_page() {
	   System.out.println("Then :  User is navigated to the main page");
	}

	@Given("user is on product page")
	public void user_is_on_product_page() {
	    System.out.println("Given :  User is on product page");
	}

	@When("user shoud selects the product")
	public void user_shoud_selects_the_product() {
	    System.out.println("When :  user shoud selects the product");
	}

	@Then("product should add to kart page")
	public void product_should_add_to_kart_page() {
	    System.out.println("Then :  : Product should add to kart page");
	}


}
