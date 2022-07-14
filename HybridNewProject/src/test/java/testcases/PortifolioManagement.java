package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class PortifolioManagement extends BaseTest
{
	
  @Test
  public void createPortifolio(ITestContext context)
  {
	  String portifolioName = "pff1";
	  
	  app.log("Creating  Portifolio...");
	  app.click("createPortfolio_id");
	  app.clear("porfolioname_id");
	  app.type("porfolioname_id", portifolioName);
	  app.click("createPortfolioButton_css");
	  app.waitForPageToLoad();
	  app.validateSelectedValueInDropDown("portfolioid_dropdown_id", portifolioName);
	  
  }
  
    
  @Test
  public void deletePortifolio()
  {
	  String portifolioName = "pff1";
	  
	  app.log("delete Portifolio");
	  app.selectVisibleText("portfolioid_dropdown_id", portifolioName);
	  app.click("deletePortfolio_id");
	  app.acceptAlert();
	  app.waitForPageToLoad();
	  app.validateSelectedValueNotInDropDown("portfolioid_dropdown_id", portifolioName);
  }
  
  @Test
	public void selectPortFolio(ITestContext context) 
	{
		String portfolioName = "portfoli012345";
		//JSONObject data = (JSONObject)context.getAttribute("data");
		//String portfolioName=(String)data.get("portfolioname");		
		app.log("Selecting Profolio");
		app.selectVisibleText("portfolioid_dropdown_id", portfolioName);
        app.waitForPageToLoad();
	}
  
}
