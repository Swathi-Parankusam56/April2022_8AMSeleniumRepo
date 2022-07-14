package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ApplicationKeywords extends ValidationKeywords
{
	

	public ApplicationKeywords() throws Exception 
	{
		
		mainProp = new Properties();
		childProp= new Properties();
		orProp = new Properties();
		
		try 
		{
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
			mainProp.load(fis);
			String e = mainProp.getProperty("env");
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
			childProp.load(fis);
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\or.properties");
			orProp.load(fis);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		softAssert = new SoftAssert();
		
	}
	
	
	public void selectDateFromCalendar(String date) 
	{
		log("Selecting Date "+date);
		
		try 
		{
			Date currentDate = new Date();
			Date dateToSel=new SimpleDateFormat("d-MM-yyyy").parse(date);
			String day=new SimpleDateFormat("d").format(dateToSel);
			String month=new SimpleDateFormat("MMMM").format(dateToSel);
			String year=new SimpleDateFormat("yyyy").format(dateToSel);
			String monthYearToBeSelected=month+" "+year;
			String monthYearDisplayed=getElement("monthyear_css").getText();
			
			while(!monthYearToBeSelected.equals(monthYearDisplayed)) {
				click("datebackButoon_xpath");
				monthYearDisplayed=getElement("monthyear_css").getText();
			}
			driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
