package testcases;

import org.apache.commons.collections4.iterators.SkippingIterator;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeywords;
import reportings.ExtentManager;

// acceptable Failure, Critical Failure, Unexpected Failure

public class BaseTest 
{
	public ApplicationKeywords app; 
	public ExtentReports rep;
	public ExtentTest test;
	
	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{
		System.out.println("beforeTest");
		app = new ApplicationKeywords();
		context.setAttribute("app", app);
		
		//init the reporting for the Test
		rep = ExtentManager.getReports();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		
		app.setReport(test);
		context.setAttribute("rep", rep);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("beforeTest");
		String criticalFailure = (String) context.getAttribute("criticalFailure");
		if(criticalFailure!=null && criticalFailure.equals("Y"))
		{
			test.log(Status.SKIP, "Critical failure in Previous Test");
			throw new SkipException("Critical failure in Previous Test");
		}
		
		app = (ApplicationKeywords)context.getAttribute("app");
		rep = (ExtentReports)context.getAttribute("rep");
		test = (ExtentTest)context.getAttribute("test");

	}
	
	@AfterTest
	public void quit()
	{
		if(rep!=null)
			rep.flush();
	}
}
