package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	  test.log(Status.INFO, "LoggingIN....");
	  app.openBrowser("chromebrowser");
	  app.navigate("rediffurl");
	  app.click("myprotifolio_linktext");
	  app.type("usermail_id", "rediffuser");
	  //failure
	  app.reportFailure("Test is incorrect",true);
	  app.type("userpassword_id", "rediffpassword");
	  app.click("loginsubmit_id");
	  app.assertAll();
  }
  
  @Test
  public void doLogout() 
  {
	  
	  test.log(Status.INFO, "LoggingOut....");
  }
  
}
