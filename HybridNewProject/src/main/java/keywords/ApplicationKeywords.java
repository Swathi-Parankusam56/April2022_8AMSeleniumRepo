package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

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
		
		
	}
	
	

	public void login() 
	{
		
	}
	
	public void selectDatefromcalander()
	{
		
	}
	
}
