package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleStepDefination 
{
	WebDriver driver;
	
	@Given("open the browser")
	public void open_the_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@And("user should be on google search page")
	public void user_should_be_on_google_search_page()
	{
		driver.get("https://www.google.com");
	}
	
	@When("user enter a test in search box")
	public void user_enter_a_test_in_search_box()
	{
		driver.findElement(By.name("q")).sendKeys("hadoop");
	}
	
	@And("hit Enter")
	public void hit_Enter()
	{
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Then("user is navigated to searchresults page")
	public void user_is_navigated_to_searchresults_page()
	{
		driver.getPageSource().contains("Apache Hadoop");
		
		//driver.quit();
	}

}
