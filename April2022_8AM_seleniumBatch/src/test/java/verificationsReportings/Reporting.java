package verificationsReportings;

import launcher.BaseTest;

public class Reporting extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("Reporting");
		//test.log(Status.INFO,"Init the Properties files....");
		logInfo("Init the Properties files....");
		
		launch("chromebrowser");
		logInfo("Opening the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		logInfo("Navigating to application : " + childProp.getProperty("amazonurl"));
		
		String expectedLink = "Customer Serv";
		
		if(!isLinkEqual(expectedLink))
			reportFailure("Both Links are not equal...");
		else
			reportSuccess("Both Links are equal...");
		
		rep.flush();
	}

	

}
