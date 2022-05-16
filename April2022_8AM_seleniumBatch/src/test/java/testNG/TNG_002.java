package testNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{
	
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startUp(String bType) throws Exception 
  {
	    init();
		test = rep.createTest("TNG_002");
		test.log(Status.INFO,"Init the Properties files....");
		
		launch(bType);
		test.log(Status.PASS,"Opening the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigating to application : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	    selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selecting option Books By using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.INFO, "Typing text Harry Potter By using Locator : "+ orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.INFO, "Clicked on Element By ussong Locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess()
  {
	  rep.flush();
	  driver.quit();  
  }

}
