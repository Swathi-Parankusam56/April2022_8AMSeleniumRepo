package pom;

import org.testng.annotations.Test;

import launcher.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 extends BaseTest
{
	CustomerLogin obj;
	
  @Test
  public void f() 
  {
	   obj = new CustomerLogin(driver);
	   obj.customerLogin();
	   Assert.assertEquals(obj.loginVerification(), "Authentication failed.");
  }
  
  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	    init();
		launch("chromebrowser");
		navigateUrl("automationurl"); 
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
