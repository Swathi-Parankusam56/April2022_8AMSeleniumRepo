package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoStepDefenition 
{
	WebDriver driver;
	
	@Given("navigate the browser")
	public void navigate_the_browser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("customer is on login page")
	public void customer_is_on_login_page()
	{
		driver.get("https://example.testproject.io/web/");
	}
	
	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password()
	{
		driver.findElement(By.id("name")).sendKeys("ravilella");
		driver.findElement(By.id("password")).sendKeys("12345");
	}
	
	@And("user should click on login")
	public void user_should_click_on_login()
	{
		driver.findElement(By.id("login")).click();
	}
	
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page()
	{
		driver.findElement(By.xpath("//div[@id='pageLogin']/h1[contains(text(),'TestProject Example page')]")).isDisplayed();
		
		//driver.quit();
	}
}
