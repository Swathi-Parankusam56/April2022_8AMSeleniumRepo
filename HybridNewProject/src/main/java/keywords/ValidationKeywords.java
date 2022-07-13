package keywords;

import org.openqa.selenium.support.ui.Select;

public class ValidationKeywords extends GenericKeywords
{

	public void validateTitle()
	{
		
	}
	
	public void validateText()
	{
		
	}
	
	public void validateElementsVisible()
	{
		
	}
	
	public void validateSelectedValueInDropDown(String locatorKey, String option) {
		Select s = new Select(getElement(locatorKey));
		String text = s.getFirstSelectedOption().getText();
		if(!text.equals(option)){
			reportFailure("Option"+option+" not present in Drop Down "+locatorKey,true);
		}
		
	}
	
	public void validateSelectedValueNotInDropDown(String locatorKey, String option) {
		Select s = new Select(getElement(locatorKey));
		String text = s.getFirstSelectedOption().getText();
		if(text.equals(option)){
			reportFailure("Option"+option+" present in Drop Down "+locatorKey,true);
		}
		
	}
	
}
