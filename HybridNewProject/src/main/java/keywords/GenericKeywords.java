package keywords;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;
	public Properties childProp;
	public Properties orProp;
	public WebDriver driver;
	
	public void openBrowser(String browserName)
	{
		System.out.println("Opening Browser : "+ childProp.getProperty(browserName));
		if(childProp.getProperty(browserName).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(childProp.getProperty(browserName).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public void navigate(String url)
	{
		System.out.println("Navigating url : " +  childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}
	
	public void click(String locatorKey)
	{
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey,String textKey)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(textKey));
	}
	
	public void select(String locatorKey,String optionKey)
	{
		getElement(locatorKey).sendKeys(childProp.getProperty(optionKey));
	}
	
	public String getText()
	{
		return null;
		
	}
	
	public  WebElement getElement(String locatorKey) 
	{
		WebElement element = null;
		
		//check for Element Presence
		if(!isElementPresent(locatorKey))
			//report Failure
			System.out.println("Element is not Present:"+ locatorKey);
		
		element = driver.findElement(getLocator(locatorKey));		
		return element;
	}

	public  boolean isElementPresent(String locatorKey) 
	{
		System.out.println("Checking for Element Presence : " +  locatorKey);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		try 
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
		} 
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
	
	public  By getLocator(String locatorKey)
	{
		By by = null;
		
		if(locatorKey.endsWith("_id")) {
			by = By.id(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_name")) {
			by = By.name(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_classname")) {
			by = By.className(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_xpath")) {
			by = By.xpath(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_css")) {
			by = By.cssSelector(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_linktext")) {
			by = By.linkText(orProp.getProperty(locatorKey));
		}else if(locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orProp.getProperty(locatorKey));
		}
		
		return by;
	}

}
