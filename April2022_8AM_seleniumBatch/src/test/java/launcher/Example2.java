package launcher;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Departure')]")).click();
		
		int i=0;
		List<WebElement> months = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));
		while(i<3)
		{
			WebElement m = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)"+"["+(i+1)+"]"));
			System.out.println(m.getText());
			
			if(!m.getText().contains("August 2022"))
				i++;
			else
				driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
		}
		
		
		/*
		 * System.out.println(months.get(i).getText());
		 * while(!months.get(i).getText().contains("August 2022")) { if(i<3) i++; else
		 * driver.findElement(By.
		 * className("DayPicker-NavButton DayPicker-NavButton--next")).click(); i=1; }
		 */

	}

}
