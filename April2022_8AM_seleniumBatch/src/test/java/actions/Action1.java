package actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		Actions a = new Actions(driver);
		WebElement loc = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		a.moveToElement(loc).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Your Account')]")).click();

	}

}
