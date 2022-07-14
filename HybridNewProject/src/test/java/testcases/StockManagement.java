package testcases;

import org.testng.annotations.Test;

public class StockManagement extends BaseTest
{
	
  @Test
  public void addStock() 
  {
	    
	    String companyName = "Birla Corporation Ltd";
		String selectionDate = "4-7-2021";
		String stockQuantity="100";
		String stockPrice="200";
		
		app.log("Adding "+stockQuantity+" stocks of  "+ companyName);
		
		app.click("addStock_id");
		app.type("addstockname_css", companyName);
		app.wait(1);
		app.clickEnterButton("addstockname_css");
		app.click("stockPurchaseDate_id");
		app.selectDateFromCalendar(selectionDate);
		
		app.type("addstockqty_id", stockQuantity);
		app.type("addstockprice_id", stockPrice);
		app.click("addStockButton_id");
		app.waitForPageToLoad();
		app.log("Stocks added successfully ");
  }
  
  @Test
  public void modifiyStock() 
  {
	  System.out.println("modifiyStock");
  }
  
  @Test
  public void deleteStock() 
  {
	  System.out.println("deleteStock");
  }
  
  @Test
  public void verifyStock() 
  {
	  System.out.println("verifyStock");
  }
  
}
