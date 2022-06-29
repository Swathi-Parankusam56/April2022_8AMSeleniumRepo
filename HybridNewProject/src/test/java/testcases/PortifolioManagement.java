package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PortifolioManagement extends BaseTest
{
	
  @Test
  public void createPortifolio(ITestContext context)
  {
	  context.getAttribute("test");
	  test.log(Status.INFO, "createPortifolio");
	  //report
	  app.reportFailure("Some non critical failures",false);
	  app.assertAll();
  }
  
  @Test
  public void modifyPortifolio()
  {
	  System.out.println("modifyPortifolio");
  }
  
  @Test
  public void deletePortifolio()
  {
	  System.out.println("deletePortifolio");
  }
  
}
