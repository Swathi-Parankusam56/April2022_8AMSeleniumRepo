package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLogin 
{
	@FindBy(linkText="Sign in") WebElement signIn;
	@FindBy(id="email") WebElement customerEmail;
	@FindBy(id="passwd") WebElement customerPassword;
	@FindBy(id="SubmitLogin") WebElement submitLogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]") WebElement loginErr;
	
	public CustomerLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
	{
		signIn.click();
		customerEmail.sendKeys("qatest8374837@gmail.com");
		customerPassword.sendKeys("password");
		submitLogin.click();
	}
	
	public String loginVerification()
	{
		return loginErr.getText();
	}
}
