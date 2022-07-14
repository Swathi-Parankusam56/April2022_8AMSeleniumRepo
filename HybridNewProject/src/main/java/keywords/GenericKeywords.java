package keywords;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	
	public String projectPath = System.getProperty("user.dir");
	public FileInputStream fis;
	public Properties mainProp;
	public Properties childProp;
	public Properties orProp;
	public WebDriver driver;
	public ExtentTest test;
	public SoftAssert softAssert;
	
	public void openBrowser(String browserName)
	{
		System.out.println("Opening Browser : "+ childProp.getProperty(browserName));
		//test.log(Status.INFO, "Opening Browser : "+ childProp.getProperty(browserName));
		log("Opening Browser : "+ childProp.getProperty(browserName));
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
		//test.log(Status.INFO, "Navigating url : " +  childProp.getProperty(url));
		log("Navigating url : " +  childProp.getProperty(url));
		driver.get(childProp.getProperty(url));
	}
	
	public void click(String locatorKey)
	{
		//test.log(Status.INFO, "Clicking on element by using locator :"+ orProp.getProperty(locatorKey));
		log("Clicking on element by using locator :"+ orProp.getProperty(locatorKey));
		getElement(locatorKey).click();
	}
	
	public void clickEnterButton(String locatorKey) {
		log("Clinking enter button");
		getElement(locatorKey).sendKeys(Keys.ENTER);
	}
	
	public void type(String locatorKey,String textKey)
	{
		//test.log(Status.INFO, "Entered the text by using locator :"+ orProp.getProperty(locatorKey));
		log("Entered the text by using locator :"+ orProp.getProperty(locatorKey));
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
		   reportFailure("Element is not Present: "+locatorKey,true);
		
		element = driver.findElement(getLocator(locatorKey));		
		return element;
	}

	public  boolean isElementPresent(String locatorKey) 
	{
		System.out.println("Checking for Element Presence : " +  locatorKey);
		//test.log(Status.INFO, "Checking for Element Presence : " +  locatorKey);
		log("Checking for Element Presence : " +  locatorKey);
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
	
	public void setReport(ExtentTest test)
	{
		this.test=test;
	}
	
	//Reporting Function
	public void log(String msg)
	{
		test.log(Status.INFO, msg);
	}
	
	//Report Faiure
	public void reportFailure(String failureMsg,boolean stopOnFailure)
	{
		softAssert.fail(failureMsg); // Failure msg in TESTNG
		test.log(Status.FAIL, failureMsg); // Failure msg in Extent Reports
		
		if(stopOnFailure)
			assertAll();
	}
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
		softAssert.assertAll();
	}
	
	public void clear(String locatorKey) {
		log("Clearing text field "+ locatorKey);
		getElement(locatorKey).clear();
	}
	
	public void selectVisibleText(String locatorKey,String data)
	{
		Select s = new Select(getElement(locatorKey));
		s.selectByVisibleText(data);
	}
	
	public void acceptAlert()
	{
		test.log(Status.INFO, "Switching to alert");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		try{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			test.log(Status.INFO, "Alert accepted successfully");
		}catch(Exception e){
				reportFailure("Alert not found when mandatory",true);
		}
		
	}
	
	public void waitForPageToLoad()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		// ajax status
		while(i!=10)
		{
		String state = (String)js.executeScript("return document.readyState;");
		System.out.println(state);

		if(state.equals("complete"))
			break;
		else
			wait(2);

		i++;
		}
		// check for jquery status
		i=0;
		while(i!=10)
		{
			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue() == 0 )
			 	break;
			else
				 wait(2);
			 i++;
				
			}
		
		}
	
	public void wait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
