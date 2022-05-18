package testnNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertDemo 
{
	
  @Test
  public void f() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  
	  String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon";
	  String actualTitle = driver.getTitle();
	  
	  //Assert.assertEquals(actualTitle, expectedTitle);
	  Assert.assertTrue(actualTitle.equals(expectedTitle), "Both titles are not equal...");
	  
	  driver.findElement(By.linkText("Customer Service")).click();
  }
}
